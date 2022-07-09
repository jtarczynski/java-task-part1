package org.example.datainitializer;

import org.example.models.Student;
import org.example.models.StudyType;

import java.util.ArrayList;
import java.util.List;

public class DataInitializer {

    public static List<Student> InitializeData() {
        List<Student> students = new ArrayList<>();

        students.add(Student.builder()
                .studentId(242934L)
                .firstName("Kamil")
                .secondName("Matuszewski")
                .studyType(StudyType.FULL_TIME)
                .build());

        students.add(Student.builder()
                .studentId(242452L)
                .firstName("Alicja")
                .secondName("Celinska")
                .studyType(StudyType.FULL_TIME)
                .build());

        students.add(Student.builder()
                .studentId(246313L)
                .firstName("Karolina")
                .secondName("Pat")
                .studyType(StudyType.FULL_TIME)
                .build());

        students.add(Student.builder()
                .studentId(285933L)
                .firstName("Julian")
                .secondName("Tarczyński")
                .studyType(StudyType.FULL_TIME)
                .build());

        students.add(Student.builder()
                .studentId(257823L)
                .firstName("Maciek")
                .secondName("Wasilewski")
                .studyType(StudyType.PART_TIME)
                .build());

        students.add(Student.builder()
                .studentId(295834L)
                .firstName("Ola")
                .secondName("Godlewska")
                .studyType(StudyType.PART_TIME)
                .build());

        students.add(Student.builder()
                .studentId(285935L)
                .firstName("Mateusz")
                .secondName("Dorski")
                .studyType(StudyType.PART_TIME)
                .build());

        students.add(Student.builder()
                .studentId(267498L)
                .firstName("Piotrek")
                .secondName("Kowalski")
                .studyType(StudyType.PART_TIME)
                .build());

        return students;
    }

}
