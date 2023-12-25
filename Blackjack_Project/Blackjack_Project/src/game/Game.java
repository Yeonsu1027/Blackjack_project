package game;

import java.util.List;

import Service.CardService;
import model.CardDto;

public class Game {
	public static void main(String[] args) {
		
		CardService card = new CardService();
		CardDto black = new CardDto();

		card.MakeDeck();
		List<CardDto> deckList = card.getDeck();

//		for (BlackjackDto dto : deckList) {
//			System.out.println(dto);
//		}
		System.out.println(card.getRandomCard());
		
		
		
		
		
		
		

	}//end main

}
