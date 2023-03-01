package com.areg.app.persons;

import lombok.Data;

import java.time.LocalDate;

@Data
public abstract class Person {
    private String name;
    private LocalDate age;
}
