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
int min, minmed, middle, maxmed, max, numrank1, numrank2, numrank3, numrank4, numrank5
 
while (i < 5) {
i++;

println "Please enter a card"

String card = System.console().readLine()

	if (i == 1){
		card1 = card
		String suit1 = card1.substring(0,1)
		String rank1 = card1.substring(1)
		println suit1 + " " + rank1
			if ((rank1 =="1") || (rank1 =="2") || (rank1 =="3") || (rank1 =="4") || (rank1 =="5") || (rank1 =="6") || (rank1 =="7") || (rank1 =="8") || (rank1 =="9") || (rank1 =="10")) {
				numrank1 = Integer.parseInt(rank1)      //convert string rank to integer for rank = 1 to 10
			} else if (rank1 == "J") {
				numrank1 = 11
			} else if (rank1 == "Q") {
				numrank1 = 12
			} else if (rank1 == "K") {
				numrank1 = 13
			}
		println numrank1
	}								
	
	if (i == 2){
		card2 = card
		String suit2 = card2.substring(0,1)
		String rank2 = card2.substring(1)
		println suit2 + " " + rank2
			if ((rank2 =="1") || (rank2 =="2") || (rank2 =="3") || (rank2 =="4") || (rank2 =="5") || (rank2 =="6") || (rank2 =="7") || (rank2 =="8") || (rank2 =="9") || (rank2 =="10")) {
				numrank2 = Integer.parseInt(rank2)      
			} else if (rank2 == "J") {
				numrank2 = 11
			} else if (rank2 == "Q") {
				numrank2 = 12
			} else if (rank2 == "K") {
				numrank2 = 13
			}
		if (numrank2 > numrank1) {
			numrank2 = max
			numrank1 = min 
		} else { 
			numrank2 = min
			numrank1 = max 
		} 		 
	}
	
	if (i == 3){
		card3 = card
		String suit3 = card3.substring(0,1)
		String rank3 = card3.substring(1)
		println suit3 + " " + rank3
			if ((rank3 =="1") || (rank3 =="2") || (rank3 =="3") || (rank3 =="4") || (rank3 =="5") || (rank3 =="6") || (rank3 =="7") || (rank3 =="8") || (rank3 =="9") || (rank3 =="10")) {
				numrank3 = Integer.parseInt(rank3)      
			} else if (rank3 == "J") {
				numrank3 = 11
			} else if (rank3 == "Q") {
				numrank3 = 12
			} else if (rank3 == "K") {
				numrank3 = 13
			}
		if (numrank3 >= max) {
			max = numrank3
		} else if ((numrank3 <= max) && (numrank3 >= min)) {
			middle = numrank3
		} else if (numrank3 <= min) {
			min = numrank3  
		}
	}
		
	if (i == 4){
		card = card4
		}
	if (i == 5){
		card = card5
		}

// validate the card has been entered correctly 

String suit = card.substring(0,1)
String rank = card.substring(1)

	if (((rank =="1") || (rank =="2") || (rank =="3") || (rank =="4") || (rank =="5") || (rank =="6") || (rank =="7") || (rank =="8") || (rank =="9") || (rank =="10") || (rank =="J") || (rank=="Q") || (rank =="K")) && ((suit == "C") || (suit == "S") || (suit == "H") || (suit == "D"))){
	println "Card valid"
	} else {
	println "Error, please try to enter the card again"
	}
}			//end of while statement

println card1 + " " + card2 + " " + card3 + " " + card4 + " " + card5 + " "

// Need to make sure it only uses each card only once - haven't done that yet

// The next few lines split the cards into rank and suit for each e.g. card 1 = suit1 + rank1

println suit1 + " " + rank1

println suit2 + " " + rank2

println suit3 + " " + rank3

String suit4 = card4.substring(0,1)
String rank4 = card4.substring(1)
println suit4 + " " + rank4

String suit5 = card5.substring(0,1)
String rank5 = card5.substring(1)
println suit5 + " " + rank5

//work out a straight flush

// if (((suit1 == suit2) && (suit2 == suit3) && (suit3 == suit4) && (suit4 == suit5)) && rank1 + rank2 + rank3 + rank 

// To check if they are consecutive, first order them in terms of size
