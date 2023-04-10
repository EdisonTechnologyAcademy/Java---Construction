package com.edison.Prac02lLess18;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PizzaController {
	 @Autowired
	 
	    @Qualifier("vegPizza")
	    private Pizza pizza;

	 @Autowired
	    public PizzaController(@Qualifier("vegPizza") Pizza pizza) {
	        System.out.println("inside PizzaController constructor");
	        this.pizza = pizza;
	    }

	  // setter injection
	    @Autowired
	    @Qualifier("vegPizza")
	    public void setPizza(Pizza pizza) {
	        this.pizza = pizza;
	    }

	    public String getPizza(){
	        return pizza.getPizza();
	    }
}
