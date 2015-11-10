// X006 division

//Write a program that requests two numbers from the user and then outputs the Quotient and the Remainder
// For example, if the user enters 7 and 3, your program should output something like "7 divided by 3 is 2 remainder 1"


println "Please enter a number: "
String str1 = System.console().readLine()
A = Integer.parseInt(str1)

println "Please enter another number: "
String str2 = System.console().readLine()
B = Integer.parseInt(str2)

int Quotient
int Remainder

Boolean Rflag = true

	while (Rflag == true) {
		Quotient++;
		Remainder = A - (Quotient*B)
			if (Remainder < B) {
			Rflag = false
			}
		}
		
println "The Quotient is " + Quotient
println "The Remainder is " + Remainder
