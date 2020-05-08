package javaOptMethodReferences;

public class MyIntPredicates {

	static boolean isPrime(int i){
		if (i<2) return false;
		
		for (int j=2; j<= i/j; j++){
		if ((i%j)==0) return false;
		}
		return true;
		
	}
	
	static boolean isEven(int i){
		if (i%2==0) return true;
		return false;
				
	}
	
	static boolean isPositive(int i){
		if (i>0) return true;
		return false;
		
	}
}
