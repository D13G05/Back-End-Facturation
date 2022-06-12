package com.facturation.crud.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id_producto;
	private String nombre;
	private int precio;
	private short stock;
	
	public Producto(int id_producto) {
		super();
		this.id_producto = id_producto;
	}

	public Producto() {
		super();
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public short getStock() {
		return stock;
	}

	public void setStock(short stock) {
		this.stock = stock;
	}
	
	
	
}
