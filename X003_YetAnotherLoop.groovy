// X003 Yet another loop

String str = System.console().readLine() // reads a number i into the memory
int i = Integer.parseInt(str)
while (i < 10) {			// for i < 10
	i++;				//add 1 to i each time round the loop i++ = i +1
	str = System.console().readLine() // can't declare the variable twice in the same scope, so you don't need String str
	int j = Integer.parseInt(str)
	if (j == 0) {
	break; 
	} else if (j != 1) {
		println "." + j
	}
}
System.out.println("finished")
	
	