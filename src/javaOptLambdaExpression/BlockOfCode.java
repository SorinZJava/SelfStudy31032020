package javaOptLambdaExpression;
//gaseste cel mai mic factor positiv al unui nr
public class BlockOfCode {
interface Interfata{
	int metInterf(int t);
}

	public static void main(String args[]){
		
		Interfata a= (t)->{
			int result=1;
			//returneaza valoarea pozitiva a nr
			t=t<0 ? -t:t;
			for (int i=2; i<=t/i;i++)
				if ((t%i)==0) {
					result=i;
				break;
			}
			return result;
			
		};
		System.out.println(a.metInterf(-6));
	}

}
