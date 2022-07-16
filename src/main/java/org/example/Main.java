package org.example;

import org.example.datainitializer.DataInitializer;
import org.example.exception.AppException;
import org.example.helpers.Deanery;
import org.example.helpers.StudentDisplay;
import org.example.models.Room;
import org.example.models.Student;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> students = DataInitializer.initializeData();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        students.forEach(student ->
                System.out.println(Deanery.serve(student, Room.randomEnumValue(), random.nextInt(24))));

        while (true) {
            System.out.println();
            System.out.println("Enter the room number: ");
            String roomNumber = scanner.nextLine();
            System.out.println("Enter the hour: ");
            int hour = scanner.nextInt();
            System.out.println("Enter the student ID: ");
            Long studentId = scanner.nextLong();
            StudentDisplay.displayStudents(students, studentId, roomNumber, hour);
            scanner.nextLine();
        }
    }
}
