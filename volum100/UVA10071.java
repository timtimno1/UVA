import java.util.Scanner;
public class UVA10071
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int v=in.nextInt();
			int t=in.nextInt();
			System.out.println(2*v*t);
		}
	}
}