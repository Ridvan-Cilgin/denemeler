package nullcheck;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class ObjectMapperWithNullCheckTest {

    /**
     * Should return the response with the same id as entity
     */
    @Test
    public void mainShouldReturnTheResponseWithTheSameIdAsEntity() {
        Date input = new Date();

        Date date1 =
                Date.from(
                        LocalDate.ofInstant(input.toInstant(), ZoneId.systemDefault())
                                .plusDays(1)
                                .atStartOfDay(ZoneId.systemDefault())
                                .toInstant());

        Date date6 =
                Date.from(
                        LocalDate.ofInstant(input.toInstant(), ZoneId.systemDefault())
                                .plusDays(6)
                                .atStartOfDay(ZoneId.systemDefault())
                                .toInstant());

        Date date8 =
                Date.from(
                        LocalDate.ofInstant(input.toInstant(), ZoneId.systemDefault())
                                .plusDays(8)
                                .atStartOfDay(ZoneId.systemDefault())
                                .toInstant());

        Date date12 =
                Date.from(
                        LocalDate.ofInstant(input.toInstant(), ZoneId.systemDefault())
                                .plusDays(12)
                                .atStartOfDay(ZoneId.systemDefault())
                                .toInstant());

        LocalDateTime lt = java.time.LocalDateTime.now();
    }
}