import java.util.Scanner;
import java.util.Arrays;

public class UVA11364
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		in.nextLine();
		while(in.hasNext())
		{
			in.nextLine();
			
			String dataString=in.nextLine();
			String[] dataSplit=dataString.split(" ");
			
			int[] data=new int[dataSplit.length];
			for(int i=0;i<data.length;i++)
				data[i]=Integer.valueOf(dataSplit[i]);
			
			Arrays.sort(data);
			System.out.println((data[data.length-1]-data[0])*2);
		}
	}
}