package casting;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DateToLocalDateTİmeTest {

    /**
     * should return null when the input Date object is null
     */
    @Test
    public void convertToLocalDateTimeViaInstantWithNullInput() {
        Date date = null;
        assertNull(DateToLocalDateTİme.convertToLocalDateTimeViaInstant(date));
    }

    /**
     * should convert a given Date object to LocalDateTime using system default time zone
     */
    @Test
    public void convertToLocalDateTimeViaInstantWithSystemDefaultTimeZone() {
        Date date = new Date();
        LocalDateTime localDateTime = DateToLocalDateTİme.convertToLocalDateTimeViaInstant(date);
        assertEquals(localDateTime.getYear(), LocalDateTime.now().getYear());
        assertEquals(localDateTime.getMonth(), LocalDateTime.now().getMonth());
        assertEquals(localDateTime.getDayOfMonth(), LocalDateTime.now().getDayOfMonth());
        assertEquals(localDateTime.getHour(), LocalDateTime.now().getHour());
        assertEquals(localDateTime.getMinute(), LocalDateTime.now().getMinute());
        assertEquals(localDateTime.getSecond(), LocalDateTime.now().getSecond());
    }
}