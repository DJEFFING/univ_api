package com.deff.univ.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="sector")
public class Sector {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "menvership_condition")
	private String menvershipCondition;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "duration_course")
	private String durationCourse;

}
