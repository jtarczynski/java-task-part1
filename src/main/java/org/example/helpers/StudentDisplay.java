package org.example.helpers;

import org.example.exception.AppException;
import org.example.exception.Error;
import org.example.models.Student;

import java.util.List;

public class StudentDisplay {
    public static void displayStudents(List<Student> students,
                                       Long studentId,
                                       String roomNumber,
                                       int hour) {
        students.stream()
                .filter(student -> student.getStudentId().equals(studentId))
                .findFirst()
                .ifPresentOrElse(
                        student -> System.out.println(Deanery.serve(student, roomNumber, hour)), () -> {
                            throw new AppException(Error.ID_NOT_FOUND);
                        });
    }
}
