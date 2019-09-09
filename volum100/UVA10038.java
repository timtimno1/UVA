import java.util.Scanner;
import java.util.Arrays;
public class UVA10038
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			boolean data_b=true;
			int count=in.nextInt();
			int data[]=new int[count];
			int data_abs[]=new int[count-1];
			for(int i=0;i<count;i++)
			{
				data[i]=in.nextInt();
			}
			for(int i=0;i<count-1;i++)
			{
				data_abs[i]=Math.abs(data[i]-data[i+1]);
			}
			Arrays.sort(data_abs);
			for(int i=0;i<data_abs.length;i++)
			{
				if(data_abs[i]!=i+1)
				{
					data_b=false;
				}
			}
			if(data_b)System.out.println("Jolly");
			else System.out.println("Not jolly");
		}
	}
}