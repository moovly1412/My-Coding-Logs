import java.util.*;
class Work13_Exception
{
	String read()
	{
		for (; ; )
		{
			try
		{
			Scanner scan=new Scanner(System.in);
		    System.out.print("Input : ");
		    String data=scan.nextLine();
		    return data;
		}
		catch (NoSuchElementException ex)
		{
			System.out.println(ex.getMessage());
		}

		}
		
	}
	String delete(String x)
	{
		String data=x.replaceAll("[^0-9 ]","");
		return data;
	}
	String process(String x)
	{
		try
		{
			String data[]=x.split("");
		    int sum=0;
		    for (int i=0;i<data.length ;i++ )
		     {
			sum+=Integer.valueOf(data[i]);
		     }
		     String o=Integer.toString(sum);
		     return o;
		}
		catch (NumberFormatException ex)
		{
			return "0";
		}
	}
	public static void main(String[] args) 
	{
		Work13_Exception_68011212009 met=new Work13_Exception_68011212009();
		String data=met.read();
		String num=met.delete(data);
		String sum=met.process(num);
		System.out.printf("%-5s\t%s\n","SUM","AVG");
		double avg;
		System.out.print(sum);
		int num1=Integer.valueOf(sum);
		avg = (float)num1/(float)num.length();
	    System.out.printf("\t%.1f\n",avg);
		for (;;)
		{
			 if (sum.length()>1)
			{
				 sum=met.process(sum);
				 System.out.print(sum);
				 num1=Integer.valueOf(sum);
				 avg = (float)num1/(float)2;
				 System.out.printf("\t%.1f\n",avg);
				 
			 }
			 else
			{
				break;
			}
		}
	}
}
