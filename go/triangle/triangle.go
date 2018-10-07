// This package determines if a triangle is equilateral, isosceles, or scalene.
package triangle

import "math"

type Kind int

const (
	NaT = iota // not a triangle
	Equ        // equilateral
	Iso        // isosceles
	Sca        // scalene
)

// Determines the triangle type.
func KindFromSides(a, b, c float64) Kind {
	if math.IsNaN(a+b+c) || math.IsInf(a+b+c, 0) ||
		a+b+c == 0 || a+b < c || a+c < b || b+c < a {
		return NaT
	} else if a == b && b == c {
		return Equ
	} else if a == b || a == c || b == c {
		return Iso
	}
	return Sca;
}
