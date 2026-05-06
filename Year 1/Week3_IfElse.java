import java.util.Scanner;
class Week3_IfElse
{
	public static void main(String[] args) 
	{
		double rice,requit,totalincome,income,kilo,value;
		Scanner scan=new Scanner(System.in);
		System.out.print("Input Maket Value :");
		value=scan.nextInt();
		System.out.print("Input Rice Total :");
		rice=scan.nextDouble();
		kilo=rice*1000;
		System.out.printf("====================================================\n");
		if(value>15)
		{
			requit=kilo*0.0073;
		}
		else
		{
			requit=kilo*3.25;
		}
		income = rice*1000*value;
		totalincome = income+requit;
		System.out.printf("%-15s  %30s\n","ITEM","BTH.");
		System.out.printf("%-15s  %29s\n","Insurance Price","15.000");
		System.out.printf("%-15s  %29.3f\n","Maket Value",value);
		System.out.printf("%-15s  %29.3f\n","Selling Rice",income);
		System.out.printf("%-15s  %29.3f\n","Requit",requit);
		System.out.printf("%-15s  %29.3f\n","Total Money",totalincome);


}
}
