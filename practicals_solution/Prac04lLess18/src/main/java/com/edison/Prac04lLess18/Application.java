package com.edison.Prac04lLess18;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.edison.Prac04lLess18.Service.WeatherService;




@SpringBootApplication
public class Application implements CommandLineRunner{
	@Autowired
    private WeatherService weatherService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println(weatherService.forecast());
    }
}
