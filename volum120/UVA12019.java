import java.util.Scanner;
public class UVA12019
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int count=in.nextInt();
		String date[]={"Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday"};
		while(count-->0)
		{
			int m=in.nextInt();
			int d=in.nextInt();
			int sum=0;
			switch(m-1)
			{
				case 11:
					sum+=30;
				case 10:
					sum+=31;
				case 9:
					sum+=30;
				case 8:
					sum+=31;
				case 7:
					sum+=31;
				case 6:
					sum+=30;
				case 5:
					sum+=31;
				case 4:
					sum+=30;
				case 3:
					sum+=31;
				case 2:
					sum+=28;
				case 1:
					sum+=31;
			}
			sum+=d;
			System.out.println(date[sum%7]);
		}
	}
}