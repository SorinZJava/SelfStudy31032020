package javaOpt;

public class MyOuter2 {
private String 	x= "Outer2";
void doStuff(){
	String z="local variable";// in java 8 merge si fara final (in java 7 deja nu mai merge!!)
	class MyInner{
		public void seeOuter(){
			System.out.println("Outer x is "+x);
			System.out.println("Local var z is "+z);  ///wont't compile!!
		}//close inner class method
	}//close inner class definition
MyInner test1 = new MyInner();
test1.seeOuter();
}//close outer class method dostuff()
public static void main(String[] args) {
	// TODO Auto-generated method stub
MyOuter2 test2 = new MyOuter2();
test2.doStuff();
}

}//close Outer class





