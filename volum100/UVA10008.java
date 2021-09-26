import java.util.Scanner;

public class main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int[] Char=new int[26];
		int len=0;
		int count=in.nextInt();
		in.nextLine();
		
		while(count-->0)
		{
			String data=in.nextLine().toUpperCase();
			len+=data.length();
			for(int i=0;i<data.length();i++)
			{
				int charTemp=data.charAt(i)-'A';
				if(charTemp>=0 && charTemp<=25)
					Char[charTemp]++;
			}
		}
		
		while(len-->1)
		{
			for(int i=0;i<Char.length;i++)
				if(Char[i]==len)
					System.out.println((char)(i+'A') + " " +Char[i]);
		}
	}
}