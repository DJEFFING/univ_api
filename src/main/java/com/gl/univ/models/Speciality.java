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
@Table(name="speciality")
public class Speciality {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "Membership_condition")
	private String MembershipCondition;
	
	@Column(name = "description")
	private String description;

	@Column(name = "price")
	private String price;
	
	@Column(name = "duration_training")
	private String durationTraining;

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

	public String getMembershipCondition() {
		return MembershipCondition;
	}

	public void setMembershipCondition(String membershipCondition) {
		MembershipCondition = membershipCondition;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDurationTraining() {
		return durationTraining;
	}

	public void setDurationTraining(String durationTraining) {
		this.durationTraining = durationTraining;
	}

	public Speciality(Integer id, String title, String membershipCondition, String description, String price,
			String durationTraining) {
		super();
		this.id = id;
		this.title = title;
		MembershipCondition = membershipCondition;
		this.description = description;
		this.price = price;
		this.durationTraining = durationTraining;
	}

	public Speciality() {
	
	}

	
	
}
