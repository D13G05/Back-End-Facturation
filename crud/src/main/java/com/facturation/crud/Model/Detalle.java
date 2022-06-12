package com.facturation.crud.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Detalle")
public class Detalle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int num_detalle;
	@ManyToOne
	@JoinColumn(name = "num_factura")
	private Factura num_factura;
	@ManyToOne
	@JoinColumn(name = "id_producto")
	private Producto id_producto;
	private int cantidad;
	private int precio;
	
	
	public Detalle() {
		super();
	}

	public int getNum_detalle() {
		return num_detalle;
	}

	public void setNum_detalle(int num_detalle) {
		this.num_detalle = num_detalle;
	}

	public Factura getNum_factura() {
		return num_factura;
	}

	public void setNum_factura(Factura num_factura) {
		this.num_factura = num_factura;
	}

	public Producto getId_producto() {
		return id_producto;
	}

	public void setId_producto(Producto id_producto) {
		this.id_producto = id_producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
	
}
