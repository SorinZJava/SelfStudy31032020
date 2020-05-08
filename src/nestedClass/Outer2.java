package nestedClass;
//Exercise 2:
//(1) Create a class that holds a String, and has a toString( ) method that displays this String.
//Add several instances of your new class to a Sequence object, then display them.

public class Outer2 {
	
String variabila="x";
public String toString(){
//	System.out.println("Stringul este : "+variabila);
	return variabila;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sequence sequence = new Sequence(5);
		for(int i = 0; i < 5; i++)
		sequence.add(new Outer2());
		
		Selector selector = sequence.selector();
		//end() este o metoda de tipul boolean al calsei interne
		//operatorul "!" este echivalent la "NOT" aferent unui tip boolean
		while(!selector.end()) 
		{
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}

}
