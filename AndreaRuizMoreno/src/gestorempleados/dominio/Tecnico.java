package gestorempleados.dominio;

public class Tecnico extends Empleado {

	private int categoria;

	public Tecnico(String dni, String nombre, String apellidos, double sueldoBase, int categoria) {
		super(dni, nombre, apellidos, sueldoBase);
		this.categoria = categoria;
	}

	public double getSueldo() {
		double sueldo;
		sueldo = this.getSueldoBase() + categoria * 100;
		return sueldo;
	}

	public String toString() {
		return String.format("DNI: %s\n, Nombre: %s\n, Apellidos: %s\n, SueldoBase: %d\n, Categoria: %d\n ", dni,
				nombre, apellidos, sueldoBase, categoria);
	}

}
