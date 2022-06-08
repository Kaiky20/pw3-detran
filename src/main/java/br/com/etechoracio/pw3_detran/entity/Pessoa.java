package br.com.etechoracio.pw3_detran.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;
@Table(name = "Pessoa")
@Entity
@Getter
@Setter
public class Pessoa {
	
	@Column (name = "IdPessoa")
	@Id
	@NotBlank
	int id;
	@Column (name = "nome")
	@NotNull (message= "campo obrigatorio")
	@NotBlank
	@Length(max=150)
	String nome;
	@Column(name = "endereco") 
	@NotNull 
	@NotBlank
	@Length(max=150)
	String endereco;
	

}
