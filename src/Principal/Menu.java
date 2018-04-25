package Principal;

import java.util.Scanner;

import javax.swing.JOptionPane;

import Clases.Alquiler;
import Clases.Vehiculo;

public class Menu {
	 private static Scanner teclado;

	public static void main(String args[]) {
		teclado = new Scanner(System.in);
		int cap = 50, sw = 0, indice = 0;

		Vehiculo vAlquilo[] = new Vehiculo[cap];
		// JOptionPane.showMessageDialog(null, "Prog.Alquiler de Autos");

		do {
			// int chec = 0;
			int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Selector de opciones",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "Cargar", "Imprimir" }, "opcion 1");

			// System.out.println(" ingrese 1 para cargar datos");
			// System.out.println(" ingrese 2 para imprimir");
			// System.out.println(" ingrese 0 para Salir");
			// sw = teclado.nextInt();
			sw=seleccion +1;
			switch (sw) {
			case 1:
				if (indice < cap) {
					Alquiler objeto = new Alquiler();
					objeto.cargarAlquiler();
					objeto.setCodigo(indice + 1);
					vAlquilo[indice] = objeto;
					indice++;
				} else {
					System.out.println(" Supera el Tamaño de registro ");
				}
				break;
			case 2:
				for (int m = 0; m < indice; m++) {
					vAlquilo[m].mostrar();
				}
				break;
			case 0:
				System.out.println("Sauuuuu");
				break;
			default:
				System.out.println("Option no Valiter");
			}
		} while (sw != 0);
	}
}
