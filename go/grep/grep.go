package grep

import (
	"bufio"
	"log"
	"os"
	"regexp"
	"strconv"
)

const (
	caseInsensitiveFlag    = "(?i)"
	lineBegin              = "^"
	lineEnd                = "$"
)

// Search returns lines matching the provided pattern and flags
func Search(pattern string, flags []string, files []string) []string {
	var printOnlyFileMatches, printLineNumbers, invertMatch bool
	result := make([]string, 0)

	for _, flag := range flags {
		switch flag {
		case "-i":
			// -i Match line using a case-insensitive comparison.
			pattern = caseInsensitiveFlag + pattern
		case "-x":
			// -x Only match entire lines, instead of lines that contain a match.
			pattern = lineBegin + pattern + lineEnd
		case "-v":
			// -v Invert the program -- collect all lines that fail to match the pattern.
			invertMatch = true
		case "-l":
			// -l Print only the names of files that contain at least one matching line.
			printOnlyFileMatches = true
		case "-n":
			// -n Print the line numbers of each matching line.
			printLineNumbers = true
		}
	}

	regexp := regexp.MustCompile(pattern)
	for _, v := range files {
		file, err := os.Open(v)
		if err != nil {
			log.Fatal("Could not read file " + v)
			log.Fatal(err)
		}
		scanner := bufio.NewScanner(bufio.NewReader(file))
		line := 1
		shouldFileNameInserted := len(files) > 1
		for scanner.Scan() {
			text := scanner.Text()
			matchFound := regexp.MatchString(text)
			if invertMatch {
				matchFound = !matchFound
			}
			if matchFound {
				if printOnlyFileMatches {
					result = append(result, v)
					break
				}
				if printLineNumbers {
					text =  strconv.Itoa(line) + ":" + text
				}
				if shouldFileNameInserted {
					text = v + ":" + text
				}
				result = append(result, text)
			}
			line++
		}
	}
	return result
}
