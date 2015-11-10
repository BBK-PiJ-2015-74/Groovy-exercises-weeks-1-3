// X009 Going Up!

// Read an arbitrarily long sequence of positive numbers from the user, until -1 is entered. 
//At that point, print ”Yes” if the numbers were consecutive and increasing and ”No” otherwise. 
//Sequences ”1,2,3,4,-1” and ”5,6,7,8,9,10,11,-1” should output ”Yes”, 
//but ”2,3,5,6,7,-1”, ”10,9,8,7,-1”, and ”1,1,2,3,4,5,-1” should output ”No”.

int num1 = 0       					
boolean finished = false 					
boolean isGoingUp = true
boolean Finalflag = true

println "This program will tell you if you are Going Up!"

println "Please enter the first number: "
String str1 = System.console().readLine()
num1 = Integer.parseInt(str1)
				
while (!finished) {
	
	println "Please enter another number, -1 to finish: "
	String str2 = System.console().readLine()
	num2 = Integer.parseInt(str2)
	
	if ((num1 != -1) && (num2 != -1)) {   
			
			if (num2 == (num1 + 1)) {   
				isGoingUp = true     
				num1 = num2
			}
			else {
			isGoingUp = false
			}
			if (isGoingUp == false) {
				Finalflag = false; 				
			} 
			
	} else {
		finished = true
		}
	}

	if (Finalflag == true) { 
	println "You are Going UP!"
	} else if (Finalflag == false) {
	println "No!!!!"
	}

