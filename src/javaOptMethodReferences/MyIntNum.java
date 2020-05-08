package javaOptMethodReferences;

public class MyIntNum {
	private int c;
	
	MyIntNum (int f){
		c=f;
	}
	int getNum (){
		return c;
	}
	boolean isFactor(int i){
		
		return (c%i)==0;
	}

}
