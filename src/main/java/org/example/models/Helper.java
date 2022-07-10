package org.example.models;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.example.exception.AppException;
import org.example.exception.Error;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

    public static String generateRaport(Student student, String roomNumber) {
        return "--------------------------------------------------------------------" +
                "\n" +
                String.format("%19s", " ") + "STUDENT " + student.getStudentId() +
                "\n" + "\n" +
                "First Name" + String.format("%14s", " ") + "|" +
                String.format("%3s", " ") +
                String.format("%-20s", student.firstName) + "|" + "\n" +
                "Second Name" + String.format("%13s", " ") + "|" +
                String.format("%3s", " ") +
                String.format("%-20s", student.secondName) + "|" +
                "\n" + "\n" +
                "Raport generated on " +
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")) +
                "\n" +
                "Room number: " + roomNumber;
    }
}
