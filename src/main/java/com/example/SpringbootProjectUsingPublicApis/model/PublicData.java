package com.example.SpringbootProjectUsingPublicApis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "entry")
public class PublicData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "description")
	private String description;
	@Column(name="auth")
	private String auth;
	@Column(name = "https")
	private String https;
	@Column(name = "cors")
	private String cors;
	private String category;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public String getHttps() {
		return https;
	}

	public void setHttps(String https) {
		this.https = https;
	}

	public String getCors() {
		return cors;
	}

	public void setCors(String cors) {
		this.cors = cors;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAuth() {
		// TODO Auto-generated method stub
		return null;
	}

}
