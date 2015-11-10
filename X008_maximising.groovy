// X008 maximising

//Write a program that inputs an arbitrarily long sequence of positive numbers
// enter -1 to finish
// the program outputs the highest number

           					
boolean finished = false 					
boolean isFirst = true


println "Please enter the first number :"
String str = System.console().readLine()
num1 = Long.parseLong(str)

while (!finished) {
	println "Please enter another number, -1 to finish: "
	String str2 = System.console().readLine()
	num2 = Long.parseLong(str2)
	
	if (num2 != -1) {
		if (isFirst == true) {
			max = num1
			isFirst = false
		} 
		else if (num2 > max) {
			max = num2
		}
	} else {
	finished = true
		}
	}
println max


// I made this program work for big numbers: it seems an integer can only have 10 digits!


