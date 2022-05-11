package br.com.kaiky.correia.pw3detran.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etechoracio.pw3_detran.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa,Integer>{

}
