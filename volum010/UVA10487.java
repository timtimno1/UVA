import java.util.Scanner;
import java.util.Arrays;
public class main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int castCount=0;
		while(true)
		{
			int cast=in.nextInt();
			if(cast==0)break;
			
			System.out.println("Case " + (++castCount) + ":");
			
			int[] n=new int[cast];
			for(int i=0;i<cast;i++)
				n[i]=in.nextInt();
				
			int count=0;
			int[] sum=new int[((cast-1)+1)*(cast-1)/2];
			for(int i=0;i<cast;i++)
				for(int j=i+1;j<cast;j++)
					sum[count++]=n[i]+n[j];
					
			Arrays.sort(sum);
		
			int m=in.nextInt();
			while(m-->0)
			{
				int find=in.nextInt();
				System.out.println("Closest sum to " + find + " is " + binarySearch(sum,find) + ".");
			}
		}
	}
	private static int binarySearch(int[] sum,int find)
	{
		int up=sum.length-1;
		int low=0;
		
		while(up>=low)
		{
			int mid=(up+low)/2;
			if(sum[mid]>find)up=mid-1;
			else if(sum[mid]<find)low=mid+1;
			else return sum[mid];
		}
		if(find>sum[sum.length-1])return sum[sum.length-1];
		else if(find<sum[0])return sum[0];
		else return Math.abs(sum[up]-find) > Math.abs(sum[low]-find) ? sum[low]:sum[up];
	}
}