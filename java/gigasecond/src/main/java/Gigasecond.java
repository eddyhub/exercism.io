import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

class Gigasecond {
    private LocalDateTime localDateTime;

    Gigasecond(LocalDate birthDate) {
        this(LocalDateTime.of(birthDate, LocalTime.MIDNIGHT));
    }

    Gigasecond(LocalDateTime birthDateTime) {
        localDateTime = birthDateTime.plus(1000000000L, ChronoUnit.SECONDS);
    }

    LocalDateTime getDate() {
        return localDateTime;
    }

}
