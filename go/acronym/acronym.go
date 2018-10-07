// Solves the side exercise _acronym_
package acronym

import (
	"regexp"
	"strings"
)

// regex to find the first letters
var firstLetters *regexp.Regexp = regexp.MustCompile("(\\b[[:alpha:]])")

// Convert a phrase to its acronym.
func Abbreviate(s string) string {
	// find the first letters, join these and set all to uppercase
	return strings.ToUpper(strings.Join(firstLetters.FindAllString(s, -1), ""))
}
