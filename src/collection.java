import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class collection {
	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println(a);
		ListIterator i=a.listIterator();
		while(i.hasNext())
		{
			Integer in=(Integer)i.next();
			if(in==3)
			{
				i.remove();
			}
			else if(in==5)
			{
				i.set(6);
			}
			else if(in==1)
			{
				i.add(9);
			}
			
			
			
		}
		

		System.out.println(a);
		
		
	}

}
