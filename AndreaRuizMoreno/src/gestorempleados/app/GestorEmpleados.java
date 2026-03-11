package gestorempleados.app;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import gestorempleados.dominio.Empleado;
import gestorempleados.dominio.Plantilla;
import gestorempleados.utils.Consola;
import gestorempleados.utils.IEntradaSalida;

public class GestorEmpleados {

	private Plantilla plantilla;
	private IEntradaSalida consola;

	public GestorEmpleados(Plantilla plantilla, Consola IEntradaSalida) {
		this.plantilla = plantilla;
		this.consola = consola;
	}

	public void ejecutar() {
		int opcion;
		do {
			consola.mostrarMenu();
			opcion = consola.leerEntero("Elige una de las opciones: ");

			switch (opcion) {
			case 1 -> {
				contratarEmpleado();
				consola.pausa();
				consola.limpiarPantalla();
			}
			case 2 -> {
				listarTodos();
				consola.pausa();
				consola.limpiarPantalla();
			}
			case 3 -> {
				listarPorFiltros();
				consola.pausa();
				consola.limpiarPantalla();
			}
			case 4 -> consola.imprimirLinea("Salir");
			default -> consola.imprimirLinea("La opcion no es valida");

			}

		} while (opcion != 4);
	}

	public void contratarEmpleado() {

	}

	public void listarTodos() {

	}

	public void listarPorFiltros() {

	}

	public void listarEmpleados(List<Empleado> empleados) {
		for (Empleado e : empleados) {
			consola.imprimirLinea(e.toString());
		}
	}

	public void ordenarPorNombre(List<Empleado> empleados) {
		Collections.sort(empleados, Comparator.comparing(Empleado::getNombre));
	}

}
