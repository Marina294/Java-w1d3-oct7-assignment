import java.util.Scanner;

// (Game: pick a card) 
// Write a program that simulates picking a card 
// from a deck of 52 cards. Your program should display 
// the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King)
//  and suit (Clubs, Diamonds, Hearts, Spades) 
//  of the card. Here is a sample run of the program:
// Hint: This is a good use for a switch case

public class GamePickACard {


    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("This program displays a randomly chosen card");
        Card randomCard = selectCardFromDeckRandomly();
        System.out.println(randomCard);
    }


    private Card selectCardFromDeckRandomly() {
        String rank = selectRanomCardRank();
        String suit = selectRandomCardSuit();
        return (new Card(rank, suit));  
    }

    private String selectRanomCardRank() {
        String cardRank;
        int r = 1 + rgen.nextInt(13);
        switch (r) {
        case 1:
            cardRank = "Ace";
            break;
        case 2:
            cardRank = "2";
            break;
        case 3:
            cardRank = "3";
            break;
        case 4:
            cardRank = "4";
            break;
        case 5:
            cardRank = "5";
            break;          
        case 6:
            cardRank = "6";
            break;
        case 7:
            cardRank = "7";
            break;
        case 8:
            cardRank = "8";
            break;
        case 9:
            cardRank = "9";
            break;
        case 10:
            cardRank = "10";
            break;
        case 11:
            cardRank = "Jack";
            break;
        case 12:
            cardRank = "Queen";
            break;          
        default:
            cardRank = "King";
            break;
        }
        return cardRank;
    }


    private String selectRandomCardSuit() {
        String cardSuit;
        int s = 1 + rgen.nextInt(4);
        switch (s) {
        case 1:
            cardSuit = "Clubs";
            break;
        case 2:
            cardSuit = "Diamonds";
            break;
        case 3:
            cardSuit = "Hearts";
            break;
        default:
            cardSuit = "Spades";
            break;
        }
        return cardSuit;

    }
}