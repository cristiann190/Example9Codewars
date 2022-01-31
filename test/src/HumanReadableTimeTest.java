package src;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HumanReadableTimeTest {
    @Test
    public void showZeroSeconds() {
        assertEquals("00:00:00", new HumanReadableTime().makeReadable(0));
    }

    @Test
    public void showFiveSeconds() {
        assertEquals("00:00:05", new HumanReadableTime().makeReadable(5));
    }

    @Test
    public void showMinute() {
        assertEquals("00:01:00", new HumanReadableTime().makeReadable(60));
    }

    @Test
    public void showHour() {
        assertEquals("01:00:00", new HumanReadableTime().makeReadable(3600));
    }

    @Test
    public void showDay() {
        assertEquals("23:59:59", new HumanReadableTime().makeReadable(86399));
    }

    @Test
    public void showBigDate() {
        assertEquals("99:59:59", new HumanReadableTime().makeReadable(359999));
    }
}