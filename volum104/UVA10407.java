import java.util.Scanner;
import java.util.Arrays;

public class main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		
		while(true)
		{
			String dataString=in.nextLine();
			if(dataString.equals("0"))break;
			
			String[] dataSplit=dataString.split(" ");
			int[] dataInt=new int[dataSplit.length-1];
			int[] data=new int[dataInt.length-1];
			for(int i=0;i<dataInt.length;i++)
				dataInt[i]=Integer.valueOf(dataSplit[i]);
			
			Arrays.sort(dataInt);
			for(int i=0;i<data.length;i++)
				data[i]=dataInt[i+1]-dataInt[i];
			System.out.println(doGcd(data));
			
		}
	}
	private static int doGcd(int[] data)
	{
		for(int i=0;i<data.length-1;i++)
			data[i+1]=gcd(data[i],data[i+1]);
		return data[data.length-1];
	}
	private static int gcd(int m,int n)
	{
		if(n==0)
			return m;
		else
			return gcd(n,m%n);
	}
}