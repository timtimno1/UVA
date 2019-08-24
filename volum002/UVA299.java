import java.util.Scanner;
import tim.*;
public class UVA299
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		dataclass data=new dataclass();
		int count=in.nextInt();
		for(int i=0;i<count;i++)
		{
			int data_length=in.nextInt();
			int temp_data[]=new int[data_length];
			data.set_data_length(data_length);
			for(int j=0;j<data_length;j++)
			{
				temp_data[j]=in.nextInt();
			}
			data.write_data(temp_data);
			data.bubble_sort();
			System.out.print("Optimal train swapping takes "+ data.count + " swaps.");
		}
	}
}