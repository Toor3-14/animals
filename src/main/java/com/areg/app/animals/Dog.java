package com.areg.app.animals;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
@Entity
public class Dog extends Animal {


    @Column
    @Enumerated(value = EnumType.STRING)
    private DogBreed breed;


}
