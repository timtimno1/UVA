import java.util.Scanner;
public class UVA10252
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			String data_up=in.nextLine();
			String data_dow=in.nextLine();
			int table0[]=new int[26];
			int table[]=new int[26];
			for(int i=0;i<data_up.length();i++)
				if(data_up.charAt(i)>='a'&&data_up.charAt(i)<='z')table0[(int)data_up.charAt(i)-97]++;	
			for(int i=0;i<data_dow.length();i++)
				if(data_dow.charAt(i)>='a'&&data_dow.charAt(i)<='z')table[(int)data_dow.charAt(i)-97]++;	
			for(int i=0;i<26;i++)
				if(table0[i]>0 && table[i]>0)
					for(int j=0;j<(table0[i]>table[i]?table[i]:table0[i]);j++)System.out.print((char)(i+97));
			System.out.println();
		}
	}
}