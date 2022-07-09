package org.example.models;

import lombok.*;
import org.example.exception.AppException;
import org.example.exception.Error;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Builder
@ToString
public class Student {

    Long studentId;

    String firstName;

    String secondName;

    StudyType studyType;

}
