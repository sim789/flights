package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.model.FlightScheduleDetails;
import com.hcl.repository.FlightRepository;



@Service
public class FlightService {

	@Autowired
	private FlightRepository flightRepository;

	public List<FlightScheduleDetails> findFlights() {
		List<FlightScheduleDetails> flightScheduleDetails = flightRepository.findAll();
		return flightScheduleDetails;
	}
	
	public void saveFlightScheduleDetails(FlightScheduleDetails flightScheduleDetails) {
		flightRepository.save(flightScheduleDetails);
	}
	
	
}