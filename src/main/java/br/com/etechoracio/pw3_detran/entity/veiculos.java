package br.com.etechoracio.pw3_detran.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Table(name= "Veiculos")
@Entity
@Setter
@Getter
public class veiculos {

	@Id
	@Column(name = "idVeiculos")
int id;
	
@Column(name= "renavam")
String revanan;
@Column (name = "placa")
String placa;
@Column (name = "modelo")
String modelo;
@Column (name = "ano")
int ano;
@Column (name = "Proprietario")
@ManyToOne
@JoinColumn (name = "proprietario")
String Proprietario;

	
}
