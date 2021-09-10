import java.util.Scanner;
import java.util.HashMap;

public class UVA12195
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		HashMap<Character,Float> dur=new HashMap(7);
		dur.put('W',1.0f);
		dur.put('H',1/2.0f);
		dur.put('Q',1/4.0f);
		dur.put('E',1/8.0f);
		dur.put('S',1/16.0f);
		dur.put('T',1/32.0f);
		dur.put('X',1/64.0f);
		while(in.hasNext())
		{
			String data=in.nextLine();
			if(data.equals("*"))break;

			float sum=0;
			int count=0;
			for(int i=0;i<data.length();i++)		
				if(data.charAt(i)=='/')
				{
					if(sum==1.0f)
						count++;
					sum=0;
				}
				else 
					sum+=dur.get(data.charAt(i));

			System.out.println(count);
		}
	}
}