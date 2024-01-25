package com.gl.univ.models;


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
@Table(name="Have_specialty")
public class HaveSpecialty {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "speciality_id")
	private Speciality speciality;
	
	@ManyToOne
	@JoinColumn(name="training_center_id")
	private TrainingCenter trCenter;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Speciality getSpeciality() {
		return speciality;
	}

	public void setSpeciality(Speciality speciality) {
		this.speciality = speciality;
	}

	public TrainingCenter getTrCenter() {
		return trCenter;
	}

	public void setTrCenter(TrainingCenter trCenter) {
		this.trCenter = trCenter;
	}

	
	
}
