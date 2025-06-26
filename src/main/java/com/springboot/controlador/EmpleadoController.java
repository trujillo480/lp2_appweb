package com.springboot.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.modelo.entitys.Empleado;
import com.springboot.modelo.services.EmpleadoService;

@Controller
public class EmpleadoController {
	@Autowired
	EmpleadoService servicio;
	
	@GetMapping("/empleado")
	public String listar(Model modelo) {
		List<Empleado>lista = servicio.listarEmpleado();
		modelo.addAttribute("listaEmpleados", lista);
		return "empleado";
	}
}
