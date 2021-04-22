package com.example.demo.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Component
@Data
public class FlightModel implements Serializable {

	@NotEmpty
	@NotNull
	private String numberOfPassangers;

	@NotEmpty
	@NotNull
	private String currency;

	@NotEmpty
	@NotNull
	private String fromLocation;

	@NotEmpty
	@NotNull
	private String toLocation;

	private String departure;
	private String arrival;
	private int numberOfBookableSeats;
	private String totalPrice;
	private String numberOfStops;

	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String dateOfFlight;

	public String getNumberOfPassangers() {
		return numberOfPassangers;
	}

	public String getCurrency() {
		return currency;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public String getToLocation() {
		return toLocation;
	}

	public String getDeparture() {
		return departure;
	}

	public String getArrival() {
		return arrival;
	}

	public int getNumberOfBookableSeats() {
		return numberOfBookableSeats;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public String getNumberOfStops() {
		return numberOfStops;
	}

	public String getDateOfFlight() {
		return dateOfFlight;
	}

	public void setNumberOfPassangers(String numberOfPassangers) {
		this.numberOfPassangers = numberOfPassangers;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public void setNumberOfBookableSeats(int numberOfBookableSeats) {
		this.numberOfBookableSeats = numberOfBookableSeats;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public void setNumberOfStops(String numberOfStops) {
		this.numberOfStops = numberOfStops;
	}

	public void setDateOfFlight(String dateOfFlight) {
		this.dateOfFlight = dateOfFlight;
	}
	
}
