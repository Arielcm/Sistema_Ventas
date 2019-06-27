package ventas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Stock {
	List<producto> productos = new ArrayList<producto>();
	
	public void menu(){
		int op;
		do {
		try {
		int cod;
		op=Integer.parseInt(JOptionPane.showInputDialog("Seleccione Opcion\n"
				+ "1- Crear Producto\n"
				+ "2- Listar Productos\n"
				+ "3- Eliminar Producto\n"
				+ "0- Volver al Menu Anterior"));
		switch (op) {
		case 1:agregar_producto();			
			break;
		case 2:listar_productos();			
		break;
		case 3:cod=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Codigo del Producto a Eliminar"));
					int res=borrar_producto(cod);
					if(res==0)
						JOptionPane.showMessageDialog(null, "No Se Encontro Codigo");
					else
						JOptionPane.showMessageDialog(null, "Eliminado Correctamente!");
		break;
		case 0:			
		break;
		default: JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
			break;
		}
		}catch (Exception e) {
			op=4;
		}
		}while(op!=0);
	}

	private void agregar_producto() {
		try {
		 int cod=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Codigo del Producto: "));
		 String descrip=JOptionPane.showInputDialog("Ingrese Descripcion: ");
		 int cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cantidad del Producto: "));
		 producto prod=new producto(cod, descrip, cant);
		 productos.add(prod);
		 JOptionPane.showMessageDialog(null, "Producto Agregado Correctamente");
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al Crear Producto");
		}
	}
	
	private void listar_productos() {
		String salida="Listado de Productos\n";
		
		for (producto producto : productos) {
			salida=salida+producto.toString()+"\n";
		}
		JOptionPane.showMessageDialog(null, salida);
	}
	
	private int borrar_producto(int cod) {
		for (producto producto : productos) {
			if(producto.getCodigo()==cod) {
				productos.remove(producto);
				return 1;
			}
		}
		return 0;
	}
}
