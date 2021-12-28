import java.util.Scanner;

public class UVA118
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String[] dirArray={"N","E","S","W"};
		int[] dirX={0,1,0,-1};
		int[] dirY={1,0,-1,0};
		int boundX=in.nextInt();
		int boundY=in.nextInt();
		int bountTotal=(boundX-1)*2+(boundY-1)*2;
		boolean[] lost=new boolean[bountTotal];
		for(int i=0;i<lost.length;i++)
				lost[i]=false;
	
		while(in.hasNext())
		{
			int x=in.nextInt();int y=in.nextInt();
			String robDir=in.nextLine().trim();
			String dir=in.nextLine().trim();
			boolean forBreak=false;
			int dirIndex=0;
			for(int i=0;i<4;i++)
				if(dirArray[i].equals(robDir))
					dirIndex=i;
			
			for(int i=0;i<dir.length();i++)
			{
				char temp=dir.charAt(i);
				switch(temp)
				{
					case 'F':
						boolean isOutBound = x+dirX[dirIndex] > boundX || y+dirY[dirIndex] > boundY || x+dirX[dirIndex] < 0 || y+dirY[dirIndex] < 0;
						if(isOutBound && !lost[x<boundX-1 && y<boundY ? bountTotal-(x+y):x+y])  //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						{
								lost[x<boundX-1 && y<boundY ? bountTotal-(x+y):x+y]=true;
								forBreak=true;
						}
						else if(!isOutBound)
						{
							x+=dirX[dirIndex];
							y+=dirY[dirIndex];
						}
						break;
					case 'R':
						dirIndex=(dirIndex+1)%4;
						break;
					case 'L':
						dirIndex=dirIndex-1<0?3:dirIndex-1;
						break;
				}
				if(forBreak)
					break;
			}
			System.out.println(x+" "+y+" "+dirArray[dirIndex] + (forBreak?" LOST":""));
		}
	}
}