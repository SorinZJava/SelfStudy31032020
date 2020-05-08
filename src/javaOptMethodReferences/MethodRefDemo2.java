package javaOptMethodReferences;

public class MethodRefDemo2 {
	
		
	public static void main (String args[]){
		boolean result;
		MyIntNum a = new MyIntNum(6);	
		MyIntNum b = new MyIntNum(12);
		
		IntPredicate ip = a::isFactor;
		result=ip.test(2);
		if (result) System.out.println("2 este factor la 6"); 
		
		ip=b::isFactor;
		result=ip.test(5);
		if (!result) System.out.println("5 nu este factor la 12");
	}
	
}
