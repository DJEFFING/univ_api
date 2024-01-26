package com.gl.univ.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "first_name")
	private String fistName;
	
	@Column(name = "last_Name")
	private String lastName;
	
	@Column(name= "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "profil_image")
	private String profilImage;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFistName() {
		return fistName;
	}

	public void setFistName(String fistName) {
		this.fistName = fistName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getProfilImage() {
		return profilImage;
	}

	public void setProfilImage(String profilImage) {
		this.profilImage = profilImage;
	}
	
	

}
