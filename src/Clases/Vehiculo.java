package Clases;

import java.util.Scanner;

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class Vehiculo {
	int op = 0, Auto = 0;
	Scanner teclado = new Scanner(System.in);
	protected String marca;
	protected String modelo;
	protected String ano;
	protected float precioKm;
	protected float seguroAlq;

	// constructores
	public Vehiculo() {
		this.marca = "";
		this.modelo = "";
		this.ano = "";
		this.precioKm = 0;
		this.seguroAlq = 0;
	}

	public void cargarVehiculo() {
		// System.out.println(" ingrese 1 para Fiat");
		// System.out.println(" ingrese 2 para Ford");
		// System.out.println(" ingrese 3 para Nissan");

		JCheckBox chec = new JCheckBox();
		int auto = JOptionPane.showOptionDialog(null, "Seleccione Marca del Auto", "Selector de opciones",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "Fiat", "Ford", "Nissan" }, "opcion 1");
		op = auto + 1;
		// op = teclado.nextInt();
		System.out.println("sssssss"+op);
		do {
			switch (op) {
			case 1:
				this.marca = "Fiat";
				this.modelo = "Idea";
				this.ano = "2017";
				this.precioKm = 0.5f;
				this.seguroAlq = 200;
				break;
			case 2:
				this.marca = "Ford";
				this.modelo = "focus";
				this.ano = "2018";
				this.precioKm = 1.0f;
				this.seguroAlq = 300;
				break;
			case 3:
				this.marca = "Nissan";
				this.modelo = "Tida";
				this.ano = "2016";
				this.precioKm = 1.5f;
				this.seguroAlq = 400;
				break;
			}
		} while (op != 1 && op != 2 && op != 3);
	}

	@Override
	public String toString() {
		return "Vehiculo [Marca=" + marca + ", Modelo=" + modelo + ", Ano=" + ano + ", PrecioKm=" + precioKm
				+ ", SeguroAlq=" + seguroAlq + "]";
	}

	public void mostrar() {

	}

}
