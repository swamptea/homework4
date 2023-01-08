package ru.netology.dbhw4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.dbhw4.repository.MyRepository;

import java.util.List;

@RestController
public class MyController {
    private final MyRepository myRepository;

    public MyController(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    @GetMapping("/persons/by-city")
    public List getCity(@RequestParam String city) {
        return myRepository.getPersonsByCity(city);
    }
}
