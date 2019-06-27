package ventas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ListaClientes {
	List<Cliente> clientes = new ArrayList<Cliente>();
	
	public void menu(){
		int op;
		do {
		try {
		int dni;
		op=Integer.parseInt(JOptionPane.showInputDialog("Seleccione Opcion\n"
				+ "1- Crear Cliente\n"
				+ "2- Listar Clientes\n"
				+ "3- Eliminar Cliente\n"
				+ "0- Volver al Menu Anterior"));
		switch (op) {
		case 1:agregar_cliente();			
			break;
		case 2:listar_clientes();			
		break;
		case 3:dni=Integer.parseInt(JOptionPane.showInputDialog("Ingrese DNI del Cliente a Eliminar"));
					int res=borrar_cliente(dni);
					if(res==0)
						JOptionPane.showMessageDialog(null, "No Se Encontro DNI");
					else
						JOptionPane.showMessageDialog(null, "Eliminado Correctamente!");
		break;
		case 0:			
		break;
		default: JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
			break;
		}
		}catch (Exception e) {
			System.out.println("Exception en Clase ListaClientes - Metodo Menu");
			op=4;
		}
		}while(op!=0);
	}
	
	private void agregar_cliente() {
		try {
		 int dni=Integer.parseInt(JOptionPane.showInputDialog("Ingrese DNI del Cliente: "));
		 String nombre=JOptionPane.showInputDialog("Ingrese Nombre del Cliente: ");
		 String apellido=JOptionPane.showInputDialog("Ingrese Apellido del Cliente: ");
		 Cliente cte = new Cliente(dni, nombre, apellido);
		 clientes.add(cte);
		 JOptionPane.showMessageDialog(null, "Cliente Agregado Correctamente");
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al Crear el Cliente");
			System.out.println("Exception en Clase ListaClientes - Metodo Agregar_Cliente");
		}
	}
	
	private void listar_clientes() {
		String salida="Listado de Clientes\n";
		
		for (Cliente cliente : clientes) {
			salida=salida+cliente.toString()+"\n";
		}
		JOptionPane.showMessageDialog(null, salida);
	}
	
	private int borrar_cliente(int dni) {
		for (Cliente cliente : clientes) {
			if(cliente.getDni()==dni) {
				clientes.remove(cliente);
				return 1;
			}
		}
		return 0;
	}
}
