package com.krakedev.test;

import com.krakedev.Auto;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto("Hyundai", 2024, 54000);
		Auto auto2 = new Auto("Chevrolet", 20024, 65000);
		Auto auto3 = new Auto("Toyota", 2022, 45000);
		
		System.out.println("Marca: "+auto3.getMarca());
		System.out.println("Anio: "+auto3.getAnio());
		System.out.println("Precio: "+auto3.getPrecio());

		auto1.setMarca("Hyundai");
		auto1.setAnio(2024);
		auto1.setPrecio(54000);
		
		auto2.setMarca("Chevrolet");
		auto2.setAnio(20024);
		auto2.setPrecio(65000);
		
		System.out.println("Marca: "+auto1.getMarca());
		System.out.println("Anio: "+auto1.getAnio());
		System.out.println("Precio: "+auto1.getPrecio());
		
		System.out.println("------------");
		
		System.out.println("Marca: "+auto2.getMarca());
		System.out.println("Anio: "+auto2.getAnio());
		System.out.println("Precio: "+auto2.getPrecio());

	}

}
