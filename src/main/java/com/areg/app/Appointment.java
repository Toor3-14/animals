package com.areg.app;

import com.areg.app.animals.Animal;
import com.areg.app.persons.Customer;
import com.areg.app.persons.Doctor;
import lombok.Data;


@Data
public class Appointment {
    private Customer customer;
    private Doctor doctor;
    private Animal animal;
}
