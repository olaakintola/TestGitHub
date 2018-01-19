// A program to find the factorial of a number

# include<stdio.h>

int main(void)
{
	int count;
	int total = 1;
	int factorial;
	
	printf("Please enter the figure that you would like the factorial: ");
	scanf("%d",&factorial);
	
	count = 1;
	
	while (count <= factorial)
	{
		total *= count++;// count is updated here
		
//		count ++;
	}
	
	printf("The factorial of %d is %d\n",factorial, total);
	
	return 0;
}
