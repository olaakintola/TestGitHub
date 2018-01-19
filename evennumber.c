// Write out all the even numbers even_number, 
// such that 0 <= even_number < 200

# include <stdio.h>

int main(void)
{
	int even_number;
	
	even_number = 0;
	
	while(even_number < 200)
	{
		printf("%d\n", even_number);
		
		even_number += 2;
	}
	
	return 0;
}
