import java.util.Scanner;
import java.util.Arrays;
public class UVA11063
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int Case=1;
		while(in.hasNext())
		{
			int count=in.nextInt();
			int[] data=new int[count];
			int[] dataSum=new int[(1+(count-1))*(count-1)/2];
			for(int i=0;i<count;i++)
				data[i]=in.nextInt();
			
			int dataCount=0;
			for(int i=0;i<count;i++)
				for(int j=i+1;j<count;j++)
					dataSum[dataCount++]=data[i]+data[j];
			
			boolean isB2=true;
			Arrays.sort(dataSum);
			for(int i=0;i<dataSum.length-1;i++)
				if(dataSum[i]==dataSum[i+1])
					isB2=false;	
			System.out.println("Case #" + Case++  + ": It is " + (isB2?"":"not ") + "a B2-Sequence.\r\n");
		}
	}
}