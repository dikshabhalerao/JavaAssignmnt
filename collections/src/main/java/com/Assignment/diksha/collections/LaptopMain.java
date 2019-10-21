package com.Assignment.diksha.collections;

import java.util.HashSet;


public class LaptopMain {

	public static void main(String[] args) {
		HashSet<Laptop> laptop=new HashSet<Laptop>();
                laptop.add(new Laptop("Dell",760,"Windows5","corei4"));
		laptop.add(new Laptop("Lenovo",660,"Windowsxp","Rayzen"));
		laptop.add(new Laptop("Acer",420,"Windows10","corei2"));
		
		for(Laptop laptopvalues:laptop)
		{
			System.out.println(laptopvalues);
		}
	}

}
