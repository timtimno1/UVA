package tim;
public class dataclass
{
	int data[];
	int data_length;
	public int count=0;
	public void set_data_length(int a)
	{
		data_length=a;
		data=new int[data_length];
	}
	public void write_data(int... a)
	{
		for(int i=0;i<data_length;i++)
		{
			data[i]=a[i];
		}
	}
    public void bubble_sort()
    {
    	count=0;
    	for(int i=0;i<data_length-1;i++)
    	{
    		for(int j=1;j<data_length;j++)
    		{
    			if(data[j-1]>data[j])
    			{
    				int temp=data[j-1];
    				data[j-1]=data[j];
    				data[j]=temp;
    				count++;
    			}
    		}
    	}
    }
}
