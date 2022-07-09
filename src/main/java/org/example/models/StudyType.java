package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.models.Room;

import java.util.List;

@AllArgsConstructor
@Getter
public enum StudyType {

    FULL_TIME(List.of(Room.A123, Room.B123)),
    PART_TIME(List.of(Room.C124, Room.D124));

    private final List<Room> rooms;

    /* I thought about using HashSet here of pairs HoursRange-RoomID(String).
       There would be no need for Room class, but it would be less readable, so I
       choose another solution.
     */
}
