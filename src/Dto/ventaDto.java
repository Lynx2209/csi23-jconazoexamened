package Dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ventaDto {

	/*
	 * Entidad encargada de las ventas
	 * JL - 010324
	 */
	
	//Variables
	public int idVenta;
	public float importeVenta = 0;
	LocalDateTime fechaVenta;
	
	
	//Getter y Setters
	public int getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}
	public float getImporteVenta() {
		return importeVenta;
	}
	public void setImporteVenta(float importeVenta) {
		this.importeVenta = importeVenta;
	}
	public LocalDateTime getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(LocalDateTime fechaHoy) {
		this.fechaVenta = fechaHoy;
	}
	
	//Constructor con las variables
	public ventaDto(int idVenta, float importeVenta, LocalDateTime fechaVenta) {
		super();
		this.idVenta = idVenta;
		this.importeVenta = importeVenta;
		this.fechaVenta = fechaVenta;
	}
	
	//Constructor vacio
	public ventaDto() {
		super();
	}
	
	
}