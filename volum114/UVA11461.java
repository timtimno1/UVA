import java.util.Scanner;
public class UVA11461
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		while(true)
		{
			int a=in.nextInt();
			int b=in.nextInt();
			if(a==0 && b==0)break;
			int pow=0;
			for(int i=1;i<=b;i++)
			{
				for(int j=a;j<=b;j++)
				{
					if(j==Math.pow(i,2))
					{
						pow++;
					}
				}
			}
			System.out.println(pow);
		}
	}
}