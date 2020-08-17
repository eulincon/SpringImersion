package com.springproject.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.osworks.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("João de");
		cliente1.setTelefone("88 99999-4545");
		cliente1.setEmail("joao@gmail.com");
		
		var cliente2 = new Cliente();
		cliente2.setId((long) 2);
		cliente2.setNome("Maria");
		cliente2.setTelefone("88 89999-4568");
		cliente2.setEmail("maria@gmail.com");
		
		return Arrays.asList(cliente1, cliente2);
	}

}
