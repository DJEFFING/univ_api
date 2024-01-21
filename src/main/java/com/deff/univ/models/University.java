package com.deff.univ.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "university")
public class University {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(name = "name")
	private String name;
	
	@Column(name ="logo")
	private String logo;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "manager_number")
	private String mangerNumber;
	
	@Column(name = "website")
	private String webSite;
	
	@ManyToOne
	@JoinColumn(name = "establishment_id")
	private Etablishment etablishment;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	

}
