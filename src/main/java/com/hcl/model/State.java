package com.hcl.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "state")
public class State {

	private static final long serialVersionUID = 1L;

	@Id
	private Long stateId;

	private String stateName;

	private String shortStateName;

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getShortStateName() {
		return shortStateName;
	}

	public void setShortStateName(String shortStateName) {
		this.shortStateName = shortStateName;
	}

}