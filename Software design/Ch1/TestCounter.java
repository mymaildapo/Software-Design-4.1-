import java.util.Scanner;

//package ch1;



public class TestCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Counter c1 = new Counter();
		Counter c2 = new Counter(2);

		int choice = 1;
		while(choice!=4)
			{
			System.out.println();
			System.out.println("1.Increment");
			System.out.println("2.Decrement");
			System.out.println("3.Read Value");
			System.out.println("4.Exit");

			System.out.print("Please enter a value-->");
			choice =sc.nextInt();
		
			if(choice==1)
			{
				c2.increment();
			}
			else if(choice==2)
			{
				c2.decrement();

			}
			else if(choice==3)
			{
				int res=c2.read_value();
				System.out.println("Value = "+res);
			}

			}  // end while

	}

}
