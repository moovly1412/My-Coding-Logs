import java.util.*;
class Week8_Array2D
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int m,k;
		System.out.print("Input M:");
		m=scan.nextInt();
		System.out.print("Input K:");
		k=scan.nextInt();
		int x[][]=new int[m][k];
		int y[][]=new int[k][m];
		int sum1[]=new int[m+k];
		int sum2[]=new int[m+k];
		for (int i=0;i<m ;i++ )
		{
			for (int j=0;j<k ;j++ )
			{
				x[i][j]=(int)(Math.random()*10+1);
				y[j][i]=x[i][j];
				sum1[i]=sum1[i]+x[i][j];
			}
		}
		for (int i=0;i<m ;i++ )
		{
			for (int j=0;j<k ;j++ )
			{
				System.out.printf("%d\t",x[i][j]);
			}
			System.out.printf(">  %d",sum1[i]);
			System.out.println();
		}
	
		for (int i=0;i<k ;i++ )
		{
			for (int j=0;j<m ;j++ )
			{
				sum2[i]=sum2[i]+y[i][j];
			}
			System.out.printf("v\t");
		}
		System.out.printf("\n");
		for (int i=0;i<k ;i++ )
		{
			System.out.printf("%d\t",sum2[i]);
		}
	}
}
