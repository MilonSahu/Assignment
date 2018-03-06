import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s={"fb","gmail","fb","insta"};
		HashSet hs=new HashSet<>(Arrays.asList(s));
		String[] s2=new String[hs.size()];
		Iterator i1=hs.iterator();
		
		int i=0;
		while(i1.hasNext()){
		s2[i++]=(String)i1.next();
		
		}System.out.println(Arrays.toString(s2));
//hi i am milon
	}

}
