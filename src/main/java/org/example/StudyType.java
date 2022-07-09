package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public enum StudyType {

    FULL_TIME(List.of(Room.A123, Room.B123)),
    PART_TIME(List.of(Room.C124, Room.D124));

    private final List<Room> room;
}
