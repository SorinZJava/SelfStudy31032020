package nestedClass;

public class TestParcel  {
	public static void main(String[] args) 
	{
		Parcel4 p = new Parcel4();
		Contents c = p.contents();
		Destination d = p.destination("Tasmania");
		//Illegal -- can’t access private class:
		//! Parcel4.PContents pc = p.new PContents();
		//Parcel4.PDestination pd = p.new PDestination("gfsd"); 
		//- nu merge cu toate ca e protected deoarece are o variabilia si costructorul private!
	}
} ///:~
