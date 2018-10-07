// Bob is a lackadaisical teenager. In conversation, his responses are very limited.
package bob

import (
	"regexp"
)

type response struct {
	regex   *regexp.Regexp
	respone string
}

var responses = []response{
	{regexp.MustCompile("^[A-Z][A-Z ]+[?]$"), "Calm down, I know what I'm doing!"}, // Yell question
	{regexp.MustCompile("[a-zA-Z0-9 ,]+\\?[ ]*$"), "Sure."},                        // Question
	{regexp.MustCompile("[A-Z0-9][A-Z0-9 ]+.*[A-Z0-1]!?$"), "Whoa, chill out!"},    // Yell
	{regexp.MustCompile("^[ \t\n\r]*$"), "Fine. Be that way!"},                     // Say nothing
}

// say something to bob
func Hey(remark string) string {
	for _, v := range responses {
		if v.regex.MatchString(remark) {
			return v.respone
		}
	}
	return "Whatever."
}
