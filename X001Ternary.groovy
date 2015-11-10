// 1. Ternary operation

int currentYear = 2012 // initialises a variable currentYear as 2012
print "When were you born (year)?"
String str = System.console().readLine() // reads the year you were born into the memory
int birthyear = Integer.parseInt(str) // defines an integer birthyear as the string just entered
int ageApprox = currentYear - birthyear // calculates ageApprox as current year minus birth year
String result = (ageApprox > 17) ? "" : "not"  //is this a bit like an if statement? 
println "It seems you are " + result + "an adult. " // this program returns the string "It seems you are an adult" if you are over 17

// or it returns "It seems you are not an adult"




