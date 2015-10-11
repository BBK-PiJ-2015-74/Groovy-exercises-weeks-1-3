// X011 Lucie's Poker Hands

//Once the program has the five cards, it should tell the user what is the best hand she has got, as per the following list (from best to worst):
//Straight flush: all cards are of the same suit and their ranks are consecutive. Note that they are probably not ordered as they were entered.
//Poker: four of the five cards have the same rank.
//Full House: three of a kind plus two of a kind.
//Flush: all cards share the same suit, but are not consecutive. 
//Straight: all cards are consecutive, but not of the same suit. 
//Three of a kind: three of the five cards have the same rank. 
//Two pairs: two pairs (see below).
//Pair: two of the five cards have the same rank.
//Nothing: any other situation.

// Could simply by making rank_position the same as rank. Would this preserve suit? It should if suit moves up the array too

println "Welcome to Poker Hands!"
println "First, pick the suit of your card: it can be clubs, spades, hearts or diamonds"
println "Enter C for clubs, S for spades, H for hearts, D for diamonds"
println "Then, pick the number of your card: it can be 1,2,3,4,5,6,7,8,9,10,J,Q,K"
println "For example, enter C1 which is the ace of clubs, or DK which is the King of diamonds"


int i = 0
int rank, rank1, rank2, rank3, rank4, rank5
int rank_position1, rank_position2, rank_position3, rank_position4, rank_position5
String suit1, suit2, suit3, suit4, suit5
String suit_position1, suit_position2, suit_position3, suit_position4, suit_position5
 
while (i < 5) {
i++;

println "Please enter a card"

String card = System.console().readLine()

String suit = card.substring(0,1)
String str_rank = card.substring(1)

// convert str_rank to an integer and validate
    switch (str_rank) {
    case "j":
    case "J":
        rank = 11;
        break;
    case "q":
    case "Q":
        rank = 12;
        break;
    case "k":
    case "K":
        rank = 13;
        break;
    default:
        rank = Integer.parseInt(str_rank);
        break;
    }

    if (!(rank >= 1 && rank <= 13)) {
        println "Error; rank must be 0-10, J, Q or K. Please enter the card again."
        continue;
    }

// validate card suit
    switch (suit) {
    case "s":
    case "S":
    case "h":
    case "H":
    case "d":
    case "D":
    case "c":
    case "C":
        break;
    default:
        println "Error; card suit must be S, C, H or D. Please enter the card again."
        continue;
    }

		
	if (i == 1) {							//for i = 1, assign values rank and suit from 1st card
		rank1 = rank
		suit1 = suit
		println "The card you entered was " + suit1 + rank1
	}	// End of loop i=1
									
		
	if (i == 2) {
		rank2 = rank
		suit2 = suit
		println "The card you entered was " + suit2 + rank2

		if (rank2 > rank1) {
			rank_position2 = rank2
			suit_position2 = suit2
			rank_position1 = rank1
			suit_position1 = suit1
		} else { 
			rank_position2 = rank1
			suit_position2 = suit1
			rank_position1 = rank2
			suit_position1 = suit2 
		}
		println "Cards sorted by rank are " + suit_position1 + rank_position1 + " " + suit_position2 + rank_position2
	}									//End of loop i=2
	
	if (i == 3) {
		rank3 = rank
		suit3 = suit
		println "The card you entered was " + suit3 + rank3
	
		if (rank3 >= rank_position2) {
			rank_position3 = rank3
			suit_position3 = suit3
		} else if ((rank3 <= rank_position2) && (rank3 >= rank_position1)) {
			rank_position3 = rank_position2
			suit_position3 = suit_position2
			rank_position2 = rank3
			suit_position2 = suit3
		} else if (rank3 <= rank_position1) {
			rank_position3 = rank_position2
			suit_position3 = suit_position2
			rank_position2 = rank_position1
			suit_position2 = suit_position1
			rank_position1 = rank3
			suit_position1 = suit3
		}
		println "Cards sorted by rank are " + suit_position1 + rank_position1 + " " + suit_position2 + rank_position2 + " " + suit_position3 + rank_position3
	} // End of loop 3
	
	if (i == 4) {
		rank4 = rank
		suit4 = suit
		println "The card you entered was " + suit4 + rank4
	
		if (rank4 >= rank_position3) {
			rank_position4 = rank4
			suit_position4 = suit4
		} else if ((rank4 <= rank_position3) && (rank4 >= rank_position2)) {
			rank_position4 = rank_position3
			suit_position4 = suit_position3
			rank_position3 = rank4
			suit_position3 = suit4
		} else if ((rank4 <= rank_position2) && (rank4 >= rank_position1)) {
			rank_position4 = rank_position3
			suit_position4 = suit_position3
			rank_position3 = rank_position2
			suit_position3 = suit_position2
			rank_position2 = rank4
			suit_position2 = suit4
		} else if (rank4 <= rank_position1) {
			rank_position4 = rank_position3
			suit_position4 = suit_position3
			rank_position3 = rank_position2
			suit_position3 = suit_position2
			rank_position2 = rank_position1
			suit_position2 = suit_position1
			rank_position1 = rank4
			suit_position1 = suit4
		}
		println "Cards sorted by rank are " + suit_position1 + rank_position1 + " " + suit_position2 + rank_position2 + " " + suit_position3 + rank_position3 + " " + suit_position4 + rank_position4
	} // End of loop 4
	
	
	if (i == 5) {
		rank5 = rank
		suit5 = suit
		println "The card you entered was " + suit5 + rank5
	
		if (rank5 >= rank_position4) {
			rank_position5 = rank5
			suit_position5 = suit5
		} else if ((rank5 <= rank_position4) && (rank5 >= rank_position3)) {
			rank_position5 = rank_position4
			suit_position5 = suit_position4
			rank_position4 = rank5
			suit_position4 = suit5
		} else if ((rank5 <= rank_position3) && (rank4 >= rank_position2)) {
			rank_position5 = rank_position4
			suit_position5 = suit_position4
			rank_position4 = rank_position3
			suit_position4 = suit_position3
			rank_position3 = rank5
			suit_position3 = suit5
		} else if ((rank5 <= rank_position2) && (rank4 >= rank_position1)) {
			rank_position5 = rank_position4
			suit_position5 = suit_position4
			rank_position4 = rank_position3
			suit_position4 = suit_position3
			rank_position3 = rank_position2
			suit_position3 = suit_position2
			rank_position2 = rank5
			suit_position2 = suit5
		} else if (rank5 <= rank_position1) {
			rank_position5 = rank_position4
			suit_position5 = suit_position4
			rank_position4 = rank_position3
			suit_position4 = suit_position3
			rank_position3 = rank_position2
			suit_position3 = suit_position2
			rank_position2 = rank_position1
			suit_position2 = suit_position1
			rank_position1 = rank5
			suit_position1 = suit5
		}
		println "Cards sorted by rank are " + suit_position1 + rank_position1 + " " + suit_position2 + rank_position2 + " " + suit_position3 + rank_position3 + " " + suit_position4 + rank_position4 + " " + suit_position5 + rank_position5
	} // End of loop 5

}			//end of while statement


// Need to make sure it only uses each card only once - haven't done that yet


//work out a straight flush

	if ((suit1 == suit2 && suit2 == suit3 && suit3 == suit4 && suit4 == suit5) && (rank5 == rank4 + 1 && rank4 == rank3 + 1 && rank3 == rank2 +1 && rank2 == rank1 + 1)) {
	String BestHand = "Straight Flush"
	println "Your best hand is: " + BestHand
	}
