import java.util.Scanner;
class Week9_Method1
{
    int getx()
	{
		int x;
		Scanner scan=new Scanner(System.in);
		x=scan.nextInt();
		return x;
	}
	double setSide(int x1,int x2,int y1,int y2)
	{
		double side;
		side=Math.sqrt((Math.pow(x1-x2,2))+(Math.pow(y1-y2,2)));
		return side;
	}
	double s(double sideA,double sideB,double sideC)
	{
		double s;
		s=(sideA+sideB+sideC)/(float)2;
		return s;
	}
	double area(double s,double a,double b,double c)
	{
		double area;
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}
	void print(double sideA,double sideB,double sideC,double s,double area)
	{
		System.out.println("===============================================");
		System.out.printf("sideA :%.3f\n",sideA);
		System.out.printf("sideB :%.3f\n",sideB);
		System.out.printf("sideC :%.3f\n",sideC);
		System.out.printf("S :%.3f\n",s);
		System.out.printf("Area :%.3f\n",area);
	}

	public static void main(String[] args) 
	{
		Week9_Method1_68011212009 met =new Week9_Method1_68011212009();
		int x[] = new int[3];
		int y[] = new int[3];
		double sideA,sideB,sideC,s,area;
		for (int i=0;i<x.length ;i++ )
		{
			System.out.printf("Input x[%d] :",i+1);
			x[i]=met.getx();
			System.out.printf("Input y[%d] :",i+1);
			y[i]=met.getx();
		}
		sideA=met.setSide(x[0],x[1],y[0],y[1]);
		sideB=met.setSide(x[1],x[2],y[1],y[2]);
		sideC=met.setSide(x[0],x[2],y[0],y[2]);
		s=met.s(sideA,sideB,sideC);
		area=met.area(s,sideA,sideB,sideC);
		met.print(sideA,sideB,sideC,s,area);

	}
}
