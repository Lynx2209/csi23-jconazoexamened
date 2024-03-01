package Dto;

public class pedidoDto {

	/*
	 * Entidad encargada de los pedidos
	 * JL - 010324
	 */
	int idPedido;
	String producto;
	int cantidadProducto;
	String fechaEntrega;
	
	//Getter y Setters
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public int getCantidadProducto() {
		return cantidadProducto;
	}
	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	public String getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	
	//Constructor con las variables
	public pedidoDto(int idPedido, String producto, int cantidadProducto, String fechaEntrega) {
		super();
		this.idPedido = idPedido;
		this.producto = producto;
		this.cantidadProducto = cantidadProducto;
		this.fechaEntrega = fechaEntrega;
	}
	
	//Constructor vacio
	public pedidoDto() {
		super();
	}
	
	
	
	
}
