import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    private LocalDateTime dateTime;

    Gigasecond(LocalDate date) {
        this.dateTime = date.atStartOfDay().plusSeconds(1_000_000_000);
    }

    Gigasecond(LocalDateTime dateTime) {
        this.dateTime = dateTime.plusSeconds(1_000_000_000);
    }

    LocalDateTime getDateTime() {
        return dateTime;
    }
}