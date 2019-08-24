import java.util.Scanner;
public class UVA13185
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int count =in.nextInt();
		while(count!=0)
		{
			int number=in.nextInt();
			int sum=0;
			for(int i=1;i<=number/2;i++)
			{
				if(number%i==0) sum+=i;
			}
			if(sum==number) System.out.println("perfect");
			if(sum<number) System.out.println("deficient");
			if(sum>number) System.out.println("abundant");
			count--;
		}
	}
}
