package javaOptLambdaExpression;

import java.util.function.Function;

public class SingleExpression {

	//fara parametru
	interface Interfata1 {
		double metInterf1();
	}
	
	//cu parametru
	interface Interfata2{
		double metInterf2(int t);
	}
	
	//Function
	

	public static void main(String args[]) {
		Interfata1 a = () -> 98.48;
		System.out.println(a.metInterf1());
	

		Interfata2 b = (t)-> 3*t;
		System.out.println(b.metInterf2(3));
		
		Function <Integer,Integer> c= (t)->t*2;
		System.out.println(c.apply(3));
}
}