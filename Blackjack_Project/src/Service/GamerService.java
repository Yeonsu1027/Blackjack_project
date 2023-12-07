package Service;

import java.util.ArrayList;
import java.util.List;

import model.CardDto;
import model.GamerDto;

public class GamerService {
	
	CardDto cardDto = new CardDto();
	GamerDto gamerDto = new GamerDto();
	
	public GamerService() {
		List<CardDto>dealerHand = new ArrayList<CardDto>();
		List<CardDto>playerHand = new ArrayList<CardDto>();
	
	}
	
	public void receive() {
		CardService cardService = new CardService();
		cardService.getRandomCard();
		
	
	
		//return gamerDto.getplayerHand();;
		
	}//end receive
	
	public static void main(String[] args) {
		
	}
	

	

}
