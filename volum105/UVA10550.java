import java.util.Scanner;
public class UVA10550
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int a,b,c,d;
		while(true)
		{
		a=in.nextInt();b=in.nextInt();c=in.nextInt();d=in.nextInt();
		if(a==0 && b==0 && c==0 && d==0) break;
		System.out.println(1080+9*( ((a>b) ? (Math.abs(a-b))*2 : 40) - (Math.abs(a-b)) + ((c>b) ? (Math.abs(c-b))*2 : 40) - (Math.abs(c-b)) + ((c>d) ? (Math.abs(c-d))*2 : 40) - (Math.abs(c-d)) ));
		}
	}
}
