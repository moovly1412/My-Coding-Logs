import java.util.*;
class Week12_API2
{
	Scanner scan=new Scanner(System.in);
	String read()
	{
		System.out.print("Input ID:");
		String id=scan.nextLine();
		return id;
	}
	int process(String id)	
	{
		String turnid = id.replaceAll("[-\\s+]","");
		if (!turnid.matches("[0-9]+")) {
            return -1;
        }
		String[] array = turnid.split("");
		int y[]=new int[array.length];
		int result[]=new int[array.length];
		for (int i=0;i<array.length;i++ )
		{
			y[i] = Integer.valueOf(array[i]);
		}
		System.out.println();
		int o=y.length,sum=0;
		for (int i=0;i<y.length ;i++)
		{	
			result[i]=y[i]*o;
			o--;
			if (o==0)
			{
				break;
			}
			sum=sum+result[i];
			System.out.print(result[i]+" ");
		}
		System.out.println();
		for (int i=0;i<y.length-1;i++ )
		{
			System.out.printf("%d+",result[i]);
		}
		System.out.printf("\b=%d",sum);
		System.out.println();
		return sum;
	}
	int next(int sum)
	{
		int result=sum%11;
		System.out.printf("%d %% 11 = %d",sum,result);
		System.out.println();
		int x=11-result;
		int y=x%10;
		System.out.printf("11 - %d = %d",result,y);
		System.out.println();
		return y;
	}
	boolean Final(int x, String id)
	{
		if (x == -1) return false;
		String turnid = id.replaceAll("[-\\s+]","");
		String[] array = turnid.split("");
		int y[]=new int[array.length];
		int result[]=new int[array.length];
		for (int i=0;i<array.length;i++ )
		{
			y[i] = Integer.valueOf(array[i]);
		}
		System.out.print(id+" ");
		boolean p;
		if (x==y[array.length-1])
		{
			p=true;
		}
		else
		{
			p=false;
		}
		return p;
	}
	public static void main(String[] args) 
	{
		Week12_API2_68011212009 met=new Week12_API2_68011212009();
		String id;
		boolean x;
		int sum,y;
		id=met.read();
		sum=met.process(id);
		if (sum == -1) {
            System.out.printf("%s false\n",id);
        } else {
            y = met.next(sum);
            x = met.Final(y, id);
            System.out.println(x);
        }

	}
}
