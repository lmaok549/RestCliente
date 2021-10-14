package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import models.Cliente;

@RestController
public class ClienteController {
		
	@GetMapping("/api/clientes")
	public Cliente getCliente() {
		return new Cliente(1L, "Pepe", "629629629");
	}
	
	@PostMapping("/api/clientes")
	public Cliente postCliente(@RequestBody  Cliente cliente) {
		return cliente;
	}
}
