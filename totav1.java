// This program allows the user to enter the first name and family name. It also
// accepts three numbers from the keyboard and calculates the total and average.

// Olanipekun Akintola

import java.util.Scanner;

class totav1
{
	public static void main(String [] args)
	{

		//set up scanner to allow input from the keyboard
		Scanner myInput = new Scanner(System.in);

		//Declaration of variables
		int number1, number2, number3;				// variables to store the numbers
		int total = 0;								// initialising total to zero
		String firstName , familyName ;
		double average;								// store results
		char firstNameInitial, familyNameInitial;

		System.out.println("");
		System.out.println("");// Outputs The Name and Purpose of the Program to the Screen
		System.out.println("\t********************************************************************");
		System.out.println("");
		System.out.println("\t Program to Display the Names, Initials of the Names Entered ");
		System.out.println("\t\t and the Total and Average of 3 Numbers Input ");
		System.out.println("");
		System.out.println("\t********************************************************************");
		System.out.println("");
		System.out.println("");


		System.out.println("");
		System.out.println("");
		System.out.println("\t====================================================================");
		System.out.println("");

		//Asking Questions
		System.out.print("\t Please enter your First Name: ");
		firstName = myInput.next();							// takes first name in from the keyboard and stores as string
		firstNameInitial = firstName.charAt(0);				// storing the firstname initial in character variable

		System.out.print("\t Please enter your Family Name: ");
		familyName = myInput.next();						// takes family name in from the keyboard and stores as string
		familyNameInitial = familyName.charAt(0); 			// storing the familyname initial in character variable
		System.out.println("");// print blank line
		System.out.println("");
		System.out.println("");

		// reads in 3 integers
		System.out.print("\t Please enter the first of the 3 numbers: ");
		number1 = myInput.nextInt();

		System.out.print("\t Please enter the second of the 3 numbers: ");
		number2 = myInput.nextInt();

		System.out.print("\t Please enter the third of the 3 numbers: ");
		number3 = myInput.nextInt();

		// adds up all the numbers and stores it in total variable
		total = number1 + number2 + number3;

		// finds the mean and stores it in average variable
		average =(double)total/3;
		// Casting has allowed total variable that was initially declared as an integer to be turned into a double, which allows it to produce result in decimal

		System.out.println(""); 									//print blank line
		System.out.println("");
		System.out.println("");

		// Output the first name, family name, first name initial, family name initial and the numbers entered to the screen
		System.out.println("\t Hello "+ firstName+ " " +familyName+", your initials are "+ firstNameInitial+ "."+ familyNameInitial +".\n\t You entered mumbers: ");
		System.out.print("\t " + number1 +","+number2+"," + number3);

		// Output the total of the numbers entered to the screen
		System.out.printf(" - the total is %d", total);
		// the %d symbol indicates a decimal integer will be inserted

		// Output the average to the screen
		System.out.printf(" and the average of these 3 numbers is %.1f %n", average);
		// the %.1f symbol indicates a float (decimal number) will be inserted and formatted to 1 decimal place
		//the %n symbol inside makes printf work like println - ie it will bring the cursor onto the next line

		System.out.println("");
		System.out.println("\t ==================================================================");
		System.out.println("");
		System.out.println("");


	}//end main
}//end class
