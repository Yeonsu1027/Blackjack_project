package bbbbbllackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class testestestestestetstestestetsestt {
	public class Blackjack {
	    private static final int CARD_LIMIT = 21;
	    private static final int DEALER_MIN = 17;

	    public void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to Blackjack!");

	        // Initialize the deck of cards and shuffle it
	        List<String> deck = createDeck();
	        Collections.shuffle(deck);

	        // Initialize the player and dealer hands
	        List<String> playerHand = new ArrayList<>();
	        List<String> dealerHand = new ArrayList<>();

	        // Deal the initial two cards to the player and dealer
	        dealCard(playerHand, deck);
	        dealCard(playerHand, deck);
	        dealCard(dealerHand, deck);
	        dealCard(dealerHand, deck);

	        // Show the player's hand and the dealer's first card
	        System.out.println("Your hand: " + playerHand);
	        System.out.println("Dealer's hand: [" + dealerHand.get(0) + ", *]");

	        // Allow the player to hit or stand until they go over 21 or choose to stand
	        while (getHandValue(playerHand) < CARD_LIMIT) {
	            System.out.print("Do you want to hit or stand? ");
	            String choice = scanner.nextLine().toLowerCase();

	            if (choice.equals("hit")) {
	                dealCard(playerHand, deck);
	                System.out.println("Your hand: " + playerHand);
	            } else if (choice.equals("stand")) {
	                break;
	            } else {
	                System.out.println("Invalid choice. Please choose hit or stand.");
	            }
	        }

	        // Show the dealer's full hand
	        System.out.println("Dealer's hand: " + dealerHand);

	        // Dealer's turn
	        while (getHandValue(dealerHand) < DEALER_MIN) {
	            dealCard(dealerHand, deck);
	            System.out.println("Dealer hits: " + dealerHand.get(dealerHand.size() - 1));
	        }

	        // Determine the winner
	        int playerValue = getHandValue(playerHand);
	        int dealerValue = getHandValue(dealerHand);
	        if (playerValue > CARD_LIMIT) {
	            System.out.println("You bust. Dealer wins!");
	        } else if (dealerValue > CARD_LIMIT) {
	            System.out.println("Dealer busts. You win!");
	        } else if (playerValue > dealerValue) {
	            System.out.println("You win!");
	        } else if (dealerValue > playerValue) {
	            System.out.println("Dealer wins!");
	        } else {
	            System.out.println("It's a tie!");
	        }
	    }

	    private List<String> createDeck() {
	        List<String> deck = new ArrayList<>();
	        for (int i = 2; i <= 10; i++) {
	            for (int j = 0; j < 4; j++) {
	                deck.add(Integer.toString(i));
	            }
	        }
	        for (int i = 0; i < 4; i++) {
	            deck.add("J");
	            deck.add("Q");
	            deck.add("K");
	            deck.add("A");
	        }
	        return deck;
	    }

	    private void dealCard(List<String> hand, List<String> deck) {
	        String card = deck.remove(0);
	        hand.add(card);
	    }

	    private int getHandValue(List<String> hand) {
	        int value = 0;
	        int aces = 0;

	        for (String card : hand) {
	            if (card.equals("J") || card.equals("Q") || card.equals("K")) {
	                value += 10;
	            } else if (card.equals("A")) {
	                aces++;
	            } else {
	                value += Integer.parseInt(card);
	            }
	        }

	        for (int i = 0; i < aces; i++) {
	            if (value + 11 > CARD_LIMIT) {
	                value += 1;
	            } else {
	                value += 11;
	            }
	        }

	        return value;
	    }
	}

}
