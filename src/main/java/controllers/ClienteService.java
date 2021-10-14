package controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import models.Cliente;
import repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	@GetMapping("/api/cliente")
	public List<Cliente> findAll() {
        return repository.findAll();
    }
	
	@PostMapping("/api/cliente")
	public Cliente postCliente(@RequestBody Cliente cliente) {
		repository.save(cliente);
		return cliente;
	}
	
	@GetMapping("/api/cliente/{id}")
	public Optional<Cliente> getById(@PathVariable Long id){
		return repository.findById(id);
	}
	
	@PutMapping("/api/cliente/{id}")
	public Cliente updateById(@PathVariable Long id, @RequestBody Cliente clienteModificado){
		Cliente cli = repository.findById(id).get();
		cli.setNombre(clienteModificado.getNombre());
		cli.setTelefono(clienteModificado.getTelefono());
		repository.save(cli);
		return cli;
	}

	@DeleteMapping("/api/cliente/{id}")
	public Cliente deleteById(@PathVariable Long id){
		
		Cliente cli2 = null;
		Optional<Cliente> cli = repository.findById(id);
		if (cli.isPresent()) {
			cli2 = cli.get();
		}
		repository.deleteById(id);
		return cli2;
	}
	
}
