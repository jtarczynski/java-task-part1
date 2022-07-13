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

    private final List<Room> rooms; //TODO if the rooms are unique, a Set would be better here

    /* I thought about using HashSet here of pairs HoursRange-RoomID(String).
       There would be no need for Room class, but it would be less readable, so I
       choose another solution.
       //TODO I think using the enum for Room is the good approach too - I also had that in mind
     */
}
