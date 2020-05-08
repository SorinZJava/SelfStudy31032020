package nestedClass;
//Exercise 5: 
//(1) Create a class with an inner class. 
//In a separate class (Outer5a), make an instance of the inner class.

public class Outer5a {
public static void main (String args[]){
	Outer5 test = new Outer5();
	Outer5.Inner5 a = test.new Inner5();
}
}
