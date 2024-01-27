package com.gl.univ.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
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

	public Sector(Integer id, String title, String menvershipCondition, String description, int price,
			String durationCourse) {
		super();
		this.id = id;
		this.title = title;
		this.menvershipCondition = menvershipCondition;
		this.description = description;
		this.price = price;
		this.durationCourse = durationCourse;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMenvershipCondition() {
		return menvershipCondition;
	}

	public void setMenvershipCondition(String menvershipCondition) {
		this.menvershipCondition = menvershipCondition;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDurationCourse() {
		return durationCourse;
	}

	public void setDurationCourse(String durationCourse) {
		this.durationCourse = durationCourse;
	}

	public Sector() {
		
	}
	
	

}
