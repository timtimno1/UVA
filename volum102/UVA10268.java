import java.util.Scanner;
public class UVA10268
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int x=new Integer(in.nextLine());
			String a[]=in.nextLine().split("\\s+");
			long sum=0;
			int h[]=new int[a.length];
			int k[]=new int[a.length];
			int Length=a.length-1;
			for(int i=0;i<a.length;i++)
			{
				h[i]=Length--;
				k[i]=h[i]-1;
				h[i]*=Integer.valueOf(a[i]);
			}
			for(int i=0;i<a.length;i++)
			{
				if(k[i]>=0)
				{
					sum+=h[i]*Math.pow(x,k[i]);
				}
			}
			System.out.println(sum);
		}
	}
}