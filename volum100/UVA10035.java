import java.util.Scanner;
public class UVA10035
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		while(true)
		{
			int a=in.nextInt();int b=in.nextInt();
			if(a==0 && b==0)break;
			int sum=0;
			int carry=0;
			while(true)
			{
				int a_cach=a%10;int b_cach=b%10;
				a/=10;b/=10;
				if(a_cach+b_cach+carry>=10)
				{
					carry=1;
					sum++;
				}
				else
				{
					carry=0;
				}
				if(a==0 && b==0)break;
			}
			if(sum==0)
			{
				System.out.println("No carry operation.");
			}
			else
			{
				String s=sum>1?"s." : ".";
				System.out.println(sum + " carry operation" + s);
			}
		}
	}
}