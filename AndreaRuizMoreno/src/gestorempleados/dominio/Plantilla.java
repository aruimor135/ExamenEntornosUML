package gestorempleados.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Plantilla {
	private List<Empleado> empleados;

	public Plantilla() {
		empleados = new ArrayList<>();
	}

	public void agregarEmpleado(Empleado a) {
		empleados.add(a);
	}

	public List<Empleado> getEmpleadosPorNombre(String filtroNombre) {
		Collections.sort(empleados, Comparator.comparing(Empleado::getNombre));
		return empleados;
	}

}