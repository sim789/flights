package com.hcl.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hcl.model.FlightScheduleDetails;



@Repository
public interface FlightRepository extends MongoRepository<FlightScheduleDetails, Long> {

}