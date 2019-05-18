package com.hcl.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "flight_schedule")
public class FlightSchedule {

	private static final long serialVersionUID = 1L;

	@Id
	private Long flightScheduleId;

	private List<Flights> flightId;

	private String date;

	private String time;

	private String flightStartTime;

	private Integer totalDuration;

	public Long getFlightScheduleId() {
		return flightScheduleId;
	}

	public void setFlightScheduleId(Long flightScheduleId) {
		this.flightScheduleId = flightScheduleId;
	}

	public List<Flights> getFlightId() {
		return flightId;
	}

	public void setFlightId(List<Flights> flightId) {
		this.flightId = flightId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getFlightStartTime() {
		return flightStartTime;
	}

	public void setFlightStartTime(String flightStartTime) {
		this.flightStartTime = flightStartTime;
	}

	public Integer getTotalDuration() {
		return totalDuration;
	}

	public void setTotalDuration(Integer totalDuration) {
		this.totalDuration = totalDuration;
	}

}