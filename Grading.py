# Grading system for Students. 
#
# This program takes an Input, number
# of students, and then grades the mark 
# using Loop and If statement.
#
# Olanipekun Akintola
#
# 21/11/2016
#
# Request User Input 

print()
print()
print()
print('\t*******************************************************')
print()
print('\t\t M A R K   G R A D I N G   S Y S T E M ')
print()
print('\t*******************************************************')
print()
print()
print()

print('\t=======================================================')
print()
print()

#
# Initialise the variables 

#pupils = 0
#mark = 0

pupils = int(input('\t Enter the number of pupils to be graded:  '))
print()

#
# Determines the number of times the process will repeat itself

while pupils > 0:
	print()
	mark = float(input('\t Please Enter mark: '))
	print()

#	
# Data verification

	while (( mark > 100) or ( mark < 0 )):
		mark = float(input('\t Invalid mark, try between 0 to 100: '))
		print()

#	
# Make a Decision as to the Grade to which the Mark belongs

	if(mark<50):
		grade = "Unsatisfactory"
		
	elif(mark<65):
		grade = "Pass"
		
	elif(mark<80):
		grade = "Merit"
		
	else:
		grade = "Distinction"

#		
# Outputs the Results to the screen
		
	print(" \t Grade is " + grade )
	print()
	print()
	print()

#
# Subtracts 1 from the value of pupils		

	pupils = pupils - 1

print('\t=======================================================')
print()
