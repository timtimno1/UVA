import java.util.Scanner;
public class UVA10056
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int count=in.nextInt();
		while(count-->0)
		{
			int n=in.nextInt();
			double p=in.nextDouble();
			double q=1-p;
			int k=in.nextInt();
			double h=(Math.pow(q,k-1)*p*(1-Math.pow(q,Math.pow(n,50))))/(1-(Math.pow(q,n)));
			if(p==0)System.out.println("0.0000");
			else System.out.printf("%.4f\r\n",h);
		}
	}
}