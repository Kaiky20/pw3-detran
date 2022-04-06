package br.com.etechoracio.pw3_detran.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Table(name = "Pessoa")
@Entity
@Getter
@Setter
public class Pessoa {
	
	@Column (name = "IdPessoa")
	@Id
	int id;
	@Column (name = "nome")
	String nome;
	@Column(name = "endereco") 
	String endereco;
	

}
