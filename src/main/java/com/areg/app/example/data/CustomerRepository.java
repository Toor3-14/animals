package com.areg.app.example.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);

    List<Customer> findByFirstNameAndLastName (String fistName, String lastName);

    boolean existsByFirstName (String firstName);

    long countByLastNameStartingWith (String prefix);

    //найти все по имени, начинающемуся с и фамилии, заканчивающемуся Порядком по фамилии по возрастанию

    List<Customer> findAllByFirstNameStartingWithAndLastNameEndingWithOrderByLastNameAsc (String prefixFirstName, String lastNameSuffix);

    long deleteByFirstName (String firstName);







}
