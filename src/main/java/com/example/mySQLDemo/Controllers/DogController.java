package com.example.mySQLDemo.Controllers;

import com.example.mySQLDemo.Models.Dog;
import com.example.mySQLDemo.Services.DogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DogController {

    @Autowired
    DogServiceImpl dogServiceImpl;

    @GetMapping("/get/dogs")
    public Iterable<Dog> getAllDogs() {
        return dogServiceImpl.getAllDogs();
    }

    @GetMapping("/dog")
    public Dog getDog() {
        return dogServiceImpl.getDogFromDogApi();
    }

    @PostMapping("/create/dog")
    public String postDog() {
        Dog dog = dogServiceImpl.getDogFromDogApi();
        dogServiceImpl.postDogFromDogApi(dog);
        return "Posted dog from dog Api";
    }
}