package com.example.demo30min.controller;


import com.example.demo30min.model.Person;
import com.example.demo30min.repository.PersonRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class PersonControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private PersonRepository personRepository;

    List<Person> expectedPerson = List.of(
        new Person("Rai","Dublin",2433343),
        new Person("Raju", "Cork", 48985483),
        new Person("John", "Galway", 98424209)
    );

    @BeforeEach
    public void setup(){}


    @Test
    public void testGetAllPersons() throws Exception {
            personRepository.saveAll(expectedPerson);
            String expectedJsonResponse = objectMapper.writeValueAsString(expectedPerson);
            mockMvc.perform(get("/person"))
                    .andExpect(status().isOk())
                    .andExpect(content().json(expectedJsonResponse));
        }

}
