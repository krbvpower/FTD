package com.example.demo.dto;

import java.sql.Date;

public class Reservation {
	Integer id;
	String email;
	String program;
	Integer numberOfPeople;
	String options;
	Integer price;
	Integer workHandPerOneDay;
	Date date;
	
	public Reservation(Integer id, String email, String program, Integer numberOfPeople, String options, Integer price,
			Integer workHandPerOneDay, Date date) {
		super();
		this.id = id;
		this.email = email;
		this.program = program;
		this.numberOfPeople = numberOfPeople;
		this.options = options;
		this.price = price;
		this.workHandPerOneDay = workHandPerOneDay;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Reservation [id=" + id + ", email=" + email + ", program=" + program + ", numberOfPeople="
				+ numberOfPeople + ", options=" + options + ", price=" + price + ", workHandPerOneDay="
				+ workHandPerOneDay + ", date=" + date + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public Integer getNumberOfPeople() {
		return numberOfPeople;
	}
	public void setNumberOfPeople(Integer numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}
	public String getOption() {
		return options;
	}
	public void setOption(String options) {
		this.options = options;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getWorkHandPerOneDay() {
		return workHandPerOneDay;
	}
	public void setWorkHandPerOneDay(Integer workHandPerOneDay) {
		this.workHandPerOneDay = workHandPerOneDay;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
