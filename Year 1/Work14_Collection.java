import java.util.*;
class Work14_Collection
{
	void read(ArrayList<String>name,ArrayList<Integer>midterm,ArrayList<Integer>finals)
	{
		for (; ; )
		{
			Scanner scan=new Scanner(System.in);
		    System.out.print("Input name :");
		    String x = scan.nextLine();
		    name.add(x);
			if (name.lastIndexOf("Stop") != -1)
			{
				name.remove(name.lastIndexOf("Stop"));
				break;
			}
			System.out.print("Input Midterm :");
		    int mid = scan.nextInt();
			midterm.add(mid);
			System.out.print("Input Final :");
		    int fin = scan.nextInt();
			finals.add(fin);
			System.out.println("====================================================");
		}
	}
	void process(ArrayList<Integer>midterm,ArrayList<Integer>finals,ArrayList<Integer>score,ArrayList<Character>grade)
	{
		for (int i=0;i<midterm.size();i++)
		{
			score.add(midterm.get(i)+finals.get(i));
			if (score.get(i) >= 80) grade.add('A');
            else if (score.get(i) >= 70) grade.add('B');
            else if (score.get(i) >= 60) grade.add('C');
            else if (score.get(i) >= 50) grade.add('D');
            else grade.add('F');
		}
	}
	void print(ArrayList<String>name,ArrayList<Integer>midterm,ArrayList<Integer>finals,ArrayList<Integer>score,ArrayList<Character>grade)
	{
		System.out.print("NAME\tMidterm\tFinal\tScore\tGrade\n");
		for (int i=0;i<finals.size();i++)
		{
			System.out.println(name.get(i)+"\t"+midterm.get(i)+"\t"+finals.get(i)+"\t"+score.get(i)+"\t"+grade.get(i));
		}
	}
	public static void main(String[] args) 
	{
		Work14_Collection_68011212009 met=new Work14_Collection_68011212009();
		ArrayList<String>name=new ArrayList<String>();
		ArrayList<Integer>midterm=new ArrayList<Integer>();
		ArrayList<Integer>finals=new ArrayList<Integer>();
		ArrayList<Integer>score=new ArrayList<Integer>();
		ArrayList<Character>grade=new ArrayList<Character>();
		met.read(name,midterm,finals);
		met.process(midterm,finals,score,grade);
		met.print(name,midterm,finals,score,grade);
	}
}
