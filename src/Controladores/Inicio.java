package Controladores;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dto.pedidoDto;
import Dto.ventaDto;
import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;
import Servicios.OperativaImplementacion;
import Servicios.OperativaInterfaz;

public class Inicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MenuInterfaz mi = new MenuImplementacion();
		List<ventaDto> ventaLista = new ArrayList();
		List<pedidoDto> pedidoLista = new ArrayList();
		LocalDateTime fechaHoy = LocalDateTime.now();
		OperativaInterfaz oi = new OperativaImplementacion();
		
		boolean cerrarMenu = false;

		while (!cerrarMenu) {
			int seleccion = mi.menuSeleccionMenus(sc);
			switch (seleccion) {
			case 0: // Cierra el Menu
				cerrarMenu = true;
				break;
			case 1: // Menu gerencia
				boolean cerrarMenuGerencia = false;
				while (!cerrarMenuGerencia) {
					int seleccionGerencia = mi.menuGerencia(sc);
					switch (seleccionGerencia) {
					case 0:
						cerrarMenuGerencia = true;
						break;
					case 1:

						break;

					case 2:
							oi.crearPedidoProveedores(sc, pedidoLista);
						break;
					}
					break;
				}

			case 2: // Menu empleado
				boolean cerrarMenuEmpleado = false;
				while (!cerrarMenuEmpleado) {
					int seleccionEmpleado = mi.menuEmpleado(sc);
					switch (seleccionEmpleado) {
					case 0:
						cerrarMenuEmpleado = true;
						break;
					case 1: // Cálculo total de ventas diario
						oi.calculoTotalVentas(sc, ventaLista);
						break;

					case 2: // Añadir venta
						oi.añadirVenta(sc, ventaLista);
						break;
					}

				}
				break;
			}
		}
	}

}