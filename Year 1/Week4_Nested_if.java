import java.util.Scanner;
class Week4_Nested_if 
{
	public static void main(String[] args) 
	{
		int num,date,num2=0;
		String day="",mounth;
		Scanner scan=new Scanner(System.in);
		System.out.print("Input your num to check date :");
		num=scan.nextInt();
		date=num%7;
			if(date==0)
			{
				day="Mon";
			}
			else if(date==1)
			{
				day="TUE";
			}
			else if(date==2)
			{
				day="WED";
			}
			else if (date==3)
			{
				day="THR";
			}
			else if (date==4)
			{
				day="FRI";
			}
			else if (date==5)
			{
				day="SAT";
			}
			else if (date==6)
			{
				day="SUN";
			}


			if (num<=31)
			{
				mounth="JAN";
				num2=num;
			}
			else if (num<=59)
			{
				mounth="FEB";
				num2=num-31;
			}
			else
		    {
				mounth="MAR";
				num2=num-59;
		    }
			System.out.printf("Day : %s\n",day);
			System.out.printf("Mounth :%s\n",mounth);
			System.out.printf("Date : %d\n",num2);
	}
}
