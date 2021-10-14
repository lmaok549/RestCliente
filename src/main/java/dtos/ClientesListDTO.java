package dtos;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

import models.Cliente;

@Data
public class ClientesListDTO {
	private Boolean errors;
	private List<Cliente> data;
	private String message;
	
	public ClientesListDTO() {
		this.errors = true;
		this.data = new ArrayList<Cliente>();
		this.message = "";
	}
}
