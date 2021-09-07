import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class UVA406
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		
		while(in.hasNext())
		{
			int N=in.nextInt();
			int C=in.nextInt();
			System.out.print(N + " " + C + ": ");
			
			List<Integer> prime=new ArrayList(N);
			for(int i=1;i<=N;i++)
				if(isPrime(i))
					prime.add(i);
			
			boolean isOdd=prime.size()%2==0? false : true ;
			int start=prime.size()/2-(isOdd?C-1:C);
			int end=start + ( isOdd ? 2*C-1 : 2*C );
			if(2*C>=prime.size())
			{
				start=0;
				end=prime.size();
			}
			for(int i=start;i<end;i++)
				System.out.print(prime.get(i) + (i==end-1?"":" "));
			System.out.println("\r\n");
		}
	}
	private static boolean isPrime(int data)
	{
		if(data<4)
			return true;
		else if(data%2==0)
			return false;
		else
			for(int i=3;i<=Math.sqrt(data);i++)
				if(data%i==0)
					return false;
		return true;
				
	}
}