
public class printnumberswithoutforloop {
	/*static void print(int i)
	{
		if(i<10)
		{
		System.out.println(i);
		i++;
		print(i);
		}
	}
	public static void main(String[] args) {
		print(1);
		
	}
*/
/*	public static void main(String[] args) {
		String s="milon mj hbjhc jhjhgjh";
		String[] words=s.split(" ");
		int count=0;
		for(int i=0;i<words.length;i++)
		{
			
				count++;
			
		}
		System.out.println(count);
	}
}
*/
	
	
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,2,1,6,5};
		
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]=' ';
				}
			
				
			}
			if(arr[i]!=' ')
			{
				System.out.println(arr[i]+ " NUMBER OCCURED "+count+" times.");
			}
			
		}
	
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
	