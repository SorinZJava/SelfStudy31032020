package nestedClass;

//: innerclasses/Sequence.java
//Holds a sequence of Objects.

interface Selector 
	{
		boolean end();
		Object current();
		void next();
	}

public class Sequence 
	{
		private Object[] items;
		private int next = 0;
		
		//constructor al clasei "Sequence"
		public Sequence(int size) 
			{ 
				items = new Object[size]; 
			}
		public void add(Object x) 
			{
				if(next < items.length)
				items[next++] = x;
				//System.out.println("next= "+next);
			}
		
		//inner class "SequencerSelector"
		private class SequenceSelector implements Selector 
			{
				private int i = 0;
				
				public boolean end() 
				{ 
					return i == items.length; 
				}
				public Object current() 
				{ 
					return items[i]; 
				}
				public void next() 
				{
					if(i < items.length) i++; 
				}
				//Exercise 4:
				//(2) Add a method to the class Sequence.SequenceSelector 
				//that produces the reference to the outer class Sequence.
				public Sequence metEx4()
				{
					return Sequence.this;
				}
			}
		//metoda ce returneaza un obiect al clasei interne "SequenceSelector" 
		//care implementeza Interfata "Selector"
		public Selector selector() 
		{
			return new SequenceSelector();
		}
		
	public static void main(String[] args) 
		{
			//creaza o referinta/un obiect a clasei "Sequence", 
			//initializand variabila privata "items", care este un sir de tipul Object lung de 10
			Sequence sequence = new Sequence(10);
			for(int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
			
			//se creaza o referinta pentru clasa interna; 
			//metoda selector() creaza obiectul calsei interne
			Selector selector = sequence.selector();
			//end() este o metoda de tipul boolean al calsei interne
			//operatorul "!" este echivalent la "NOT" aferent unui tip boolean
			while(!selector.end()) 
			{
				System.out.print(selector.current() + " ");
				selector.next();
			}
		}
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
