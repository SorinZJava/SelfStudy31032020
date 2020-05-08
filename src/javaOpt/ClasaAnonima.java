package javaOpt;
		
class ClasaAnonima 
{
	//declarare variabile (state)  al clasei "ClasaAnonima"
	//definirea unei interfete
	interface Interfata
	{
		String cuvant="merge";
		void metodaInterfata();
	}
	
	//definirea unei super clase
	 class ClasaSuperioara
	{
		int variab;
		public void metodaClasSup(int a)
		{
		
		}
	}
	 
	//declararea metodei (behaviour) al clasei "ClasaAnonima"
	public void utilizareClasaAnonima()
	{
		// implementarea interfetei "Interfata" prin intermediul unei clase anonime
				Interfata anonimInterf = new Interfata()
				{
					String cuvant="Implementarea interfetei prin intermediul unei clase anonime! - PASSED";
					@Override
					public void metodaInterfata()
					{
						System.out.println(cuvant);
					}
				};//aici se pune punct si virgula!!!
		
		//definirea si instantierea in acelasi timp al unei subclasei (al superclasei "ClasaSuperioara") prin intermediul unei clase anonime
		
				ClasaSuperioara anonimSubClasa = new ClasaSuperioara()
				{
					int variab=2;
					public void metodaClasSup(int a)
					{
						assert (a<0);
						System.out.println("Subclasa definita si instantata cu ajutorul unei clase anonime - PASSED:  "+a);
					}
				};//aici se pune punct si virgula!!!
				
	//apelarea metodelor instantei si a subclasei
	anonimInterf.metodaInterfata();
	anonimSubClasa.metodaClasSup(567);
	}
	
public static void main(String[] args) 
{
	
	ClasaAnonima x = new ClasaAnonima();
	
	x.utilizareClasaAnonima();
	
		
	}
}