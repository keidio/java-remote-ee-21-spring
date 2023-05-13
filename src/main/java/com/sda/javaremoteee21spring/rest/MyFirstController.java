package com.sda.javaremoteee21spring.rest;

import com.sda.javaremoteee21spring.dto.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MyFirstController {

    @GetMapping("/name")
    public String showMeMyName(){
        return "Keidi";
    }

    @GetMapping("/me")
    public Person justMe(){
        return new Person("Keidi", "Oras", 20);
    }

    @GetMapping("me-and-friend")
    public List<Person> meAndFriend(){

        List<Person> persons = new ArrayList<>();
        //persons.add(...);
        //persons.add(...);
        return List.of(
                new Person("Keidi", "O.", 20),
                new Person("John", "D.", 30)
        );
    }
}
