// X004 Prime Numbers

int i = 1
println "Please enter a number and this program will tell you whether it is prime: "
String str = System.console().readLine()
int num = Integer.parseInt(str)
boolean Primeflag = true

if (Primeflag == true) {
	while (i < (num-1)) {													// try num = 6
		i++;											// first time round loop i = 2		
 			if ((num % i) == 0) { 											// 6 modulo 2 = 0 (6/2 is 3) if modulo is zero, num is not prime
 			Primeflag = false											// sets Primeflag to FALSE if the modulo = 0
 			}
 		println i
 		println Primeflag
 		}
 	}
 if (Primeflag == false) {
 	println "The number " + num + " you entered is NOT prime"
 	} else {
 	println "The number " + num + " you entered is prime"
 }


	// a number is prime if it can only be divided by 1 and itself
	// a number is not prime if can be divided by 2, 3, 4, 5 or any other number
	
	// Calculate num / 2, 3, 4, 5 all the way up to num
	// if modulo (num/ i) == 0, then the number is NOT prime
	
	
	