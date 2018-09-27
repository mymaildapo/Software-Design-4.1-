//package Ex14;

import java.util.Scanner;


public class TestTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		Time t = new Time(2,5,6);
        int choice=1;
		while(choice!=4)
		{
			System.out.println();
			System.out.println("1.Increment second");
			System.out.println("2.Read total in sec");
			System.out.println("3.Print");
			System.out.println("4.Exit");
            		System.out.print("Please enter a value-->");
			choice =sc.nextInt();

			if(choice==1)
			{
				t.incr_sec();
			}

			else if(choice==2)
			{

				int total = t.total_in_sec();
				System.out.println("Total in seconds is:" + total);

			}

			else if(choice==3)
			{
				t.print();
			}


		}  // end while

	}

}
