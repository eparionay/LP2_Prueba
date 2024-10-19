package com.cibertec.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamento")
public class Departamento {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int department_id;
	@Column(name="department_name", length = 30, nullable = false)
	private String department_name;
	@Column(name="location_id", nullable = false)
	private int location_id;
	

}
