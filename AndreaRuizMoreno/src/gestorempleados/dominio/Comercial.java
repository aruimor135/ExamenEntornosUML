package gestorempleados.dominio;

public class Comercial extends Empleado {

	private double ventas;

	public Comercial(String dni, String nombre, String apellidos, double sueldoBase) {
		super(dni, nombre, apellidos, sueldoBase);
	}

	public void setVentas(double ventas) {
		this.ventas = ventas;
	}

	public double getSueldo() {
		double sueldo;
		sueldo = this.getSueldoBase() + ventas * 0.1;
		return sueldo;
	}

	public String toString() {
		return String.format("DNI: %s\n, Nombre: %s\n, Apellidos: %s\n, SueldoBase: %d\n, Ventas: %d\n ", dni, nombre,
				apellidos, sueldoBase, ventas);
	}
}
