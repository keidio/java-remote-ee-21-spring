package com.sda.javaremoteee21spring.controller.rest;

import com.sda.javaremoteee21spring.entity.Car;
import com.sda.javaremoteee21spring.service.CarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
@Slf4j
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public List<Car> getAllCars(){
        log.info("getting all cars");
        return carService.findAllCars();
    }

    // dynamic id
    @GetMapping("/cars/{id}")
  public Car getCarById(@PathVariable Long id){
        log.info("getting car by id: [{}]", id);
        return carService.findCarById(id);
  }

    @PostMapping("/cars")
    public Car createCar(@RequestBody Car carToSave) {
        log.info("create new car: [{}]", carToSave);
        return carService.saveCar(carToSave);
    }
}
