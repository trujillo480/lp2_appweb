package com.springboot.modelo.entitys;

import jakarta.persistence.*;

@Entity
@Table(name="cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idcli")
	private long idcli;
	
	@Column(name="nomcli")
	private String nomcli;
	
	@Column(name="apecli")
	private String apecli;
	
	@Column(name="dnicli")
	private String dnicli;
	
	@Column(name="dircli")
	private String dircli;
	
	public Cliente() {}

	public Cliente(long idcli, String nomcli, String apecli, String dnicli, String dircli) {
		super();
		this.idcli = idcli;
		this.nomcli = nomcli;
		this.apecli = apecli;
		this.dnicli = dnicli;
		this.dircli = dircli;
	}

	public long getIdcli() {
		return idcli;
	}

	public void setIdcli(long idcli) {
		this.idcli = idcli;
	}

	public String getNomcli() {
		return nomcli;
	}

	public void setNomcli(String nomcli) {
		this.nomcli = nomcli;
	}

	public String getApecli() {
		return apecli;
	}

	public void setApecli(String apecli) {
		this.apecli = apecli;
	}

	public String getDnicli() {
		return dnicli;
	}

	public void setDnicli(String dnicli) {
		this.dnicli = dnicli;
	}

	public String getDircli() {
		return dircli;
	}

	public void setDircli(String dircli) {
		this.dircli = dircli;
	}
}
