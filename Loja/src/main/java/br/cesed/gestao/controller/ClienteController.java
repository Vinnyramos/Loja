package br.cesed.gestao.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.cesed.gestao.domain.Cliente;
import br.cesed.gestao.service.ClienteService;

@RestController
public class ClienteController {

	private final ClienteService clienteService;

	@Autowired
	public ClienteController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	
	@RequestMapping(value ="/cliente", method = RequestMethod.POST )
	public ResponseEntity<String> criaCliente(@RequestBody Cliente cliente){
		clienteService.save(cliente);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
	
	
	@RequestMapping(value = "listaTodos", method = RequestMethod.GET)
	public ResponseEntity<List<Cliente>>  listaClientes() {
		return  new ResponseEntity<List<Cliente>> 
		(clienteService.listaClientes(),HttpStatus.OK);
	}
	
	
	
	public ClienteService getClienteService() {
		return clienteService;
	}	
	
}
