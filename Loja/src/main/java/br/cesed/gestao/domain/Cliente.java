package br.cesed.gestao.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {

	@Id
	private int id;
	
	private String name;
	
	
	public Cliente() {
	}

	public Cliente(int id, String nome) {
		super();
		this.id = id;
		this.name = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}
	
	
	
	
	
	

}
