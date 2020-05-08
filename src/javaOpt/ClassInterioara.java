package javaOpt;
public class ClassInterioara {
	public static void main(String[] args) {
		Exterior obiectExterior = new Exterior();
		Exterior.Interior obiectInterior = obiectExterior.new Interior();//apelam o metoda aunei clase interne unei alte clase 
			obiectInterior.metodaInterioara();
			obiectExterior.f(4,3);//apelam o metoda a unei clase care construieste un obiect al altei clase
	}
}
class Exterior{
	private int x=2;
	public class Interior{
		private int y=5;
		public void metodaInterioara(){
			System.out.println("x=" + x);
			System.out.println("y=" + y);
		}
	}
	public void metodaExterioara(){
		System.out.println("x=" + x);
	}
	public void f(int xx, final int yy){
		int a=xx+yy;
		 int b=xx-yy;// nu putem accesa variabila locala a metodei "f()" dintr-o clasa interioara, in caz contrar se obtine eroare la compilare
		class Interioara{
			public void metodaInterioara(){  //aceasta va afisa valorile atributului final "b" si ale atributului "x" al clasei "Exterior"
				System.out.println("x=" + x);
				System.out.println("b=" + b);
			}
		}
		Interioara obiectInteriorSecund = new Interioara();
		obiectInteriorSecund.metodaInterioara();
		
	}
}