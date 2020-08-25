package com.example.demo.dto;

import java.sql.Timestamp;

public class Diary {
	Integer id;
	Integer grade;
	String email;
	String text;
	String photo;
	String program;
	Integer countOfClicked;
	Timestamp timestamp;
	
	public Diary(Integer id, Integer grade, String email, String text, String photo, String program,
			Integer countOfClicked, Timestamp timestamp) {
		super();
		this.id = id;
		this.grade = grade;
		this.email = email;
		this.text = text;
		this.photo = photo;
		this.program = program;
		this.countOfClicked = countOfClicked;
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "Diary [id=" + id + ", grade=" + grade + ", email=" + email + ", text=" + text + ", photo=" + photo
				+ ", program=" + program + ", countOfClicked=" + countOfClicked + ", timestamp=" + timestamp + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public Integer getCountOfClicked() {
		return countOfClicked;
	}
	public void setCountOfClicked(Integer countOfClicked) {
		this.countOfClicked = countOfClicked;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
}
