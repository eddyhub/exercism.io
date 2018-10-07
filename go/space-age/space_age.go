package space

type Planet string;

var orbitalPeriods map[Planet]float64

const EARTH_ORBITAL_PERIOD_IN_SECONDS float64 = 31557600

func init() {
	orbitalPeriods = map[Planet]float64{
		"Earth":   EARTH_ORBITAL_PERIOD_IN_SECONDS,
		"Mercury": EARTH_ORBITAL_PERIOD_IN_SECONDS * 0.2408467,
		"Venus":   EARTH_ORBITAL_PERIOD_IN_SECONDS * 0.61519726,
		"Mars":    EARTH_ORBITAL_PERIOD_IN_SECONDS * 1.8808158,
		"Jupiter": EARTH_ORBITAL_PERIOD_IN_SECONDS * 11.862615,
		"Saturn":  EARTH_ORBITAL_PERIOD_IN_SECONDS * 29.447498,
		"Uranus":  EARTH_ORBITAL_PERIOD_IN_SECONDS * 84.016846,
		"Neptune": EARTH_ORBITAL_PERIOD_IN_SECONDS * 164.79132,
	}
}

func Age(seconds float64, planet Planet) float64 {
	return seconds/orbitalPeriods[planet]
}