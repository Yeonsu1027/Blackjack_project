package model;

import java.util.List;

public class GamerDto {
	
	private List<CardDto> dealerHand = null;
	private List<CardDto> playerHand = null;
	
	public List<CardDto>getDealerHand(){
		return dealerHand;
	}
	
	public List<CardDto>getplayerHand(){
		return playerHand;
	}
	
	


}
