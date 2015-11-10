// X005 Multiplication without using the * operator


println "Please enter a number to multiply: "
String str1 = System.console().readLine()
int i = Integer.parseInt(str1) 

println "Please enter a number to multiply it by: "
String str2 = System.console().readLine()
int j = Integer.parseInt(str2)

int p = 0
int n = 0

while (n < j)  {
	n = n + 1;				//n = 1 n = 2 n = 3
	p = i + p			//p = 10 p = 10+10 p = 10+10+10
	}

println "The product is " + p
	
	
	// say i = 10, j is 3, so you want to iterate (i + i ...) j times
	//why does this work for n < j but not n <= j??
	
	
		// a x b = (a + a + a ...)b
		
		// e.g. 4 x 2 = (4 + 4) 
		// 4 x 3 = (4 + 4 + 4)
		// i.e. add 4 to itself in a loop i times where i is the 2nd number
	