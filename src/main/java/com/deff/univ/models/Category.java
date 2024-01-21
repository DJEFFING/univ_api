package com.deff.univ.models;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "title")
	private String title;

}
