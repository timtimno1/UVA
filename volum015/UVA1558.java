import java.util.Scanner;
public class UVA1558
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int count=in.nextInt();
		String a=in.nextLine(); 			//°²§ì
		while(count-- !=0)
		{
			String Line=in.nextLine();
			int sum=0;
			int fraction=0;
			for(int i=0;i<Line.length();i++)
			{
				if(Line.charAt(i)=='O')
				{
					sum+= ++fraction;
				}
				else
				{
					fraction=0;
				}
			}
			System.out.println(sum);
		}
	}
}
