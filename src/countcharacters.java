
public class countcharacters {
	public static void main(String[] args) {
		int[] a={1,1,2,2,3,4,5,6,6};
		//char[] ch=s.toCharArray();
		
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				
					if(a[i]==a[j])
					{
						count++;
						a[j]=' ';
					
					}
			}
			if(a[i]!=' ')
			{
			System.out.println(a[i]+" is repeated "+count+" times");
			}
			
		}
		
	}

}
