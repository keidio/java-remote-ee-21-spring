package com.sda.javaremoteee21spring.dependency_injection;

import org.springframework.http.converter.json.GsonBuilderUtils;

public class DependencyInjectionApplication {
    public static void main(String[] args) {

        //creating beans
        //injecting dependencies
        Dog dog = new Dog();
        Zoo zoo = new Zoo(dog); // injection dog into zoo
        EntertainmentPark entertainmentPark = new EntertainmentPark(zoo); //injectiong zoo into ePark
    }
}
