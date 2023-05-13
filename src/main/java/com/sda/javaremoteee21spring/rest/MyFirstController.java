package com.sda.javaremoteee21spring.rest;

import com.sda.javaremoteee21spring.dto.Person;
import com.sda.javaremoteee21spring.service.MyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class MyFirstController {

    private final MyService service;

    public MyFirstController(MyService service) {
        log.info("MyFirstController constructor");
        this.service = service;
    }


    //SLf4j, same as:
    //private static final Logger log = LoggerFactory.getLogger(MyFirstController.class);

    @GetMapping("/name")
    public String showMeMyName(){
        return "Keidi";
    }

    @GetMapping("/me")
    public Person justMe(){
        return new Person("Keidi", "Oras", 20);
    }

    @GetMapping("me-and-friend")
    //@GetMapping(value="me-and-friend")
    public List<Person> meAndFriend(){

        //List<Person> persons = new ArrayList<>();
        //persons.add(...);
        //persons.add(...);
        return List.of(
                new Person("Keidi", "O.", 20),
                new Person("John", "D.", 30)
        );
    }

    //?param1=value1&param2=value2
    // /api/try-login?login=keidi&password=12345

    //@RequestParam(required = false) String password or with/without defaultvalue
    @GetMapping("/try-login")
    public String logIn(@RequestParam(defaultValue = "John Doe", value= "login") String userLogin,
                        @RequestParam(defaultValue = "pass", value = "password") String userPassword) {

        //string interpolation
        log.info("received login: [{}] and password [{}]", userLogin, userPassword);
        return "OK";
    }

    @PostMapping("/try-login")
    public ResponseEntity<String> logInWithPost(String userLogin, String userPassword) {
        log.info("login with post");
        log.info("received login: [{}] and password [{}]", userLogin, userPassword);
        if(userLogin == null || userPassword == null) {
            return ResponseEntity.badRequest().body("Provide credentials");
        }
      return ResponseEntity.ok("Success");

    }
}

    /*@GetMapping("/try-login")
    public String logIn(@RequestParam(defaultValue = "John Doe") String login, @RequestParam(defaultValue = "pass") String password) {

        //string interpolation
        log.info("received login: [{}] and password [{}]", userLogin, userPassword);
        return "OK";
    }
}*/