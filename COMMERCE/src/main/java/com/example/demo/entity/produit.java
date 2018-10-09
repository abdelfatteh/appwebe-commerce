package com.example.demo.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class produit{
	@Id  @GeneratedValue
private int id;
private String desgnation;
private double prix;
private int qantite;
@JsonIgnore
private String origine ;
public String getorigine() {
	return origine;
}
public int getId() {
	return id;
}
public void setorigine(String origine) {
	this.origine = origine;
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
public produit(int id ,String desgnation, double prix, int qantite ,String origine ) {
	super();
	this.id=id;
	this.desgnation = desgnation;
	this.prix = prix;
	this.qantite = qantite;
	this.origine=origine;
}
public produit() {
	super();
	// TODO Auto-generated constructor stub
}
}
