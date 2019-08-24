import java.util.Scanner;
public class UVA10008
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int data[]=new int[26];
		int Length=0;
		int count=in.nextInt();
		String a=in.nextLine();
		while(count-->0)
		{
			String temp;
			temp=in.nextLine();
			temp=temp.toUpperCase();
			Length+=temp.length();
			for(int i=0;i<temp.length();i++)
			{
				if('A'<=temp.charAt(i) && temp.charAt(i)<='Z')
				{
					data[(int)temp.charAt(i)-65]++;
				}
			}
		}
		while(--Length>0)
		{
			for(int i=0;i<26;i++)
			{
				if(data[i]==Length)
				{
					System.out.println( ( (char)(i+65) ) +" " + data[i]);
				}
			}
		}
	}
}