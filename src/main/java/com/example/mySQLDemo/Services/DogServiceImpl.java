package com.example.mySQLDemo.Services;

import com.example.mySQLDemo.Models.Dog;
import com.example.mySQLDemo.Repositories.DogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DogServiceImpl implements DogService {

    @Autowired
    DogRepo dogRepo;

    @Override
    public Dog getDogFromDogApi() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://dog.ceo/api/breeds/image/random",Dog.class);
    }

    public void postDogFromDogApi(Dog dog){
        dogRepo.save(dog);
    }

    @Override
    public Iterable<Dog> getAllDogs() {
        return dogRepo.findAll();
    }
}