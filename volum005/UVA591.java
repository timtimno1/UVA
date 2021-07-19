import java.util.Scanner;

public class main
{	
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int setNumber=0;
		while(in.hasNext())
		{
			if(in.nextInt()==0)break;
			in.nextLine();
			String[] dataString=in.nextLine().split(" ");
			int[] data=new int[dataString.length];
			
			int sum=0;
			for(int i=0;i<data.length;i++)
			{
				data[i]=Integer.valueOf(dataString[i]);
				sum+=data[i];
			}
			
			int count=0;
			int number=sum/data.length;
			for(int i=0;i<data.length;i++)
			{
				if(data[i]>number)
				{
					int diff=data[i]-number;
					data[i]-=diff;
					for(int j=0;j<data.length;j++)
					{
						if(diff==0)break;
						if(data[j]<number)
						{
							int max=number-data[j];
							if(diff>max)
							{
								data[j]+=max;
								count+=max;
								diff-=max;
							}
							else
							{
								data[j]+=diff;
								count+=diff;
								diff=0;
							}
						}
					}
				}
			}
			System.out.print("Set #" + (++setNumber) +"\r\nThe minimum number of moves is " + count + ".\r\n\r\n");
		}
	}
}