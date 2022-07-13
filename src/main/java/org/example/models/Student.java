package org.example.models;

import lombok.*;
import org.example.exception.AppException;
import org.example.exception.Error;

//TODO When it comes to the Student class representation,
// I had an abstract class in mind with two subclasses: FullTimeStudent and PartTimeStudent
// - so that you can practice the inheritance a bit
// but honestly - I think your way of representing it is as good as the other one ;)

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Builder
@ToString
public class Student {

    // TODO Generally it is better to stick with the private access of the fields
    Long studentId;

    String firstName;

    String secondName;

    StudyType studyType;

}

