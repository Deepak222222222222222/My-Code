package com.flightapplication.flightapplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/flights")
public class FlightController {

	@Autowired
	private FlightService flightservice;
	
	@PostMapping
	public FlightBooking register(@RequestBody FlightBooking booking){
		return flightservice.register(booking);
	}
	
	@GetMapping
	public List<FlightBooking> getdetails(){
		return flightservice.getdetails();
	}
}
