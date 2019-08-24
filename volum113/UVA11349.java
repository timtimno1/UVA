import java.util.Scanner;
public class UVA11349
{
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		int test_data_number=in.nextInt();
		for(int i=0;i<test_data_number;i++)
		{
			boolean flag=true;
			String gar0=in.next(); String gar1=in.next(); //°²§ì
			int n=in.nextInt();
			long arr[]=new long[n*n];
			for(int j=0;j<n*n;j++)
			{
				arr[j]=in.nextInt();
			}
			for(int j=0;j<n*n;j++)
			{
				if(arr[j]!=arr[n*n-1-j] || arr[j]<0) { flag=false; break; }
			}
			if(flag)
			{
				System.out.println("Test #" + (i+1) + ":" + " Symmetric.");
			}
			else
			{
				System.out.println("Test #" + (i+1) + ":" + " Non-symmetric.");
			}
		}
	}
}