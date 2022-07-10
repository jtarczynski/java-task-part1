package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.models.HoursRange;

import java.util.Random;

@AllArgsConstructor
@Getter
public enum Room {
    A123(new HoursRange(8, 16)),
    B123(new HoursRange(9, 17)),
    C124(new HoursRange(9, 13)),
    D124(new HoursRange(17, 20));

    private final HoursRange hoursRange;

    public boolean checkHour(int hour) {
        return hoursRange.getOpen_hour() <= hour && hoursRange.getClose_hour() >= hour;
    }

    public static String randomEnumValue() {
        return Room.values()[new Random().nextInt(Room.values().length)].toString();
    }
}
