import java.util.Scanner;
import java.lang.Math;
public class UVA10055
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			long a=in.nextLong();long b=in.nextLong();
			System.out.println(Math.abs(a-b));
		}
	}
}