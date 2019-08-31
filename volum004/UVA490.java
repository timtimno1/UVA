import java.util.Scanner;
public class UVA490
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String Data[]=new String[100];
		int count=0;
		int Length=0;
		int log=0;
		while(in.hasNext())
		{
			Data[count]=in.nextLine();
			if(Data[count].length()>Length)
			{
				Length=Data[count].length();
				log=count;
			}
			count++;
		}
		for(int i=0;i<Length;i++)
		{
			for(int j=count-1;j>=0;j--)
			{
				if(i+1>Data[j].length() && j>log)System.out.print(" ");
				System.out.print(i+1>Data[j].length()?"":Data[j].charAt(i));
			}
			System.out.println();
		}
	}
}