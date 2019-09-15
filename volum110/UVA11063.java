import java.util.Scanner;
public class UVA11063
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();
			int data[]=new int[n];
			int data_sum[]=new int[(n+1)*n/2];
			int count=0;
			boolean judge=true;
			for(int i=0;i<n;i++)
			{
				data[i]=in.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				for(int j=i;j<n;j++)
				{
					data_sum[count++]=data[i]+data[j];
				}
			}
			for(int i=0;i<data_sum.length;i++)
			{
				for(int j=i+1;j<data_sum.length;j++)
				{
					if(data_sum[i]==data_sum[j])judge=false;
				}
			}
			if(judge)System.out.println("It is a B2-Sequence.");
			else System.out.println("It is not a B2-Sequence.");
		}
	}
}