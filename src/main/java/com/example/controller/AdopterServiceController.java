package com.example.controller;

import com.example.domain.Adopter;
import com.example.service.AdopterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public record AdopterServiceController() {

    @Autowired
    private static AdopterService adopterService;

    @GetMapping("/hello")
    public String sayHello(){
        return "Test Hello";
    }

    @GetMapping("/adopter")
    public  List<Adopter> getAll(){
        List<Adopter> adopters = adopterService.getAdopters();
        return adopters;
    }

    @GetMapping("/adopter/{id}")
    public Adopter getAdopter(@PathVariable("id") int id){
        Adopter adopter = adopterService.getAdopter(id);

        return adopter;
    }
}
