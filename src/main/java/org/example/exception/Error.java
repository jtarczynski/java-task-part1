package org.example.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

//Nice idea -> we have a similar approach with code errors in the project as well
@AllArgsConstructor
@Getter
public enum Error {

    ID_NOT_FOUND("Student ID not found."),
    ROOM_NOT_FOUND("Room not found."),
    INCORRECT_ROOM("Wrong deanery room for student with such study type."),
    CLOSED_HOURS("Deanery is not working during this time.");

    private final String message;
}
