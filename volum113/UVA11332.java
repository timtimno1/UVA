import java.util.Scanner;
public class UVA11332
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		while(true)
		{
			String data=in.nextLine();
			if(data.equals("0"))break;
			while(data.length()>1)
			{
				int sum=0;
				for(int i=0;i<data.length();i++)
				{
					sum+=data.charAt(i)-'0';
				}
				data=String.valueOf(sum);
			}
			System.out.println(data);
		}
	}
}