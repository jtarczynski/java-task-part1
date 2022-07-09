package org.example.models;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class HoursRange {
    int open_hour;
    int close_hour;
}
