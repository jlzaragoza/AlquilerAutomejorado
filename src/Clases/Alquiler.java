package Clases;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Alquiler extends Vehiculo {
	Scanner teclado = new Scanner(System.in);
	protected int codigo;
	protected int dni;
	protected String nombre;
	protected int edad;
	protected int kmRecorrido;
	protected int montoAlquiler;
	protected String formaPago;
	// constructores

	public Alquiler() {
		this.codigo = 0;
		this.dni = 0;
		this.nombre = "";
		this.edad = 0;
		this.kmRecorrido = 0;
		this.montoAlquiler = 0;

	}

	public void cargarAlquiler() {
		super.cargarVehiculo();
		this.dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Nª de Documento"));
		this.nombre = JOptionPane.showInputDialog("Ingrese Nombre");
		this.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad"));
		this.kmRecorrido = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Km Recorridos"));
		this.montoAlquiler = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Monto Alquiler"));

		/*
		 * System.out.println("Ingrese Dni: "); this.dni = teclado.nextInt();
		 * System.out.println("Ingrese Nombre:"); this.nombre = teclado.next();
		 * System.out.println("Ingrese Edad"); this.edad = teclado.nextInt();
		 * System.out.println("Ingrese Kilometro Recorrido"); this.kmRecorrido =
		 * teclado.nextInt(); System.out.println("Ingrese Monto Alquiler");
		 * this.montoAlquiler = teclado.nextInt();
		 */

		/*
		 * System.out.println(" Ingrese el metodo de pago");
		 * System.out.println(" 1 para efectivo ");
		 * System.out.println(" 2 para credito  ");
		 */

		int pago = JOptionPane.showOptionDialog(null, "Seleccione el Medio de Pago", "Selector de opciones",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "Efectivo", "Tarjeta" }, "opcion 1");

		int mt = 0;
		// mt=teclado.nextInt();
		mt = pago + 1;
		if (mt == 1) {
			// System.out.println(" El metodo de pago seleccionado es |   EFECTIVO   | ");
			 JOptionPane.showMessageDialog(null, "Procesando Cash");
			this.formaPago = " efectivo ";

		} else if (mt == 2) {
			// System.out.println(" El metodo de pago seleccionado es |   CREDITO   | ");
			JOptionPane.showMessageDialog(null, "Procesando Tarjeta de Credito");
		} else
			System.out.println(" La opcion ingresada es Incorecta ");

	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setDni(int dni) {

	}

	@Override
	public String toString() {
		return "Alquiler [Codigo= " + codigo + ", dni=" + dni + ", Nombre=" + nombre + ", Edad=" + edad
				+ ", KmRecorrido=" + kmRecorrido + ", MontoAlquiler=" + montoAlquiler + "]";
	}

	public void mostrar() {

		System.out.println(super.toString() + toString());
	}
}
