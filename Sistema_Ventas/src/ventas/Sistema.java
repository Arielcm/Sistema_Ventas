package ventas;

import javax.swing.JOptionPane;

public class Sistema {

	public static void main(String[] args) {
	
		ListaClientes list= new ListaClientes();
		Stock stock = new Stock();
		int op;
		do {
		try {
		
			op=Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL\n"
					+ "1- Clientes\n"
					+ "2- Productos\n"
					+ "0- Salir"));
			switch (op) {
			case 1:list.menu();
				break;
			case 2:stock.menu();
			break;
			case 0:JOptionPane.showMessageDialog(null, "Gracias Vuelva Pronto!");
			break;

			default:JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
				break;
			}

		}catch (Exception e) {
			op=4;
			System.out.println("Exception en Clase Sistema");
		}
		}while(op!=0);

	}

}
