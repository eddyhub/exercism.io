// Solution to the side exercise proverb
package proverb

import "fmt"

func Proverb(rhyme []string) []string {
	length := len(rhyme)
	result := make([]string, length)
	if length > 0 {
		for i := 0; i < length-1; i++ {
			result[i] = fmt.Sprintf("For want of a %s the %s was lost.", rhyme[i], rhyme[i+1])
		}
		result[length-1] = fmt.Sprintf("And all for the want of a %s.", rhyme[0])
	}
	return result
}
