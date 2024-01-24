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

}
