package com.hcl.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fights")
public class Flights {

	private static final long serialVersionUID = 1L;

	@Id
	private Long fightId;

	private String flightName;

	public Long getFightId() {
		return fightId;
	}

	public void setFightId(Long fightId) {
		this.fightId = fightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

}