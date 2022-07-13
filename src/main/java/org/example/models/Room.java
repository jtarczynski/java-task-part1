package org.example.models;

import lombok.*;

import java.util.Random;

@AllArgsConstructor
@Getter
public enum Room {
    A123(new HoursRange(8, 16)), //TODO I think it could also be done without the extra HoursRange class -> just an enum with two variables - but this approach is good too
    B123(new HoursRange(9, 17)),
    C124(new HoursRange(9, 13)),
    D124(new HoursRange(17, 20));

    @AllArgsConstructor
    @Setter
    @Getter
    @EqualsAndHashCode
    @ToString
    private static class HoursRange {
        int open_hour;
        int close_hour;
    }

    private final HoursRange hoursRange;

    public boolean checkHour(int hour) {
        return hoursRange.getOpen_hour() <= hour && hoursRange.getClose_hour() >= hour;
    }

    public static String randomEnumValue() {
        return Room.values()[new Random().nextInt(Room.values().length)].toString();
    }
}
