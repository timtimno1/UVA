import java.util.Scanner;

public class UVA11995
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		
		while(in.hasNext())
		{
			int dataNumbers=in.nextInt();
			
			int[] dataPush=new int[dataNumbers];int pushCount=0;
			int[] dataPull=new int[dataNumbers];int pullCount=0;
			for(int i=0;i<dataNumbers;i++)
			{
				if(in.nextInt()==1)
					dataPush[pushCount++]=in.nextInt();
				else
					dataPull[pullCount++]=in.nextInt();
			}
			for(int i:dataPush)
			{
				System.out.print(i+" ");
			}
			System.out.println();
			for(int i:dataPull)
			{
				System.out.print(i+ " ");
			}
			System.out.println("\r\n");
		}
	}
}