package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Object> {
	
}