import java.util.*;
class Week7_Array1
{
	public static void main(String[] args) 
	{
		int unit,max,min,sum=0,summid=0,sumfin=0;
		String names;
		double avgm=0,avgf=0,avg=0;
		Scanner scan=new Scanner(System.in);
		System.out.printf("Input N :");
        unit=scan.nextInt();
		System.out.printf("==========================================================\n");
		String name[] = new String[unit];
		int mid[] = new int[unit];
		int fin[] = new int[unit];
		char grade[] = new char[unit];
		int num[] = new int[unit];
		int score[] = new int[unit];
		int count;
		for (int i =0;i<unit ;i++ )
		{
			System.out.print("Input Name :");
			name[i]=scan.next();
			System.out.print("Input Midterm:");
			mid[i]=scan.nextInt();
			System.out.print("Input Final:");
			fin[i]=scan.nextInt();
			score[i]=fin[i]+mid[i];
			summid=summid+mid[i];
			sumfin=sumfin+fin[i];
			sum=sum+score[i];
			if (score[i]>=80)
			{
				
				grade[i]='A';
				num[0]=num[0]+1;

			}
			else if (score[i]>=70)
			{
				grade[i]='B';
				num[1]=num[1]+1;
			}
			else if (score[i]>=60)
			{
				grade[i]='C';
				num[2]=num[2]+1;
			}
			else if (score[i]>=50)
			{
				grade[i]='D';
				num[3]=num[3]+1;
			}
			else
			{
				grade[i]='F';
				num[4]=num[4]+1;
			}
		}
		System.out.printf("==========================================================\n");
		for (int i =0;i<unit ;i++ )
		{
			System.out.printf("\t%s\t",name[i]);
		}
		System.out.printf("\n");
		for (int i =0;i<unit ;i++ )
		{
			System.out.printf("\t%d\t",score[i]);
		}
		System.out.printf("\n");
		for (int i =0;i<unit ;i++ )
		{
			System.out.printf("\t%c\t",grade[i]);
		}
		System.out.printf("\n==========================================================\n");
		Arrays.sort(score);
		Arrays.sort(mid);
		Arrays.sort(fin);
		System.out.printf("Max  = \t        %d\t%d\t%d\n",mid[unit-1],fin[unit-1],score[unit-1]);
		System.out.printf("Min  = \t        %d\t%d\t%d\n",mid[0],fin[0],score[0]);

		avgm = (float)summid/unit;
		avgf = (float)sumfin/unit;
		avg = (float)sum/unit;

		System.out.printf("Average = \t%.2f\t%.2f\t%.2f\n",avgm,avgf,avg);
		System.out.printf("==========================================================\n");
		System.out.printf("A:\t%d\t",num[0]);

		System.out.printf("\"");
		for (int i=0;i<unit ;i++ )
		{
			if (grade[i]=='A')
			{
				System.out.printf("%s,",name[i]);	
			}
		}
		if (num[0]>0)
			{
				System.out.printf("\b");
			}
		System.out.printf("\"");
		System.out.printf("\n");
		System.out.printf("B:\t%d\t",num[1]);
		System.out.printf("\"");
		for (int i=0;i<unit ;i++ )
		{
			if (grade[i]=='B')
			{
				System.out.printf("%s,",name[i]);
			}
		}
		if (num[1]>0)
			{
				System.out.printf("\b");
			}
		System.out.printf("\"");
		System.out.printf("\n");
		System.out.printf("C:\t%d\t",num[2]);
		System.out.printf("\"");
		for (int i=0;i<unit ;i++ )
		{
			if (grade[i]=='C')
			{
				System.out.printf("%s,",name[i]);
			}
		}
		if (num[2]>0)
			{
				System.out.printf("\b");
			}
		System.out.printf("\"");
		System.out.printf("\n");
		System.out.printf("D:\t%d\t",num[3]);
		System.out.printf("\"");
		for (int i=0;i<unit ;i++ )
		{
			if (grade[i]=='D')
			{
				System.out.printf("%s,",name[i]);
			}
		}
		if (num[3]>0)
			{
				System.out.printf("\b");
			}
		System.out.printf("\"");
		System.out.printf("\n");
		System.out.printf("F:\t%d\t",num[4]);
		System.out.printf("\"");
		for (int i=0;i<unit ;i++ )
		{
			if (grade[i]=='F')
			{
				System.out.printf("%s,",name[i]);
			}
		}
		if (num[4]>0)
			{
				System.out.printf("\b");
			}
		System.out.printf("\"");
		System.out.printf("\n");

	}
}
