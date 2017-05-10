package br.cesed.gestao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.cesed.gestao.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
	
	public Cliente findByName(String name);
	
	

}
