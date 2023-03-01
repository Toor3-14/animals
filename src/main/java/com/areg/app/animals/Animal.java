package com.areg.app.animals;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@NoArgsConstructor
@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Animal {
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    @Enumerated(value = EnumType.STRING)
    private Color color;
    @Column
    private double weight;
    @Column
    private LocalDate birthDate;


}
