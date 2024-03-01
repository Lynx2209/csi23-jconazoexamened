package Servicios;

import java.util.Scanner;

public interface MenuInterfaz {
	/*
	 * Muestra la implementacion del menu para seleccionar otros menus
	 * JL -010324
	 */
	public int menuSeleccionMenus(Scanner sc);
	
	/*
	 * Muestra la imlementacion del menu empleado
	 * JL - 010324
	 */
	public int menuEmpleado(Scanner sc);
	
	/*
	 * Muestra la imlementacion del menu gerencia
	 * JL - 010324
	 */
	public int menuGerencia(Scanner sc);
}