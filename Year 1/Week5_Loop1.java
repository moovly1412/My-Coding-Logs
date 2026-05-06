import java.util.Scanner;
class Week5_Loop1 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n,unit=0,ig=0,sum=0,allsum=0,sum_unit=0;
		String grade;
		double gpax;

		System.out.print("Input n :");
		n=scan.nextInt();
		
        for (int i=0;i<n;i=i+1)
        {
		System.out.print("Input Grade :");
		grade=scan.next();
		System.out.print("Input Unit :");
		unit=scan.nextInt();
		switch (grade)
		{
		case "A":
			ig=4;
		    sum = ig*unit;
		    allsum =allsum+sum;
			sum_unit = sum_unit+unit;
		    break;
		case "B":
			ig=3;
		    sum = ig*unit;
		    allsum =allsum+sum;
			sum_unit = sum_unit+unit;
		    break;
		case "C":
			ig=2;
		    sum = ig*unit;
		    allsum =allsum+sum;
			sum_unit = sum_unit+unit;
		    break;
		case "D":
			ig=1;
		    sum = ig*unit;
		    allsum =allsum+sum;
			sum_unit = sum_unit+unit;
		    break;
		case "F":
			ig=0;
		    sum = ig*unit;
		    allsum =allsum+sum;
			sum_unit = sum_unit+unit;
		    break;
		default:

		}
		}
		gpax = (float)allsum/(float)sum_unit;
		System.out.printf("Sum Unit = %d\n",sum_unit);
		System.out.printf("Sum IG*UNIT = %d\n",allsum);
		System.out.printf("GPAX = %.3f\n",gpax);
	}
}
