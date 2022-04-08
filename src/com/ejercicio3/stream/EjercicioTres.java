package com.ejercicio3.stream;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;



public class EjercicioTres {
	
	public static BigDecimal impuestos = new BigDecimal ("0");
	public static BigDecimal total = new BigDecimal("0");
	

	public static void main(String[] args) {



		List<Product> shoppingCart = List.of(
				
		new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
		new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
		new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
		new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
		new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
		new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));
		
		//Suma de los precios de la lista
		
		shoppingCart.stream().forEach(produ -> {
			impuestos = produ.getPrecios().multiply(produ.getTax().getPrecio());
			total = total.add(produ.getPrecios().add(impuestos));
		});
		System.out.println("El precio total de la compra es: " + total + "€");

		
		//Para la busqyeda por C
		shoppingCart.stream().forEach(clja ->{
			
		});
		
		Stream<Product> a = shoppingCart.stream().filter(pro ->pro.getNombre().startsWith("C")).sorted();
		a.forEach(pro ->System.out.println(pro.getNombre()));
		}

}
