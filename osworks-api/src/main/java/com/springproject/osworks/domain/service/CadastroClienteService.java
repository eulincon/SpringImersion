package com.springproject.osworks.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.osworks.domain.model.Cliente;
import com.springproject.osworks.domain.repository.ClienteRepository;

@Service
public class CadastroClienteService {
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente salvar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	public void excluir(Long clienteId) {
		clienteRepository.deleteById(clienteId);
	}
}
