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
while (i < 5) {
i++;

println "Please enter a card"

String card = System.console().readLine()

	if (i == 1){
		card1 = card
		}
	if (i == 2){
		card2 = card
		}
	if (i == 3){
		card3 = card
		}
	if (i == 4){
		card4 = card
		}
	if (i == 5){
		card5 = card
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

String suit1 = card1.substring(0,1)
String rank1 = card1.substring(1)
println suit1 + " " + rank1

String suit2 = card2.substring(0,1)
String rank2 = card2.substring(1)
println suit2 + " " + rank2

String suit3 = card3.substring(0,1)
String rank3 = card3.substring(1)
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

int lowest
int medlow
int mdeium
int medhigh
int high

// possible combinations of rank

//put rank in ascending order



1,2,3,4,5

1,3,4,5,2
1,3,2,4,5
1,3,4,2,5
1,3,

// rank1 > rank2 > rank3 > rank4 > rank5
// rank1 > rank2 > rank3 > rank5 > rank4
// rank1 > rank2 > rank4 > rank3 > rank5
// rank1 > rank2 > rank4 > rank5 > rank3
// rank1 > rank2 > rank5 > rank3 > rank4
// rank1 > rank2 > rank5 > rank4 > rank3

// rank2 > rank1 > rank3 > rank4 > rank5
// rank2 > rank1 > rank3 > rank5 > rank4
// rank2 > rank1 > rank4 > rank3 > rank5
// rank2 > rank1 > rank4 > rank5 > rank3
// rank2 > rank1 > rank5 > rank3 > rank4
// rank2 > rank1 > rank5 > rank4 > rank3

// rank2 > rank1 > rank3 > rank4 > rank5
// rank2 > rank1 > rank3 > rank5 > rank4
// rank2 > rank1 > rank4 > rank3 > rank5
// rank2 > rank1 > rank4 > rank5 > rank3
// rank2 > rank1 > rank5 > rank3 > rank4
// rank2 > rank1 > rank5 > rank4 > rank3


// rank1 > rank3 > rank2 > rank5 > rank4
// rank1 > rank4 > rank5 > rank2 > rank3
// rank1 > rank5 > rank4 > rank3 > rank2

// rank2 > rank1 > rank3 > rank4 > rank5
// rank2 > rank3 > rank1 > rank5 > rank4
// rank2 > rank4 > rank5 > rank1 > rank3
// rank2 > rank5 > rank4 > rank3 > rank1



// rank2 > rank1 > rank3 > rank4 > rank5
// rank1 > rank2 >

	if ((rank1 >= rank2) && (b >= c)) {				// combination 1
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












