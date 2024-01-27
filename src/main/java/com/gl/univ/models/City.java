package com.gl.univ.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="city")
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "title")
	private String title;


	public String getTitle() {
		return this.title;
	}

	public void setTitle(String newTitle) {
		this.title=newTitle;
	}

	public City(Integer id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	public City() {
		
	}

}
