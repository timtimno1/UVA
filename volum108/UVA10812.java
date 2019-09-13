import java.util.Scanner;
public class UVA10812
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int count=in.nextInt();
		while(count-->0)
		{
			int s=in.nextInt();
			int d=in.nextInt();
			boolean a=true;
			if(s>=d)
			{
				for(int i=0;i<=s;i++)
				{
					if(i-(s-i)==d)
					{
						System.out.println(i + " " + (s-i));
						a=false;
					}
				}
				if(a)System.out.println("impossible");
			}
			else
			{
				System.out.println("impossible");
			}
		}
	}
}