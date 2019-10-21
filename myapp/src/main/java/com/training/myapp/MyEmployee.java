package com.training.myapp;

import com.training.myapp.model.Employee;
import com.training.myapp.model.Manager;
import com.training.myapp.model.MarketingExecutive;

public class MyEmployee {
	public static void main(String[] args) {
		Employee e=new Employee(151,"abvgfd",120000);
		System.out.println(e);
	
		Manager e1=new Manager(112,"abc",50000);
		e1.showDetails(new Employee(112,"abc",50000));
		Employee ex=new MarketingExecutive(113,"ehhfg",800,90);
		ex.showDetails(new Employee(113,"sdhd",80000));

		
	}

}
