import java.util.Scanner;
import java.util.Arrays;

public class UVA12650
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		
		while(in.hasNext())
		{
			int personNumber=in.nextInt();
			int survivorNumber=in.nextInt();
			in.nextLine(); //Fake catch
			if(personNumber==survivorNumber)
			{
				System.out.println("*");
				in.nextLine();
				continue;			
			}
			
			String[] temp=in.nextLine().split(" ");
			int[] soldier=new int[survivorNumber];
			for(int i=0;i<survivorNumber;i++)
				soldier[i]=Integer.valueOf(temp[i]);
			Arrays.sort(soldier);
			
			int offset=0;
			for(int i=1;i<=personNumber;i++)
				if(offset<survivorNumber && soldier[offset]!=i || offset>=survivorNumber)
					System.out.print(i+" ");
				else
					offset++;
			System.out.println();
		}
	}
}