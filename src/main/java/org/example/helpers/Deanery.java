package org.example.helpers;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.example.exception.AppException;
import org.example.exception.Error;
import org.example.models.Room;
import org.example.models.Student;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class Deanery {

    public static String serve(Student student, String roomNumber, int hour) {
        validateRoom(student, roomNumber, hour);
        return generateReport(student, roomNumber);
    }

    private static void validateRoom(Student student, String roomNumber, int hour) {
        Room room;
        try {
            room = Room.valueOf(roomNumber);
        } catch (IllegalArgumentException ex) {
            throw new AppException(Error.ROOM_NOT_FOUND);
        }

        if (!student.getStudyType().getRooms().contains(room)) {
            throw new AppException(Error.INCORRECT_ROOM);
        } else if (!room.checkHour(hour)) {
            throw new AppException(Error.CLOSED_HOURS);
        }
    }

    private static String generateReport(Student student, String roomNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        generateHeader(stringBuilder, student);
        generateNames(stringBuilder, student);
        generateFooter(stringBuilder, roomNumber);
        return stringBuilder.toString();
    }

    private static void generateHeader(StringBuilder stringBuilder, Student student) {
        stringBuilder
                .append("--------------------------------------------------------------------" + "\n")
                .append(String.format("%19s", " ")).append("STUDENT ")
                .append(student.getStudentId()).append("\n").append("\n");
    }

    private static void generateNames(StringBuilder stringBuilder, Student student) {
        stringBuilder
                .append("First Name")
                .append(String.format("%14s", " "))
                .append("|")
                .append(String.format("%3s", " "))
                .append(String.format("%-20s", student.getFirstName()))
                .append("|").append("\n").append("Second Name")
                .append(String.format("%13s", " ")).append("|")
                .append(String.format("%3s", " "))
                .append(String.format("%-20s", student.getSecondName()))
                .append("|")
                .append("\n")
                .append("\n");
    }

    private static void generateFooter(StringBuilder stringBuilder, String roomNumber) {
        stringBuilder
                .append("Raport generated on ")
                .append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")))
                .append("\n")
                .append("Room number: ")
                .append(roomNumber);
    }
}
