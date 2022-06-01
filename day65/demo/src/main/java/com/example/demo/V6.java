package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class V6 implements Engine {

    private int gear;

    public V6(){}

    public void revs() {
        System.out.println("Goes vroom vroom");        
    }

    @Override
    public void gearUp() {
        
    }

    @Override
    public void gearDown() {
        
    }
    
}
