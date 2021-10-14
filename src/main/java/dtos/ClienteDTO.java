package dtos;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import models.Cliente;

@Data
public class ClienteDTO {
	private Boolean errors;
	private List<Cliente> data;
	private String message;
	
	public ClienteDTO() {
		this.errors = true;
		this.data = new ArrayList<Cliente>();
		this.message = "";
	}
}
