package persistencia;

import java.io.Serializable;

import modelo.Cliente;

public class TecnicoDto implements Serializable {
	private String nombre;
	private boolean ocupado;
	private ClienteDto cliente;
	
	public TecnicoDto() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	public ClienteDto getCliente() {
		return cliente;
	}
	public void setCliente(ClienteDto cliente) {
		this.cliente = cliente;
	}
	
	
	
}
