package gestorempleados.app;

import java.util.List;

import gestorempleados.dominio.Empleado;
import gestorempleados.dominio.Plantilla;
import gestorempleados.utils.Consola;

public class GestorEmpleados {

	private Plantilla pantilla;
	private Consola IEntradaSalida;

	public GestorEmpleados(Plantilla plantilla, Consola IEntradaSalida) {
		this.plantilla = plantilla;
		this.consola = IEntradaSalida;
	}

	public void ejecutar() {

	}

	public void contratarEmpleado() {

	}

	public void listarTodos() {

	}

	public void listarPorFiltros() {

	}

	public void listarEmpleados() {
		List<Empleado> lista = plantilla.listarEmpleados();
		if (lista.isEmpty())
			consola.escribirLinea("No hay empleados");
		else
			lista.forEach(e -> consola.escribirLinea(e.toString()));
	}

	public void ordenarPorNombre(List<Empleado> empleados) {

	}

}
