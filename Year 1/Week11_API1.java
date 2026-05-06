import java.util.Scanner;
class Week11_API1
{
	Scanner scan=new Scanner(System.in);
	String scan()
	{
		String input;
		input=scan.nextLine();
		return input;
	}
	String process()
	{
		String word = scan();
		char str[] =word.toCharArray();
		for (int i=0;i<str.length ;i++ )
		{
			boolean x=Character.isUpperCase(str[i]);
			if(x==true)
			{
				 str[i]=Character.toLowerCase(str[i]);
			}
			else
			{
				str[i]=Character.toUpperCase(str[i]);
			}
		}
		return  String.valueOf(str);

	}
	public static void main(String[] args) 
	{
		Week11_API1_68011212009 met=new Week11_API1_68011212009();
		String result=met.process();
		System.out.print(result);
		
	}
}
