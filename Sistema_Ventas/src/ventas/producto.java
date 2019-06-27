package ventas;

public class producto {
	private int codigo;
	private String descripcion;
	private int cantidad;
	public producto(int codigo, String descripcion, int cantidad) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getCodigo() {
		return codigo;
	}
	@Override
	public String toString() {
		return "Codigo=" + codigo + ", Descripcion=" + descripcion + ", Cantidad=" + cantidad + "";
	}
	
	
	
}
