import java.util.Scanner;
public class UVA10530
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int HIGH=11;
		int LOW=0;
		while(true)
		{
			int tmp=in.nextInt();
			String tmp00=in.nextLine();
			String tmpLine=in.nextLine();
			if(tmp==0)break;
			String toohigh="too high";
			String toolow="too low";
			String righton="right on";
			if(tmpLine.equals(toohigh) && (HIGH>tmp))HIGH=tmp;
			if(tmpLine.equals(toolow) && (LOW<tmp)) LOW=tmp;
			if(tmpLine.equals(righton))
			{
				if(tmp<HIGH && tmp>LOW)
				{
					System.out.println("Stan may be honest");
				}
				else
				{
					System.out.println("Stan is dishonest");
				}
			}
		}
	}
}
