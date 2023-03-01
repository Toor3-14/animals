package com.areg.app.animals.repository;

import com.areg.app.animals.Dog;
import org.springframework.data.repository.CrudRepository;


public interface DogRepository extends CrudRepository<Dog, Long> {
}
