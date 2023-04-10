package com.edison.Prac04lLess18.Service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("raining")
public class RainingDayService implements WeatherService{
	 @Override
	    public String forecast() {
	        return "Today is raining day!";
	    }
}
