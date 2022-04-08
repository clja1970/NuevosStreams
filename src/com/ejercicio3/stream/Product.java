package com.ejercicio3.stream;

import java.math.BigDecimal;

public class Product implements Comparable <Product>{

	BigDecimal precios;
	String nombre;
	Tax tax;
	public BigDecimal getPrecios() {
		return precios;
	}
	public void setPrecios(BigDecimal precios) {
		this.precios = precios;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Tax getTax() {
		return tax;
	}
	public void setTax(Tax tax) {
		this.tax = tax;
	}
	public Product( String nombre,BigDecimal precios, Tax tax) {
		this.precios = precios;
		this.nombre = nombre;
		this.tax = tax;
	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
