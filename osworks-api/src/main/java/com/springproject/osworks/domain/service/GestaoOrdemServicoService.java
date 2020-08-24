package com.springproject.osworks.domain.service;

import java.time.OffsetDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.osworks.domain.exception.NegocioException;
import com.springproject.osworks.domain.model.Cliente;
import com.springproject.osworks.domain.model.OrdemServico;
import com.springproject.osworks.domain.model.StatusOrdemServico;
import com.springproject.osworks.domain.repository.ClienteRepository;
import com.springproject.osworks.domain.repository.OrdemServicoRepository;

@Service
public class GestaoOrdemServicoService {

	@Autowired
	private OrdemServicoRepository ordemServicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;

	public OrdemServico criar(OrdemServico ordemServico) {
		Cliente cliente = clienteRepository.findById(ordemServico.getCliente().getId())
				.orElseThrow(() -> new NegocioException("Cliente não encontrado"));
		
		ordemServico.setCliente(cliente);
		ordemServico.setStatus(StatusOrdemServico.ABERTA);
		ordemServico.setDataAbertura(OffsetDateTime.now());
		
		
		return ordemServicoRepository.save(ordemServico);
	}
}
