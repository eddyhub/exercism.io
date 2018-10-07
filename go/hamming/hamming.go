package hamming

import "errors"

// Calculate the Hamming difference between two DNA strands.
func Distance(a, b string) (int, error) {
	distance := 0

	// Quick exit if sequences do not have equal length.
	if len(a) != len(b) {
		return -1, errors.New(" Length of sequences not equal.")
	}

	// Compare strings and calculate the Hamming distance
	for i := range a {
		if a[i] != b[i] { distance++ }
	}
	return distance, nil
}
