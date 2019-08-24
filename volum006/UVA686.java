import java.util.Scanner;
public class UVA686
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		while(true)
		{
			int number=in.nextInt();
			int count=0;
			if(number==0) break;	
			for(int i=2;i<=number/2;i++)
			{
				if(Prime(i)==true && Prime(number-i)==true)
				{
					count++;
				}
			}
		
			System.out.println(count);
		}
	}
	static boolean Prime(int a)
	{
		int i;
		for(i=2;i<=a-1;i++)
		{
			if(a%i==0)
			{
				break;
			}
		}
		if(i==a)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
