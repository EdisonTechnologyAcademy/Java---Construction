package com.edison.Prac02lLess18;

import org.springframework.stereotype.Component;

@Component
public class VegPizza implements Pizza{

    @Override
    public String getPizza() {
        return "Veg Pizza";
    }

}
