package javaOpt;

public class SingleInterfImpl implements Annotationuri3{
static int y=0;
	public void printArea(int x){
		y=y+1;
		x=y;
		System.out.println("Interfata 'Annotationuri3' a fost implemntata de "+x);
	}
	/*public void printArea(int x){
		y=y+1;
		x=y;
		System.out.println("Interfata 'Annotationuri3' a fost implemntata de "+x);
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
SingleInterfImpl test = new SingleInterfImpl();
test.printArea(0);
test.printArea(0);
}
}