package com.example.mySQLDemo.Repositories;

import com.example.mySQLDemo.Models.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepo extends CrudRepository<Dog,Long> {}