package org.example;

import org.example.datainitializer.DataInitializer;
import org.example.exception.AppException;
import org.example.exception.Error;
import org.example.models.Helper;
import org.example.models.Room;
import org.example.models.Student;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> students = DataInitializer.InitializeData();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //TODO I guess that was the first option of showing the solution without the Scanner class?
        //Good idea to use some randomizing here, but in this implementation, when something goes wrong
        // (an exception is thrown) - the loop is interrupted by the exception
        // so then some nice handling of exceptions would be required -> try, catch
//        students.forEach(student -> {
//            String roomNumber = Room.randomEnumValue();
//            Helper.serve(student, roomNumber, random.nextInt(24));
//            System.out.println(Helper.generateRaport(student, roomNumber));
//        });


        while (true) {
            System.out.println();
            System.out.println("Enter the room number: ");
            String roomNumber = scanner.nextLine();
            System.out.println("Enter the hour: ");
            int hour = scanner.nextInt();
            System.out.println("Enter the student ID: ");
            Long studentId = scanner.nextLong();
            //TODO I would extract this whole call students.stream() etc... to a new method
            students.stream() //TODO nice usage of Java 8 features ;)
                    .filter(student -> student.getStudentId().equals(studentId))
                    .findFirst()
                    .ifPresentOrElse(
                            student -> {
                                Helper.serve(student, roomNumber, hour);
                                System.out.println(Helper.generateRaport(student, roomNumber));
                            },//TODO some formatting issues - you could use ctr+alt+L for IntelliJs formatting
                            () -> {
                                throw new AppException(Error.ID_NOT_FOUND);
                            });
            scanner.nextLine();
        }
    }
}
