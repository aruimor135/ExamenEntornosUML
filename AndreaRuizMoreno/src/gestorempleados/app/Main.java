package gestorempleados.app;

import gestorempleados.dominio.Empleado;
import gestorempleados.utils.Consola;

public class Main {

	public static void main(String[] args) {

		Consola consola = new Consola();
		Empleado empleado = new Empleado();
		GestorEmpleados gestorEmpleado = new GestorEmpleados(consola, empleado);
		int opcion = -1;

		do {
			menu.mostrar();
			opcion = menu.leerOpcion();

			switch (opcion) {
			case 1 -> {
				gestorAgenda.agregarContacto();
			}
			case 2 -> gestorAgenda.listarContactos();
			case 3 -> gestorAgenda.buscarContactos();
			case 4 -> gestorAgenda.borrarContactos();
			case 5 -> gestorAgenda.agregarTelefono();
			case 0 -> consola.escribirLinea("¡Hasta luego!");
			default -> consola.escribirLinea("Opción no válida, inténtalo de nuevo.");
			}

		} while (opcion != 0);

		consola.cerrar();
	}
}