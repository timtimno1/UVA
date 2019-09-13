import java.util.Scanner;
public class UVA11349
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int count=in.nextInt();
		int count_Test=0;
		while(count-->0)
		{
			String a=in.nextLine();
			String fake[]=in.nextLine().split("\\s+");
			int n=new Integer(fake[2]);
			int data[]=new int[n*n];
			boolean check=true;
			for(int i=0;i<n*n;i++)
			{
				data[i]=in.nextInt();
			}
			for(int i=0;i<(n*n)/2;i++)
			{
				if(data[i]!=data[n*n-1-i] || data[i]<0 || data[n*n-1-i]<0)
				{
					check=false;
					break;
				}
			}
			count_Test++;
			if(check)System.out.println("Test #" + count_Test  + ": " + "Symmetric.");
			else System.out.println("Test #" + count_Test  + ": " + "Non-symmetric.");
		}
	}
}