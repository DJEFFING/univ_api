package com.gl.univ.models;

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
@Table(name="training_center")
public class TrainingCenter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "logo")
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMangerNumber() {
		return mangerNumber;
	}

	public void setMangerNumber(String mangerNumber) {
		this.mangerNumber = mangerNumber;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public Etablishment getEtablishment() {
		return etablishment;
	}

	public void setEtablishment(Etablishment etablishment) {
		this.etablishment = etablishment;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public TrainingCenter(Integer id, String name, String logo, String description, String mangerNumber, String webSite,
			Etablishment etablishment, Category category, City city, User user) {
		super();
		this.id = id;
		this.name = name;
		this.logo = logo;
		this.description = description;
		this.mangerNumber = mangerNumber;
		this.webSite = webSite;
		this.etablishment = etablishment;
		this.category = category;
		this.city = city;
		this.user = user;
	}

	public TrainingCenter() {
		
	}
	
	

}
