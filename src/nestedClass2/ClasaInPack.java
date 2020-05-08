package nestedClass2;
/*Exercise 6: (2) 
Create an interface with at least one method, in its own package. - FINALIZAT!
 
Create a class in a separate package. Add a protected inner class that implements the interface. 
In a third package, inherit from your class and, 
inside a method, return an object of the protected inner class, upcasting to the interface during the return.
		*/

import nestedClass1.Interfata;

public class ClasaInPack {
	protected class InnerClasa implements Interfata{
		 public InnerClasa(){
			
		}
		public void metInterfata(){
			
		}
	}
}
