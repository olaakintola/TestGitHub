// Program allows the user to determine the end of entering
// in values by entering a salient value, for example, - 1

# include <stdio.h>

int main(void)
{
	int sum = 0;
	int count = 0;
	int next_number;
	
	do
	{
		printf("Please Enter the next number :");
		scanf("%d", &next_number);
		//next_number is only added to sum when it is not -1
		if (next_number != -1)
		{
			sum = sum + next_number;
		}
	// when the -1 is entered, the loop is exited	
	} while(next_number != -1);
		
	printf("The total sum of the numbers entered is %d\n", sum);
	
	return 0;
}
