package org.example.datainitializer;

import org.example.models.Student;
import org.example.models.StudyType;

import java.util.ArrayList;
import java.util.List;

public class DataInitializer {

    public static List<Student> initializeData() {
        List<Student> students = new ArrayList<>();

        students.add(Student.builder()
                .studentId(242934L)
                .firstName("Kamil")
                .secondName("Marcin")
                .studyType(StudyType.FULL_TIME)
                .build());

        students.add(Student.builder()
                .studentId(242452L)
                .firstName("Alicja")
                .secondName("Marta")
                .studyType(StudyType.FULL_TIME)
                .build());

        students.add(Student.builder()
                .studentId(246313L)
                .firstName("Karolina")
                .secondName("Anastazja")
                .studyType(StudyType.FULL_TIME)
                .build());

        students.add(Student.builder()
                .studentId(285933L)
                .firstName("Julian")
                .secondName("Mikołaj")
                .studyType(StudyType.FULL_TIME)
                .build());

        students.add(Student.builder()
                .studentId(257823L)
                .firstName("Maciek")
                .secondName("Konrad")
                .studyType(StudyType.PART_TIME)
                .build());

        students.add(Student.builder()
                .studentId(295834L)
                .firstName("Ola")
                .secondName("Wiktoria")
                .studyType(StudyType.PART_TIME)
                .build());

        students.add(Student.builder()
                .studentId(285935L)
                .firstName("Mateusz")
                .secondName("Grzegorz")
                .studyType(StudyType.PART_TIME)
                .build());

        students.add(Student.builder()
                .studentId(267498L)
                .firstName("Piotrek")
                .secondName("Tomek")
                .studyType(StudyType.PART_TIME)
                .build());

        return students;
    }

}
