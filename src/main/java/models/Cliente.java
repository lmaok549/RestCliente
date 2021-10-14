package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NonNull;

@Data
@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id", nullable = false)
	private Long id;
	@NonNull
	private String nombre;
	@NonNull
	private String telefono;
	
	public Cliente() {
		this.id = 0L;
		this.nombre = "";
		this.telefono = "";
	}
	
	public Cliente(Long id, String nombre, String telefono) {
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public Long getId() {
	    return id;
	}

	public String getFirstName() {
	    return nombre;
	}

	public String getTelephone() {
	    return telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
