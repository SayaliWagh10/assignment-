import java.io.InputStream;
import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args)
	{
		int rows;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The No Of Rows");
		rows=sc.nextInt();
		
         for (int i = 1; i <= rows; ++i) 
         {
       
        	for (int j = 1; j <= i; ++j) 
        	{

		      System.out.print(j + " ");

		    }

		       System.out.println();

		  }

		}
}

	