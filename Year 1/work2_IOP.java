import java.util.Scanner;
class work2_IOP
{
	public static void main(String[] args) 
	{
		double pi=3.14159265358979,circle,rectangle,area,pay,lenght,weight,fence;
		Scanner ar=new Scanner(System.in);
		System.out.print("Input Lenght :");
		lenght=ar.nextDouble();
		System.out.print("Input Weight :");
		weight=ar.nextDouble();

		circle = pi*((weight/2)*(weight/2));
		rectangle = lenght*weight;
		area=rectangle+circle;
		pay=area*25.25;
		fence=(2*(pi*((weight/2)))+(lenght*2));
		System.out.println("Area = "+area);
		System.out.println("Pay = "+pay);
		System.out.println("Fence = "+fence);

	}
}
