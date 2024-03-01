package Servicios;

import java.util.List;
import java.util.Scanner;

import Dto.pedidoDto;
import Dto.ventaDto;

public interface OperativaInterfaz {

	/*
	 * Se añadiran las ventas a la lista
	 * JL - 010324
	 */
	public void añadirVenta(Scanner sc, List<ventaDto> ventaLista);
	
	/*
	 * Aqui se calculara el total de ventas de un dia en especifico
	 * JL - 010324
	 */
	public void calculoTotalVentas(Scanner sc, List<ventaDto> ventaLista);
	
	/*
	 * Aqui se mostraran todas las ventas del dia
	 * JL - 010324
	 */
	public void mostrarVentasDia(Scanner sc, List<ventaDto> ventaLista);
	
	/*
	 * Con este metodo se podrán crear pedidos
	 * JL - 010324
	 */
	public void crearPedidoProveedores(Scanner sc, List<pedidoDto> pedidoLista);
}