package com.springboot.modelo.services;

import java.util.List;
import java.util.Optional;

import com.springboot.modelo.entitys.*;

public interface ClienteService {
	public List<Cliente>listarCliente();
	public Cliente guardarCliente(Cliente cliente);
    public Optional<Cliente> obtenerClientePorId(long id);
    public void eliminarCliente(long id);
}
