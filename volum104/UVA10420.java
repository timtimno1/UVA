import java.util.Scanner;

public class UVA10420
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int count=in.nextInt();
		in.nextLine();
		int England=0;
		int Spain=0;
		
		while(count-->0)
		{
			String[] data=in.nextLine().split(" ");
			for(int i=0;i<data.length;i++)
				if(data[i].equals("England"))
					England++;
				else if(data[i].equals("Spain"))
					Spain++;
		}
		System.out.println("England " + England + "\r\n" + "Spain " + Spain);
	}
}