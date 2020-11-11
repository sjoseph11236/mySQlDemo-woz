package com.example.mySQLDemo.Services;

import com.example.mySQLDemo.Models.Dog;

public interface DogService {
    public Dog getDogFromDogApi();
    public void postDogFromDogApi(Dog dog);
    public Iterable<Dog> getAllDogs();
}