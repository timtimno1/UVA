import java.util.Scanner;
import java.util.ArrayList;

public class UVA993
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int count=in.nextInt();
		while(count-->0)
		{
			long number=in.nextLong();
			if(number<10)
			{
				System.out.println(number);
				continue;
			}
			ArrayList<Integer> data=new ArrayList(40);
			while(number!=1)
			{
				boolean end=false;
				for(int i=(number>=10?9:(int)number);i>1;i--)
					if(number%i==0)
					{
						data.add(i);
						number/=i;
						break;
					}
					else if(i==2)
						end=true;
				if(end)break;
			}
			if(number==1)
			{
				for(int i=data.size()-1;i>=0;i--)
					System.out.print(data.get(i));
				System.out.println();
			}
			else
				System.out.println("-1");
		}
	}
}