import java.util.Scanner;
public class UVA272
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		boolean judge=true;
		while(in.hasNext())
		{
			String Data=in.nextLine();
			for(int i=0;i<Data.length();i++)
			{
				if(Data.charAt(i)=='\"')
				{
					System.out.print(judge==true ? "``":"\'\'");
					judge=!judge;
				}
				else System.out.print(Data.charAt(i));
			}
			System.out.println();
		}
	}
}