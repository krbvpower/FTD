package com.example.demo.dto;

public class Program {
	Integer id;
	String program;
	String title;
	float xPos;
	float yPos;
	Integer sumOfGrade;
	Integer countOfUse;
	String account;
	Integer countOfRecommendation;
	Integer countOfSave;
	Integer workHandPerOneDay;
	Integer countOfpostscript;
	String address;
	String phoneNumber;
	Integer maxNumberOfPeople;
	String homePage;
	
	public Program(Integer id, String program, String title, float xPos, float yPos, Integer sumOfGrade,
			Integer countOfUse, String account, Integer countOfRecommendation, Integer countOfSave,
			Integer workHandPerOneDay, Integer countOfpostscript, String address, String phoneNumber,
			Integer maxNumberOfPeople, String homePage) {
		super();
		this.id = id;
		this.program = program;
		this.title = title;
		this.xPos = xPos;
		this.yPos = yPos;
		this.sumOfGrade = sumOfGrade;
		this.countOfUse = countOfUse;
		this.account = account;
		this.countOfRecommendation = countOfRecommendation;
		this.countOfSave = countOfSave;
		this.workHandPerOneDay = workHandPerOneDay;
		this.countOfpostscript = countOfpostscript;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.maxNumberOfPeople = maxNumberOfPeople;
		this.homePage = homePage;
	}
	@Override
	public String toString() {
		return "Program [id=" + id + ", program=" + program + ", title=" + title + ", xPos=" + xPos + ", yPos=" + yPos
				+ ", sumOfGrade=" + sumOfGrade + ", countOfUse=" + countOfUse + ", account=" + account
				+ ", countOfRecommendation=" + countOfRecommendation + ", countOfSave=" + countOfSave
				+ ", workHandPerOneDay=" + workHandPerOneDay + ", countOfpostscript=" + countOfpostscript + ", address="
				+ address + ", phoneNumber=" + phoneNumber + ", maxNumberOfPeople=" + maxNumberOfPeople + ", homePage="
				+ homePage + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getxPos() {
		return xPos;
	}
	public void setxPos(float xPos) {
		this.xPos = xPos;
	}
	public float getyPos() {
		return yPos;
	}
	public void setyPos(float yPos) {
		this.yPos = yPos;
	}
	public Integer getSumOfGrade() {
		return sumOfGrade;
	}
	public void setSumOfGrade(Integer sumOfGrade) {
		this.sumOfGrade = sumOfGrade;
	}
	public Integer getCountOfUse() {
		return countOfUse;
	}
	public void setCountOfUse(Integer countOfUse) {
		this.countOfUse = countOfUse;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public Integer getCountOfRecommendation() {
		return countOfRecommendation;
	}
	public void setCountOfRecommendation(Integer countOfRecommendation) {
		this.countOfRecommendation = countOfRecommendation;
	}
	public Integer getCountOfSave() {
		return countOfSave;
	}
	public void setCountOfSave(Integer countOfSave) {
		this.countOfSave = countOfSave;
	}
	public Integer getWorkHandPerOneDay() {
		return workHandPerOneDay;
	}
	public void setWorkHandPerOneDay(Integer workHandPerOneDay) {
		this.workHandPerOneDay = workHandPerOneDay;
	}
	public Integer getCountOfpostscript() {
		return countOfpostscript;
	}
	public void setCountOfpostscript(Integer countOfpostscript) {
		this.countOfpostscript = countOfpostscript;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Integer getMaxNumberOfPeople() {
		return maxNumberOfPeople;
	}
	public void setMaxNumberOfPeople(Integer maxNumberOfPeople) {
		this.maxNumberOfPeople = maxNumberOfPeople;
	}
	public String getHomePage() {
		return homePage;
	}
	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}
}
