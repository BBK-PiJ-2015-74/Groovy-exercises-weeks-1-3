// X010 You said High, I said Low!

// Read an arbitrarily long sequence of positive numbers from the user, until -1 is entered. 
//At that point, print ”Going Up” if the numbers were consecutive and increasing, print 
// "Going Down" if the numbers were consecutive and decreasing and ”Not consecutive” otherwise. 


int num1 = 0       					
boolean finished = false 					
boolean isGoingUp = false			
boolean isGoingDown = false

println "This program will tell you if you are Going Up, Going Down or Not Consecutive!"

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
			else if (num2 == (num1 - 1)){
				isGoingDown = true
				num1 = num2
				}
			else {
			num 1 = num 2
			}			
	} else {
		finished = true
		}
	}

	if (isGoingUp == true) { 
	println "You are Going UP!"
	} else if (isGoingDown == true) {
	println "You are Going Down!"
	} else {
	println "These numbers are not consecutive" 
	}

