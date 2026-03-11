package gestorempleados.app;

import gestorempleados.dominio.Plantilla;
import gestorempleados.utils.Consola;

public class Main {

	public static void main(String[] args) {

		Consola consola = new Consola();
		Plantilla plantilla = new Plantilla();
		GestorEmpleados gestorEmpleados = new GestorEmpleados(plantilla, consola);

		gestorEmpleados.ejecutar();
	}
}