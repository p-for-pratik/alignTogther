package com.example.demo.model;

import java.security.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Card {
@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
private LocalDateTime postedOn;
//private Timestamp postedOn;
private String title;
private String type;
private String companyName;
private String companyUrl;
private String location;
private String link;
private String description;
@ElementCollection
private List<String>skills;
//type: "Full time",
//location: "Remote",
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getCompanyUrl() {
	return companyUrl;
}
public void setCompanyUrl(String companyUrl) {
	this.companyUrl = companyUrl;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getLink() {
	return link;
}
public void setLink(String link) {
	this.link = link;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public List<String> getSkills() {
	return skills;
}
public void setSkills(List<String> skills) {
	this.skills = skills;
}
public Card() {
	
}



public Card(Integer id, LocalDateTime postedOn, String title, String type, String companyName, String companyUrl,
		String location, String link, String description, List<String> skills) {
	super();
	this.id = id;
	this.postedOn = postedOn;
	this.title = title;
	this.type = type;
	this.companyName = companyName;
	this.companyUrl = companyUrl;
	this.location = location;
	this.link = link;
	this.description = description;
	this.skills = skills;
}
public LocalDateTime getPostedOn() {
	return postedOn;
}
public void setPostedOn(LocalDateTime postedOn) {
	this.postedOn = postedOn;
}
public void setId(Integer id) {
	this.id = id;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}




}
