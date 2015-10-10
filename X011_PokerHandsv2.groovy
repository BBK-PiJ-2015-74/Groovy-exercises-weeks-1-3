// X011 Poker Hands

//Once the program has the five cards, it should tell the user what is the best hand she has got, as per the following list (from best to worst):
//Straight flush: all cards are of the same suit and their ranks are consecutive. Note that they are probably not ordered as they were entered.
//Poker: four of the five cards have the same rank.
//Full House: three of a kind plus two of a kind.
//Flush: all cards share the same suit, but are not consecutive. Straight: all cards are consecutive, but not of the same suit. Three of a kind: three of the five cards have the same rank. Two pairs: two pairs (see below).
//Pair: two of the five cards have the same rank.
//Nothing: any other situation.


println "Welcome to Poker Hands!"
println "First, pick the suit of your card: it can be clubs, spades, hearts or diamonds"
println "Enter C for clubs, S for spades, H for hearts, D for diamonds"
println "Then, pick the number of your card: it can be 1,2,3,4,5,6,7,8,9,10,J,Q,K"
println "For example, enter C01 which is the ace of clubs, or DK which is the King of diamonds"

String card1, card2, card3, card4, card5

int i = 0
int min = 0 
int minmed = 0
int middle = 0
int maxmed = 0 
int max = 0 
int numrank, numrank1, numrank2, numrank3, numrank4, numrank5
String rank1, suit1, rank2, suit2, rank3, suit3, rank4, suit4, rank5, suit5
 
while (i < 5) {
i++;

println "Please enter a card"

String card = System.console().readLine()

String suit = card.substring(0,1)
String rank = card.substring(1)

	if (((rank =="1") || (rank =="2") || (rank =="3") || (rank =="4") || (rank =="5") || (rank =="6") || (rank =="7") || (rank =="8") || (rank =="9") || (rank =="10") || (rank =="J") || (rank=="Q") || (rank =="K")) && ((suit == "C") || (suit == "S") || (suit == "H") || (suit == "D"))){
	println "Card valid"
	} else {
	println "Error, please try to enter the card again"
	}

println suit + " " + rank
	if ((rank =="1") || (rank =="2") || (rank =="3") || (rank =="4") || (rank =="5") || (rank =="6") || (rank =="7") || (rank =="8") || (rank =="9") || (rank =="10")) {
		numrank = Integer.parseInt(rank)      //convert string rank to integer for rank = 1 to 10
		} else if (rank == "J") {
			numrank = 11
		} else if (rank == "Q") {
			numrank = 12
		} else if (rank == "K") {
			numrank = 13
		}
		
		
	if (i == 1) {							//for i = 1, assign values to numrank, rank and suit from 1st card
		numrank = numrank1
		rank = rank1
		suit = suit1
	}
	println "Rank value is" + " " + numrank1
	println "The card you entered was " + suit1 + rank1
									
		
	if (i == 2) {
		numrank = numrank2
		rank = rank2
		suit = suit2
	}
	println "Rank value is" + " " + numrank2
	println "The card you entered was " + suit2 + rank2
		
	if (numrank2 > numrank1) {
		numrank2 = max
		numrank1 = min 
	} else { 
		numrank2 = min
		numrank1 = max 
	}

	println "Cards sorted by rank are " + min + " " + max
	
	if (i == 3) {
			numrank = numrank3
			rank = rank3
			suit = suit3
	}
	println "Rank value is" + " " + numrank3
	println "The card you entered was " + suit3 + rank3
	
	
	if (numrank3 >= max) {
		numrank3 = max
	} else if ((numrank3 <= max) && (numrank3 >= min)) {
		numrank3 = middle
	} else if (numrank3 <= min) {
		numrank3 = min  
	}
	
	println "Cards sorted by rank are " + min + " " + middle + " " + max 	// min, middle, max
	
	if (i == 4) {
			numrank = numrank4
			rank = rank4
			suit = suit4
	}	
	if (numrank4 >= max) {
		numrank4 = max
	} else if ((numrank4 <= max) && (numrank4 >= middle)) {
		numrank4 = maxmed
	} else if (numrank 4 == middle) {
		numrank4 = middle
	} else if ((numrank4 <= middle) && (numrank4 >= min)) {
		numrank4 = minmed
	} else if (numrank4 <= min) {
		numrank4 = min
	}
	
	println "Cards sorted by rank are " + min + " " + minmed + " " + middle + " " + medmax + " " + max 	// min, minmed, middle, medmax, max
	
	if (i == 5) {
			numrank = numrank5
			rank = rank5
			suit = suit5
	}	
	
	println "Cards sorted by rank are " + min + " " + minmed + " " + middle + " " + medmax + " " + max 	// min, minmed, middle, medmax, max
	

// validate the card has been entered correctly 

}			//end of while statement


// Need to make sure it only uses each card only once - haven't done that yet


//work out a straight flush

// if (((suit1 == suit2) && (suit2 == suit3) && (suit3 == suit4) && (suit4 == suit5)) && rank1 + rank2 + rank3 + rank 

