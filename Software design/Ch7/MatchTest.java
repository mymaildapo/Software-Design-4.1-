//package Ex17;

import java.util.Scanner;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MatchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		Match m=new Match("ManU", "Chelsea");


		try{
			ObjectInputStream in=new ObjectInputStream(
			new FileInputStream("test.dat"));
			m=(Match)in.readObject();
			in.close();}
		catch(Exception e){}


		int choice = 1;

		while(choice!=5)
		{
         System.out.println();
		 System.out.println("1.Team 1 Score");
		 System.out.println("2.Team 2 Score");
		 System.out.println("3.Print Details");
		 System.out.println("4.Exit");



		 			System.out.print("Please enter a value-->");
			choice =sc.nextInt();
			if(choice==1)
			{
				m.team1_score();

			}

			else if(choice==2)
			{
				m.team2_score();

			}

			else if(choice==3)
			{
				m.print_score();
			}



		}  // end while


			try{
				ObjectOutputStream out=new ObjectOutputStream(
					  new FileOutputStream("test.dat"));
				out.writeObject(m);
			    out.close();}
			catch(Exception e){}

	}

}
