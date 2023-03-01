package com.areg.app.animals;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
public class Cat extends Animal {

    @Column
    @Enumerated(value = EnumType.STRING)
    private CatBreed breed;



}
