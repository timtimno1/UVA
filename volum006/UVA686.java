import java.util.Scanner;

public class UVA686
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		
		while(true)
		{
			int number=in.nextInt();
			if(number==0)break;
			
			int count=0;
			for(int i=2;i<=number/2;i++)
				if(isPrime(i) && isPrime(number-i))
					count++;

			System.out.println(count);
			
		}
	}
	private static boolean isPrime(int number)
	{
		if(number%2==0)
			return false;
		else if(number>2)
		{
			int sqrt=(int)Math.sqrt(number);
			for(int i=3;i<=sqrt;i+=2)
				if(number%i==0)
					return false;
			return true;
		}
		else
			return false;
	}
}