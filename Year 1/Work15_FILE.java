import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import java.util.NoSuchElementException;
class Work15_FILE
{
	void set(FileWriter out,SimpleDateFormat sm)
		{
	       try
	       {
			int i=1;
			out.write("NO.\tNAME\t\tCODE\t\tMIDTERM\tFINAL\tSCORE\tGRADE\tDATE\n");
			for (; ; )
			{
				String name = name();
                if (name.equals("stop")) break;
				out.write(String.valueOf(i)+"\t");
                out.write(name+"\t\t");
			    String code = code();
				if (code.equals("stop")) break;
				out.write(code+"\t");

			    int mid = mid();
                out.write(String.valueOf(mid)+"\t");

			    int fin = fin();
			    int score = score(mid,fin);
			    char grade = grade(score);
				
			    out.write(String.valueOf(fin)+"\t");
			    out.write(String.valueOf(score)+"\t");
			    out.write(String.valueOf(grade)+"\t");
				out.write(sm.format(new Date())+"\t\n");
				i=i+1;
			}
			out.close();
	       }
	       catch (IOException ex)
	       {
			   ex.getMessage();
	       }
		}
	String name()
	{
        for (;;)
        try {
            Scanner scan=new Scanner(System.in);
            System.out.print("Input Name (stop ------> exit) :");
		    String x=scan.nextLine();
		    return x;
        } catch (NoSuchElementException ex) {
            ex.getMessage();
        }
			
			
	}
	String code()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Input Code (stop ------> exit) :");
		String x=scan.nextLine();
		return x;
	}
	int mid()
	{
        for (;;)
        {
            try {
            Scanner scan=new Scanner(System.in);
		    System.out.print("Input Midterm :");
            int x;
            if (scan.hasNextInt())
            {
                x=scan.nextInt();
                return x;
            }
            else
            {
                System.out.println("Try again!!");
            }
            } catch (InputMismatchException ex) {
               ex.getMessage();
            }
        }
	}
	int fin()
	{
		
        for (;;)
        {
            try {
            Scanner scan=new Scanner(System.in);
            System.out.print("Input Final :");
            int x;
            if (scan.hasNextInt())
            {
                x=scan.nextInt();
                return x;
            }
            else
            {
                System.out.println("Try again!!");
            }
            } 
            catch (Exception ex) 
            {
              ex.getMessage();
            }
        }
		
	}
	int score(int mid,int fin)
	{
		int score =mid+fin;
		return score;
	}
	char grade(int score)
	{
		char grade;
		if (score >= 80) grade='A';
        else if (score >= 70) grade='B';
        else if (score >= 60) grade='C';
        else if (score >= 50) grade='D';
        else grade='F';
		return grade;
	}
	public static void main(String[] args) 
	{
		Work15_FILE_68011212009 met=new Work15_FILE_68011212009();
		 try
	       {
			String mt="d MMM yy-hh:mm";
			Locale thai = new Locale("th","TH");
			SimpleDateFormat sm =new SimpleDateFormat(mt,thai);
			FileWriter out=new FileWriter("out.txt");
		    met.set(out,sm);
	       }
	       catch (IOException ex)
	       {
			   ex.getMessage();
	       }
	}
}
