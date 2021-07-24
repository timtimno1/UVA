import java.util.Scanner;

public class UVA11743
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int count=in.nextInt();
		in.nextLine();//°²§ì
		
		while(count-->0)
		{
			String cardNumber=in.nextLine();
			cardNumber=cardNumber.replace(" ","");
			
			int sum=0;
			for(int i=0;i<cardNumber.length();i++)
				if(i%2==0 || i==0)
				{
					int temp=Integer.valueOf(""+cardNumber.charAt(i))*2;
					if(temp>9)
						sum+=(temp/10)+(temp%10);
					else
						sum+=temp;
				}
				else
					sum+=Integer.valueOf(""+cardNumber.charAt(i));	
			if(sum%10==0)
				System.out.println("Valid");
			else
				System.out.println("Invalid");
		}
	}
}