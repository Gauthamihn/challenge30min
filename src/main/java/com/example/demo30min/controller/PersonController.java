package com.example.demo30min.controller;

import com.example.demo30min.model.Person;
import com.example.demo30min.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/person")

    public List<Person> getAllPersons(){

       return personRepository.findAll();

    }

}
