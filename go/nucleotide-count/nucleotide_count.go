package dna

import "errors"

// Histogram is a mapping from nucleotide to its count in given DNA.
type Histogram map[rune]int

// DNA is a list of nucleotides. Choose a suitable data type.
type DNA string

// Counts returns a histogram of the dna
func (dna DNA) Counts() (Histogram, error) {
	histogram := Histogram{'A': 0, 'C': 0, 'G': 0, 'T': 0}
	for _, v := range dna {
		if v != 'A' && v != 'C' && v != 'G' && v != 'T' {
			return histogram, errors.New("strand with invalid nucleotides")
		}
		histogram[v]++
	}
	return histogram, nil
}
