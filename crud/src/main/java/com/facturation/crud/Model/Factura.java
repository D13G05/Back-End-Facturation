package com.facturation.crud.Model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Factura")
public class Factura {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int num_factura;
	
	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Cliente id_cliente;
	private String fecha;

	public Factura(int num_factura) {
		super();
		this.num_factura = num_factura;
	}

	public Factura() {
		super();
	}

	public int getNum_factura() {
		return num_factura;
	}

	public void setNum_factura(int num_factura) {
		this.num_factura = num_factura;
	}

	public Cliente getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Cliente id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	
}
