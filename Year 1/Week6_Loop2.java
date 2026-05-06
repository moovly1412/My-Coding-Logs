import java.util.Scanner;
class Week6_Loop2 
{
	public static void main(String[] args) 
	{
		int ss=0,mm=0,hh=0,fin_ss,fin_mm,fin_hh;
		
		Scanner scan=new Scanner(System.in);
		System.out.printf("input h:");
		fin_hh=scan.nextInt();
		System.out.printf("input m:");
		fin_mm=scan.nextInt();
		System.out.printf("input s:");
		fin_ss=scan.nextInt();
		System.out.printf("%s %6s %8s","HH:","MM:","SS:\n");
		for (;;ss++)
		{
			try
			{
				Thread.sleep(1);
			}
			catch (InterruptedException ex)
			{
			}
			System.out.printf("\r%s %6s %8s",hh,mm,ss);
			if (ss==60)
			{
				ss=-1;
				mm++;
				continue;
			}
			else if (mm==60)
			{
				mm=0;
				hh++;
			}
			else if (ss==fin_ss && mm==fin_mm &&hh ==fin_hh)
			{
				break;
			}
			
		}
		System.out.printf("\nTIMEOUT!!\n");
}
}
