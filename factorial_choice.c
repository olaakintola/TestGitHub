/*Written by Olanipekun Akintola
  Program that reads in a number and computes the factorial using while loop and for loop and if statement to make a choice.
  
  Input: number - number of sequence required for Factorial
  Output: output_n - outputs the required numbers in Factorial
*/

# include <stdio.h>

int main(void)

{

	int choice;
	int factorial;
	int multiplication = 1;

	/*using if statement here so that the user can determine if to factorial using while loop or for loop*/
	printf("Enter '1' to perform from Factorial in for loop OR \n '2' to perform Factorial in while loop: ");
	scanf("%ld", &choice);
	
	if (choice == 1)
	{
		printf("Please enter the value that you are looking for the factorial: ");
		scanf("%ld", &factorial);
	
		for(int i = 1; i <= factorial; i++)
		{
			multiplication = multiplication * i;
		}
	
		printf("The factorial for the number entered is %d\n", multiplication);

		
	}
	
	
	else if (choice == 2)
	{
	
		printf("Please enter the value that you are looking for the factorial: ");
		scanf("%ld", &factorial);
	
	
		while (factorial > 0)
		{
			multiplication = multiplication * factorial;
			factorial = factorial - 1;
		}
	
		printf("The factorial for the number entered is %d\n", multiplication);
	
	}
	
	else
	{
		printf("This program does not recognise %d as a viable choice.\n", choice);
		printf("Good-Bye!!\n");
	}
		
	

}
