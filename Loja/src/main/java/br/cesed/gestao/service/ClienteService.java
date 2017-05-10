package br.cesed.gestao.service;

import java.util.List;

import br.cesed.gestao.domain.Cliente;

public interface ClienteService {

	Cliente save(Cliente cliente);
	
	List<Cliente> listaClientes();
	
	
	
}
