package Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

	public int menuYSeleccion(Scanner sc) {
		System.out.println("Que quieres hacer");
		System.out.println("-------------------------------");
		System.out.println("1. Cerrar menu");
		System.out.println("2. Añadir Venta");
		System.out.println("3. Mostrar las Ventas del dia");
		System.out.println("4. Cálculo total de ventas diario");
		System.out.println("5. Crear pedido para proveedores ");
		System.out.println("-------------------------------");
		int seleccion = sc.nextInt();
		return seleccion;
	}
}
