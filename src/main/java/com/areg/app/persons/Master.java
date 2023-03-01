package com.areg.app.persons;

import com.areg.app.animals.Animal;
import lombok.Data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Data
public class Master extends Person {


    List<Animal> animals = new ArrayList<>();

}
