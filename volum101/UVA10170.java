import java.util.Scanner;
public class UVA10170
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			long s=in.nextLong();
			long d=in.nextLong();
			long count=1;
			while(count<=d)
			{
				count+=(s++);
			}
			System.out.println(s-1);
		}
	}
}