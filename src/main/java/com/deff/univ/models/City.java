package com.deff.univ.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
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

}
