package game;

import java.util.List;

import Service.CardService;
import model.BlackjackDto;

public class Game {
	public static void main(String[] args) {
		
		BlackjackDto black = new BlackjackDto();
		CardService service = new CardService();

		service.MakeDeck();
		List<BlackjackDto> deckList = service.getDeck();

		for (BlackjackDto dto : deckList) {
			System.out.println(dto);
		}

	}

}
