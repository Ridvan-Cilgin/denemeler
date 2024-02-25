package enumtest;

import java.util.stream.Stream;

public enum DaysOfWeekEnum1 {

    SUNDAY("off"),
    MONDAY("working"),
    TUESDAY("working"),
    WEDNESDAY("working"),
    THURSDAY("working"),
    FRIDAY("working"),
    SATURDAY("off");

    private String typeOfDay;

    DaysOfWeekEnum1(String typeOfDay) {
        this.typeOfDay = typeOfDay;
    }

    public String getTypeOfDay() {
        return typeOfDay;
    }
// standard getters and setters

    public static Stream<DaysOfWeekEnum1> stream() {
        return Stream.of(DaysOfWeekEnum1.values());
    }
}
