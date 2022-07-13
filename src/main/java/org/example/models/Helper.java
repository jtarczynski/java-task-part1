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
//TODO try to avoid naming a class Helper/Manager/Utils etc -> they say nothing about the class meaning (there is a chapter for that in CleanCode book)
//TODO basically this class could be called a Deanery
public class Helper {

    //TODO maybe I didn't write it correct in the description -> but this method was supposed to generate the report
    public static void serve(Student student, String roomNumber, int hour) {
        //TODO the following 6 lines could be extracted to a submethod e.g. validateRoom()
        Room room;
        try {
            room = Room.valueOf(roomNumber);
        } catch (IllegalArgumentException ex) {
            throw new AppException(Error.ROOM_NOT_FOUND);
        }
        //TODO for some blocks of code like that it is good practice to add an empty line
        // <newline>
        if (!student.studyType.getRooms().contains(room)) {
            throw new AppException(Error.INCORRECT_ROOM);
        } else if (!room.checkHour(hour)) {
            throw new AppException(Error.CLOSED_HOURS);
        }
    }

    public static String generateRaport(Student student, String roomNumber) {
        //TODO a report looks nice -> one optimization here could be to decide on the length on the row (in the table) basing on the max length of first and second name
        //also instead of adding so many Strings, usage of StringBuilder would be recommended
        // also - you could split the report generation into a few submethods, like: printHeading, printNames, printFooter etc.
        // it could be more clear then
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
