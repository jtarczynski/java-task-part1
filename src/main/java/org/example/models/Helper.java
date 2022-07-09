package org.example.models;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.example.exception.AppException;
import org.example.exception.Error;

import java.time.LocalDateTime;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class Helper {


    public static void serve(Student student, String roomNumber, int hour) {
        Room room = null;
        try {
            room = Room.valueOf(roomNumber);
        } catch (IllegalArgumentException ex) {
            throw new AppException(Error.ROOM_NOT_FOUND);
        }
        if (!student.studyType.getRooms().contains(room)) {
            throw new AppException(Error.INCORRECT_ROOM);
        } else if (!room.checkHour(hour)) {
            throw new AppException(Error.CLOSED_HOURS);
        }
    }

    /*
    TODO > Proper formatting
     */

    public static String generateRaport(Student student) {
        return "--------------------------------------------------------------------" +
                "\n" +
                String.format("%" + 20 + "s", " ") +
                "STUDENT" + student.getStudentId() + "\n" +
                "\n" +
                "First Name" + String.format("%" + 5 + "s", " ") +
                "|" + String.format("%" + 3 + "s", " ") + student.firstName +
                String.format("%" + 10 + "s", " ") +
                LocalDateTime.now();
    }
}
