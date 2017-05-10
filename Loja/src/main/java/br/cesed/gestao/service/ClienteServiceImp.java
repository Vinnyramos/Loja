package br.cesed.gestao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cesed.gestao.domain.Cliente;
import br.cesed.gestao.repository.ClienteRepository;

@Service
public class ClienteServiceImp  implements ClienteService{

	private final ClienteRepository repository;
	
	@Autowired
	public ClienteServiceImp(final ClienteRepository repository) {
		this.repository = repository;
	}

	@Override
	public Cliente save(Cliente cliente) {
		
		return repository.save(cliente);
	}

	@Override
	public List<Cliente> listaClientes() {
		
		return repository.findAll();
	}

	
	
	
	
	
	
	
	
	
}
