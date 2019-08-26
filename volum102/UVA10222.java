import java.util.Scanner;
public class UVA10222
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String standard="1234567890-=qwertyuiop[]asdfghjkl;'zxcvbnm,./";
		while(in.hasNext())
		{
			String temp=in.nextLine();
			temp=temp.toLowerCase();
			for(int i=0;i<temp.length();i++)
			{
				if(temp.charAt(i)==' ')System.out.print(" ");
				for(int j=0;j<standard.length();j++)
				{
					if(temp.charAt(i)==standard.charAt(j))System.out.print(standard.charAt(j-2));
				}
			}
			System.out.print("\r\n");
		}
	}
}