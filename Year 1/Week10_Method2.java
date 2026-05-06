import java.util.Scanner;
class Week10_Method2
{
	Scanner scan=new Scanner(System.in);
	int readN()
	{
		int n;
		System.out.print("Input Arrys :");
		n=scan.nextInt();
		return n;
	}
	char readValue()
	{
		char value;
		System.out.print("Input O/X/E: ");
		value=scan.next().charAt(0);
		if(value =='o')
		{
			value ='O';
		}
		if(value =='x')
		{
			value ='X';
		}
		return value;
	}
	int inputI()
	{
		int i;
		System.out.print("Input i: ");
		i=scan.nextInt();
		return i;
	}
	int inputJ()
	{
		int j;
		System.out.print("Input j: ");
		j=scan.nextInt();
		return j;
	}
	void print(char array[][])
	{
		for (int i=0;i<array.length;i++ )
		{
			for (int j=0;j<array[0].length ;j++ )
			{
				System.out.printf("%c\t",array[i][j]);
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------");
	}
	void under(char array[][])
	{
		for (int i=0;i<array.length;i++ )
		{
			for (int j=0;j<array[0].length ;j++ )
			{
				array[i][j]='-';
			}
		}
	}
	void change(char array[][],int i,int j,char value)
	{
		
		array[i][j]=value;
	}
	public static void main(String[] args) 
	{
		Week10_Method2_68011212009 met=new Week10_Method2_68011212009();
		int n,i,j;
		char value;
		n=met.readN();
		char array[][]=new char[n][n];
		met.under(array);
		met.print(array);
		for (int p=0; ;p++)
		{
		value=met.readValue();
		if(value == 'E' || value== 'e')
		{
			break;
		}
		j=met.inputJ();
		i=met.inputI();
		if(i>=n||i<0||j>=n||j<0)
			{
			System.out.println("--------------------------------------------");
				System.out.println("out of length try again");
				System.out.println("--------------------------------------------");
				continue;
			}
			if (array[i][j]!='-')
		{
				System.out.println("--------------------------------------------");
			System.out.println("Do not enter the same position try again");
			System.out.println("--------------------------------------------");
			continue;
		}
		
		met.change(array,i,j,value);
		met.print(array);
		}
		
		
	}
}
