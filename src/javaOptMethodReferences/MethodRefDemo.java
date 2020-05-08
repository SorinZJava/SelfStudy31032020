package javaOptMethodReferences;

public class MethodRefDemo {

	static boolean numTest(IntPredicate a, int v){
		
		return a.test(v);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result;

		result= numTest(MyIntPredicates::isPrime,7);
		if (result) System.out.println("Number 7 is prime");
		
		result=numTest(MyIntPredicates::isEven,12);
		if (result) System.out.println("Number 12 is Even");
		
		result=numTest(MyIntPredicates::isPositive,-3);
		if (result) System.out.println("Number -3 is positive");
		else System.out.println("Number -3 is  negative");
	}

}
