package com.training.myapp;
@FunctionalInterface
interface CalculateInterface {
public   int calculate(int a,int b);
}



public class LambdaExpCalculate  {


public static void main(String[] args) {
	//int a=10,b=5;
	CalculateInterface add=(a,b)->a+b;
	CalculateInterface sub=(a,b)->a-b;
	CalculateInterface mul=(a,b)->a*b;
	CalculateInterface div=(a,b)->a/b;
	
	
	System.out.println("Addition of two numbers is: "+add.calculate(8, 56));
	System.out.println("Subtraction of two numbers is:"+sub.calculate(98,6));
	System.out.println("Multiplicatin of two numbers is:"+mul.calculate(78, 54));
	System.out.println("Division of two numbers is :"+div.calculate(90, 23));
	
	
}}




