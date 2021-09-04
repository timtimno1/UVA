# UVA10407 Simple division

---

[p10407.pdf](UVA10407.pdf)

---

## 重點

求最大公因數

---

- 整數序列 a[0], a[1], a[2], …, a[N-1] 要符合題意：
    - a[0] = q[0] * d + r
    - a[1] = q[1] * d + r
    - a[2] = q[2] * d + r
    - ….
    - a[N-1] = q[N-1] * d + r
- 相鄰兩項相減，可移除 r。
    - a[0] – a[1] = (q[0] – q[1]) * d
    - a[1] – a[2] = (q[1] – q[2]) * d
    - …
    - a[N-2] – a[N-1] = (q[N-2] – q[N-1]) * d
- d 為 {a[0] – a[1], a[1] – a[2], …, a[N-2] – a[N-1]} 的GCD。
- 測資含負數，因此先對前述數列取絕對值。
- 數列中可能有相等的數字（兩項差值為零），計算GCD需要避免發生除以0。

```java
import java.util.Scanner;
import java.util.Arrays;

public class main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		
		while(true)
		{
			String dataString=in.nextLine();
			if(dataString.equals("0"))break;
			
			String[] dataSplit=dataString.split(" ");
			int[] dataInt=new int[dataSplit.length-1];
			int[] data=new int[dataInt.length-1];
			for(int i=0;i<dataInt.length;i++)
				dataInt[i]=Integer.valueOf(dataSplit[i]);
			
			Arrays.sort(dataInt);
			for(int i=0;i<data.length;i++)
				data[i]=dataInt[i+1]-dataInt[i];
			System.out.println(doGcd(data));
			
		}
	}
	private static int doGcd(int[] data)
	{
		for(int i=0;i<data.length-1;i++)
			data[i+1]=gcd(data[i],data[i+1]);
		return data[data.length-1];
	}
	private static int gcd(int m,int n)
	{
		if(n==0)
			return m;
		else
			return gcd(n,m%n);
	}
}
```