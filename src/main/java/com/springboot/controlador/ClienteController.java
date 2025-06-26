package com.springboot.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.modelo.entitys.Cliente;
import com.springboot.modelo.services.ClienteService;



@Controller
public class ClienteController {
	@Autowired
    private ClienteService service;

    @GetMapping("/listar")
    public String listar(Model modelo) {
        List<Cliente> lista = service.listarCliente();
        modelo.addAttribute("listaClientes", lista);
        return "listar";
    }

    @GetMapping("/nuevo")
    public String nuevoClienteForm(Model modelo) {
        modelo.addAttribute("cliente", new Cliente());
        return "formCliente";
    }

    @PostMapping("/guardar")
    public String guardarCliente(@ModelAttribute("cliente") Cliente cliente) {
        service.guardarCliente(cliente);
        return "redirect:/listar";
    }

    @GetMapping("/editar/{id}")
    public String editarClienteForm(@PathVariable("id") long id, Model modelo) {
        Cliente cliente = service.obtenerClientePorId(id).orElseThrow(() -> new IllegalArgumentException("Cliente no encontrado"));
        modelo.addAttribute("cliente", cliente);
        return "formCliente";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarCliente(@PathVariable("id") long id) {
        service.eliminarCliente(id);
        return "redirect:/listar";
    }
}
