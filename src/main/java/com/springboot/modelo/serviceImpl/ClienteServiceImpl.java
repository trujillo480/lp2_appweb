package com.springboot.modelo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.modelo.entitys.Cliente;
import com.springboot.modelo.repository.ClienteRepository;
import com.springboot.modelo.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
	@Autowired
	private ClienteRepository repository;
	
	@Override
	public List<Cliente> listarCliente() {
		
		return repository.findAll();
	}

	@Override
	public Cliente guardarCliente(Cliente cliente) {
		return repository.save(cliente);
	}

	@Override
	public Optional<Cliente> obtenerClientePorId(long id) {
		return repository.findById((long)id);
	}

	@Override
	public void eliminarCliente(long id) {
		repository.deleteById((long)id);
	}

}
