package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class produit implements Serializable{
	@Id  @GeneratedValue
private int id;
private String desgnation;
private double prix;
private int qantite;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDesgnation() {
	return desgnation;
}
public void setDesgnation(String desgnation) {
	this.desgnation = desgnation;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public int getQantite() {
	return qantite;
}
public void setQantite(int qantite) {
	this.qantite = qantite;
}
public produit(String desgnation, double prix, int qantite) {
	super();
	this.desgnation = desgnation;
	this.prix = prix;
	this.qantite = qantite;
}
public produit() {
	super();
	// TODO Auto-generated constructor stub
}
}
