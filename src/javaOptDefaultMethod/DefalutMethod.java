package javaOptDefaultMethod;

interface Interfata{
	
	public void metInterf1();
	//public void metInterf2();
	default void metInterf3()
		{
		System.out.println("merge");
		};
	default int metInterf4(int t)
		{
		return t;	
		}
}	
public class DefalutMethod implements Interfata{

	public void metInterf1(){
		System.out.println("iuhii");
	}


public static void main (String args[]){
	
	DefalutMethod s=new DefalutMethod();
	s.metInterf3();
	System.out.println(s.metInterf4(6));
}

}
