package strand

import "strings"

func getNuleotideCompliment(nucleotide rune) string {
	switch nucleotide {
	case 71:
		return "C"
	case 67:
		return "G"
	case 84:
		return "A"
	case 65:
		return "U"
	}
	return ""
}

func ToRNA(dna string) string {
	result := strings.Builder{}
	for _, nucleotide := range dna {
		result.WriteString(getNuleotideCompliment(nucleotide))
	}
	return result.String()
}