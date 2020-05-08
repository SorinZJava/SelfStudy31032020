package nestedClass3;

import nestedClass2.ClasaInPack;
import nestedClass1.Interfata;

/*Exercise 6: (2) 
Create an interface with at least one method, in its own package. - FINALIZAT!
 
Create a class in a separate package. Add a protected inner class that implements the interface. - FINALIZAT!
In a third package, inherit from your class and, 
inside a method, return an object of the protected inner class, upcasting to the interface during the return.
		*/
public class ClasaInPack3 extends ClasaInPack {

	public Interfata metoda (){
		ClasaInPack a = new ClasaInPack();
		
		//ClasaInPack.InnerClasa x = a.new InnerClasa();
		Interfata i = a.new InnerClasa();
		return i;
	}
}
