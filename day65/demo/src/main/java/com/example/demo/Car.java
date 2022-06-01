package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {

    private String make;
    private String model;
    private int year;
    
    @Autowired
    private Engine engine;

}
