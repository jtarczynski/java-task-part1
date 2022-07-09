package org.example;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class Student {

    Long studentId;

    String firstName;

    String secondName;

    StudyType studyType;

}
