package ventas;

public class Cliente {
	private int dni;
	private String nombre;
	private String apellido;

	
	public Cliente(int dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	@Override
	public String toString() {
		return "DNI=" + dni + ", Nombre=" + nombre + ", Apellido=" + apellido + "";
	}
	
	
}
