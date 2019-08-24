import java.util.Scanner;
public class UVA10783
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int count=in.nextInt();
		for(int i=1;i<=count;i++)
		{
			int Fnumber=in.nextInt();
			int Rnumber=in.nextInt();
			int sum=0;
			for(int j=Fnumber;j<=Rnumber;j++)
			{
				if( (j%2) != 0 )
				{
					sum+=j;
				}
			}
			System.out.println("Case " + i + ": " + sum);
		}
	}
}