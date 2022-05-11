package br.com.kaiky.correia.pw3detran.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.etechoracio.pw3_detran.entity.Pessoa;
import br.com.kaiky.correia.pw3detran.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoa")


public class Pessoa_Controller{

	@Autowired
	private PessoaRepository  repository;
	
	private List<Pessoa> dados = new ArrayList<Pessoa>();

	@GetMapping
	public List<Pessoa> listarTodos(){
		dados = repository.findAll();
		return dados;
		
	}
	@GetMapping("/(id)")
	public Pessoa BuscarPorId (@PathVariable integer id) {
		Pessoa tipo = new Pessoa ();
		tipo = repository.findById(id).get();
		return tipo;
	}
	
}
