// Calculate the moment when someone has lived for 10^9 seconds.
package gigasecond

// import path for the time package from the standard library
import "time"

const (
	Gigasecond = time.Second * 1e9
)

// Adds a gigasecond to the provided time
func AddGigasecond(t time.Time) time.Time {
	return t.Add(Gigasecond)
}
