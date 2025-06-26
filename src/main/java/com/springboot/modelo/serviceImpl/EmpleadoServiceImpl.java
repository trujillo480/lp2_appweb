package com.springboot.modelo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.modelo.entitys.Empleado;
import com.springboot.modelo.repository.EmpleadoRepository;
import com.springboot.modelo.services.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	@Autowired
	private EmpleadoRepository repositorio;
	
	@Override
	public List<Empleado> listarEmpleado() {
		return repositorio.findAll();
	}

}
