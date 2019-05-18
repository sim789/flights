package com.hcl.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "flight_schedule_details")
public class FlightScheduleDetails {

	private static final long serialVersionUID = 1L;

	@Id
	private Long flightScheduleDetailsId;

	private List<FlightSchedule> flightSchedule;

	private List<State> sourceStateId;

	private List<State> destinationStateId;

	private Integer cost;

	private String delayFlightStartTime;

	private Integer delayDuration;

	public Long getFlightScheduleDetailsId() {
		return flightScheduleDetailsId;
	}

	public void setFlightScheduleDetailsId(Long flightScheduleDetailsId) {
		this.flightScheduleDetailsId = flightScheduleDetailsId;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public List<FlightSchedule> getFlightSchedule() {
		return flightSchedule;
	}

	public void setFlightSchedule(List<FlightSchedule> flightSchedule) {
		this.flightSchedule = flightSchedule;
	}

	public List<State> getSourceStateId() {
		return sourceStateId;
	}

	public void setSourceStateId(List<State> sourceStateId) {
		this.sourceStateId = sourceStateId;
	}

	public List<State> getDestinationStateId() {
		return destinationStateId;
	}

	public void setDestinationStateId(List<State> destinationStateId) {
		this.destinationStateId = destinationStateId;
	}

	public String getDelayFlightStartTime() {
		return delayFlightStartTime;
	}

	public void setDelayFlightStartTime(String delayFlightStartTime) {
		this.delayFlightStartTime = delayFlightStartTime;
	}

	public Integer getDelayDuration() {
		return delayDuration;
	}

	public void setDelayDuration(Integer delayDuration) {
		this.delayDuration = delayDuration;
	}

}