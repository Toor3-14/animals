package com.areg.app.example.data;

import lombok.*;

import javax.persistence.*;


@Entity
@NoArgsConstructor
@Getter
//@ToString

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "F_NAME", nullable = false)
    private String firstName;
    @Column(name = "L_NAME", nullable = false)
    private String lastName;
    private transient int age;





    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = (int) ( Math.random() * 100 );
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s', age=%d]",
                id, firstName, lastName, age);
    }



//    public Long getId() {
//        return id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }


}
