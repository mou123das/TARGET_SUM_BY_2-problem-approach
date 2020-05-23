import java.util.*;
class TARGET_SUM_BY_2
{
     public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.print("ENTER THE LENGTH OF THE ARRAY--> ");
		int n=sc.nextInt();//Reading the length of the array
		
		int a[]=new int[n];
		int i,j=n-1,f=0;
		
		for(i=0;i<n;i++)//Reading the elements
		{
			System.out.println("ENTER ELEMENT NUMBER "+(i+1));
			a[i]=sc.nextInt();
		}
		
		System.out.println("ENTER THE INTEGER--> ");
		int num=sc.nextInt();//Reading the integer
		
		Arrays.sort(a); //O(nlogn)
		i=0;
		
		while(j>i) //O(n)
		{
			if(a[i]+a[j]==num)
			{
				System.out.println(num+" is expressed as a sum of : "+a[i]+" and "+a[j]);
				f=1;
				break;
			}
			
			else if(a[i]+a[j]<num)
				i++;
			else 
				j--;
			
		}
		
		if(f==0)
			System.out.println("No such pair is found!!");
		
		sc.close();
	}
}