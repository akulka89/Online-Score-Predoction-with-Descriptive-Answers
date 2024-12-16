package com.model;

import java.io.InputStream;


import javax.servlet.http.Part;

import com.mysql.cj.jdbc.Blob;

public class UserRegisterModel {
String fname,lname,email,password,number,gender,date;
private String base64Image;
private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getBase64Image() {
	return base64Image;
}

public void setBase64Image(String base64Image) {
	this.base64Image = base64Image;
}

InputStream profilepic;
InputStream image;

public InputStream getImage() {
	return image;
}

public void setImage(InputStream inputStream) {
	this.image = inputStream;
}

//https://www.codejava.net/coding/how-to-display-images-from-database-in-jsp-page-with-java-servlet


public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

	
	
}
