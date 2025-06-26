package com.springboot.modelo.entitys;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idemp")
	private long idemp;
	
	@Column(name="nomemp")
	private String nomemp;
	
	@Column(name="apeemp")
	private String apeemp;
	
	@Column(name="caremp")
	private String caremp;
	
	@Column(name="sueemp")
	private double sueemp;
	
	@Column(name="genemp")
	private char genemp;
	
	@Column(name="fncemp")
	private LocalDateTime fncemp; 
	
	public Empleado() {}

	public Empleado(long idemp, String nomemp, String apeemp, String caremp, double sueemp, char genemp,
			LocalDateTime fncemp) {
		super();
		this.idemp = idemp;
		this.nomemp = nomemp;
		this.apeemp = apeemp;
		this.caremp = caremp;
		this.sueemp = sueemp;
		this.genemp = genemp;
		this.fncemp = fncemp;
	}

	public long getIdemp() {
		return idemp;
	}

	public void setIdemp(long idemp) {
		this.idemp = idemp;
	}

	public String getNomemp() {
		return nomemp;
	}

	public void setNomemp(String nomemp) {
		this.nomemp = nomemp;
	}

	public String getApeemp() {
		return apeemp;
	}

	public void setApeemp(String apeemp) {
		this.apeemp = apeemp;
	}

	public String getCaremp() {
		return caremp;
	}

	public void setCaremp(String caremp) {
		this.caremp = caremp;
	}

	public double getSueemp() {
		return sueemp;
	}

	public void setSueemp(double sueemp) {
		this.sueemp = sueemp;
	}

	public char getGenemp() {
		return genemp;
	}

	public void setGenemp(char genemp) {
		this.genemp = genemp;
	}

	public LocalDateTime getFncemp() {
		return fncemp;
	}

	public void setFncemp(LocalDateTime fncemp) {
		this.fncemp = fncemp;
	}
}
