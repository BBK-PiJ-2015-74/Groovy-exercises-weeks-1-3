// X007 Naive sorting

println "Please enter the first number :"
String str1 = System.console().readLine()
a = Integer.parseInt(str1)

println "Please enter the second number :"
String str2 = System.console().readLine()
b = Integer.parseInt(str2)

println "Please enter the third number :"
String str3 = System.console().readLine()
c = Integer.parseInt(str3)

int max
int med
int min

	if ((a >= b) && (b >= c)) {				// combination 1
		max = a
		med = b
		min = c	
	}
	else if ((a >= c) && (c >= b)) {		// combination 2
		max = a
		med = c
		min = b
	}	
	else if ((b >= a) && (a >= c)) {		// combination 3
		max = b
		med = a
		min = c
	}
	else if ((b >= c) && (c >= a)) {		// combination 4
		max = b
		med = c
		min = a
	}
	else if ((c >= a) && (a >= b)) {		// combination 5
		max = c
		med = a
		min = b
	}
	else if ((c >= b) && (b >= a)) {		// combination 6
		max = c
		med = b
		min = a
	}
println "These are the numbers you entered in ascending order"
println min + "," + med + "," + max

// Combinations 

// 1. a > b > c
// 2. a > c > b

// 3. b > a > c
// 4. b > c > a

// 5. c > a > b
// 6. c > b > a