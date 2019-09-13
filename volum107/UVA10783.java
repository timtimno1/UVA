import java.util.Scanner;
public class UVA10783
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int count=in.nextInt();
		int count_case=0;
		while(count_case++!=count)
		{
			int sum=0;
			int L=in.nextInt();
			int F=in.nextInt();
			for(int i=L;i<=F;i++)
			{
				if(i%2!=0)sum+=i;
			}
			System.out.println("Case " + count_case + ": " + sum);
		}
		
	}
}