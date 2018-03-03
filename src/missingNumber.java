
public class missingNumber {
	public static void main(String[] args) {
		int sum=0;
		int count=0;
		int[] arr={1,2,3,4,6,8,7,9};
		int n=arr.length+1;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			count=n*(n+1)/2;
		}
		System.out.println(count-sum);
		
		
	}

}
