package com.hcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.kafka.KafkaProducer;
import com.hcl.model.FlightScheduleDetails;
import com.hcl.service.FlightService;



@RestController
public class Controller {

	@Autowired
    KafkaProducer kafkaProducer;
	
	@Autowired
	FlightService flightService;
	
	@RequestMapping("/")
	public String healthCheck() {
		kafkaProducer.searchFlights("oam4ddja-flights", "This is Test Nessage");
		return "OK";
	}
	
	@GetMapping("/getflightdetails")
	public ResponseEntity<List<FlightScheduleDetails>> findFlights() {
		List<FlightScheduleDetails> scheduleDetails = flightService.findFlights();
		kafkaProducer.searchFlights("oam4ddja-flights", "Find Flights Call");
		return ResponseEntity.ok().body(scheduleDetails);
	}

	@PostMapping("/saveflightscheduledetails")
	public ResponseEntity<HttpStatus> saveFlightScheduleDetails(
			@RequestBody FlightScheduleDetails flightScheduleDetails) {
		flightService.saveFlightScheduleDetails(flightScheduleDetails);
		kafkaProducer.searchFlights("oam4ddja-flights", "Save Flight Schedule Details");
		return ResponseEntity.ok(HttpStatus.OK);
	}
}
