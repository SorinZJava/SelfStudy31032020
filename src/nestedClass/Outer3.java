package nestedClass;

//Exercise 1: 
//(1) Write a class named Outer that contains an inner class named Inner. 
//Add a method to Outer that returns an object of type Inner.
//In main( ), create and initialize a reference to an Inner.

//Exercise 3:
//(1) Modify Exercise 1 so that Outer has a private String field (initialized by the constructor),
//and Inner has a toString( ) that displays this field. 
//Create an object of type Inner and display it.

public class Outer3 {
	private String var;
	//constructor prin care se initializeaza variabila privata
	public Outer3(String x)
	{
		var=x;
	}
	
	
	class Inner
	{
		
			public Inner metOuter()
		{
			System.out.println("Creaza obiect al clasei Inner");
			return new Inner();
		}
			
			public String metReturnVar(){
				return var;
			}

	}
public static void main(String args[]){
Outer3.Inner refInner = new Outer3("Sorin").new Inner();
	System.out.println("variabila privata este: "+refInner.metReturnVar());
//	Outer refOuter = new Outer();
//	refOuter.metOuter();
}
}
