package com.areg.app.animals.repository;

import com.areg.app.animals.Cat;
import org.springframework.data.repository.CrudRepository;

public interface CatRepository extends CrudRepository<Cat, Long> {
}
