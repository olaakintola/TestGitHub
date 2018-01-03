// Application using method, slope,length and midpoint ; to calculate and return the slope,
// length and midpoints two points on a line segment.The program prompts the user to enter
// the coordinates of two points on a line segment.
//
// Olanipekun Akintola
//

import java.util.Scanner;

class geometry
{
	public static void main(String []args)
	{
		//set up scanner to allow input from the keyboard
		Scanner myInput = new Scanner(System.in);

		//Declaration of variables
		double x1, x2, y1, y2, x, y;	// variables to store the x and y coordinates of two points on a line segment
		char option =' ';				// initialising option
		double midpointx , midpointy;	// temporarily stores result for x and y coordinate for midpoint
		double mid, mid2;				// stores result for x and y coordinate for midpoint

		System.out.println("");	// print blank line
		System.out.println("");
		System.out.println("");// Outputs The Name and Purpose of the Program to the Screen
		System.out.println("******************************************************************************");
		System.out.println("");
		System.out.println("");

		System.out.println("\t C O O R D I N A T E   G E O M E T R Y   A P P L I C A T I O N ");

		System.out.println("");
		System.out.println("");
		System.out.println("******************************************************************************");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");

		System.out.println("==============================================================================");
		System.out.println("");
		System.out.println("");
		System.out.println("");

		// reads in first point x coordinate
		System.out.println("Please enter the value for the first x coordiante: ");
		x1 = myInput.nextDouble();
		// data validation
		while ( x1 > 10 || x1 < -10)
		{
			System.out.println("Enter values between -10 & 10 inclusive: ");
			x1 = myInput.nextDouble();
		}
		System.out.println("");

		// reads in first point y coordinate
		System.out.println("Please enter the value for the first y coordiante: ");
		y1 = myInput.nextDouble();
		// data validation
		while ( y1 > 10 || y1 < -10)
		{
			System.out.println("Enter values between -10 & 10 inclusive: ");
			y1 = myInput.nextDouble();
		}
		System.out.println("");

		// reads in second point x coordinate
		System.out.println("Please enter the value for the second x coordiante: ");
		x2 = myInput.nextDouble();
		// data validation
		while ( x2 > 10 || x2 < -10)
		{
			System.out.println("Enter values between -10 & 10 inclusive: ");
			x2 = myInput.nextDouble();
		}
		System.out.println("");

		// reads in second point y coordinate
		System.out.println("Please enter the value for the second y coordiante: ");
		y2 = myInput.nextDouble();
		// data validation
		while ( y2 > 10 || y2 < -10)
		{
			System.out.println("Enter values between -10 & 10 inclusive: ");
			y2 = myInput.nextDouble();
		}

		System.out.println("");
		while (option != 'd') // 'd' is entered when user wants to quit the program
		{

		System.out.println("");
		System.out.println("");
		System.out.println("");	// Output the following options to the screen for user to determine what happens with inputted data
		System.out.println("Please select [a] to find the slope of the line segment: ");
		System.out.println("Please select [b] to find the length of the line segment: ");
		System.out.println("Please select [c] to find the midpoint coordinates of the line segment: ");
		System.out.println("Please select [d] to quit the program: ");	// 'd' is the option that is the rogue value
		option = myInput.next().charAt(0);
		System.out.println("");

		// switch statement to allow for whatever options chosen
		switch(option)
		{
			case 'a':
			// Output the slope of the line segment to the screen
			//the %.1f symbol indicates a float (decimal number) will be inserted and formatted to 1 decimal place
			//the %n symbol inside makes printf work like println - ie it will bring the cursor onto the next line
			System.out.printf("The slope of the line is %.1f %n ", slope(x1 ,x2 ,y1 , y2));
			break;
			case 'b':
			// Output the length of the line segment to the screen
			//the %.1f symbol indicates a float (decimal number) will be inserted and formatted to 1 decimal place
			//the %n symbol inside makes printf work like println - ie it will bring the cursor onto the next line
			System.out.printf("The length of the line segment is %.1f %n ", length(x1, x2, y1, y2));
			break;
			case 'c':
			mid = midpointx(x1,x2);
			mid2 = midpointy(y1,y2);
			// Output the x and y coordinates of the midpoint the screen
			//the %.1f symbol indicates a float (decimal number) will be inserted and formatted to 1 decimal place
			//the %n symbol inside makes printf work like println - ie it will bring the cursor onto the next line
			System.out.printf("The midpoint of the line segment has x-coordinate %.1f ", mid);
			System.out.printf(" and y-cordinate %.1f %n ", mid2);
			break;
			case 'd':
			// Output termination of program message when '[d]', the rogue value is entered
			System.out.println("You have DECIDED to quit the program.");
			break;
			default:
			// Output message to the screen when the allowed option has not been selected
			System.out.println("Error: Please Enter Options [a]-[d] only!");
		} // end switch
	}

		System.out.println("");
		// Displayed outside of switch statement
		System.out.println("Thank you for using the Coordinate Geometry Application, Goodbye!");

		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("============================================================================");
		System.out.println("");
		System.out.println("");
	}// end main

	// method to calculate and output the slope of the line segment
	public static double slope(double x1, double x2,double y1, double y2)
	{
		return (y2-y1)/(x2-x1);
	}// end method to calulate and output slope

	// method to calculate and output the length of the line segment
	public static double length( double x1,double x2,double y1,double y2)
	{
		return Math.sqrt(((y2-y1)*(y2-y1))+((x2-x1)*(x2-x1)));
	}// end method to calulate and output length

	// method to calculate and output the x-coordinate of the midpoint
	public static double midpointx( double x1, double x2)
	{
		return (x2+x1)/2;
	}// end method to calulate and output x-coordinate of midpoint

	// method to calculate and output the y-coordinate of the midpoint
	public static double midpointy( double y1,double y2)
	{
		return (y2+y1)/2;
	}// end method to calulate and output y-coordinate of midpoint

}// end class

