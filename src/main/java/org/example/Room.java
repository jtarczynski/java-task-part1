package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Room {
    A123(new HoursRange(8, 16)),
    B123(new HoursRange(9, 17)),
    C124(new HoursRange(9, 13)),
    D124(new HoursRange(17, 20));

    private final HoursRange hoursRange;

}
