import java.util.Scanner;
public class UVA10093
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			char data[]=in.nextLine().toCharArray();
			int sum=0;
			int max=1;
			for(char temp:data)
			{
				int R=0;
				if(temp>=48 && temp<=57)R=temp-48;
				else if(temp>=65 && temp<=90)R=temp-55;
				else if(temp>=97 && temp<=122)R=temp-61;
				sum+=R;
				if(R>max)max=R;
			}
			for(int i=max;i<=62;i++)
			{
				if(i==62)
				{
					System.out.println("such number is impossible!");
					break;
				}
				if(sum%i==0)
				{
					System.out.println(i+1);
					break;
				}
			}
		}
	}
}