package BlackJackService;

import java.util.ArrayList;
import java.util.List;

import BlackJackModels.CardDto;
import utils.Line;

public class CardService {

	static CardDto cardDto = new CardDto();
	public static List<String> dealerCard = null;
	public static List<String> playerCard = null;
	static int Hitcardnum = 4;

	public CardService() {
		dealerCard = new ArrayList<>();
		playerCard = new ArrayList<>();
	}
	
	
	public static void carddeal() {
		cardDto.shufflecard();

		dealerCard.add(cardDto.carddeck[0]);
		dealerCard.add(cardDto.carddeck[1]);
		playerCard.add(cardDto.carddeck[2]);
		playerCard.add(cardDto.carddeck[3]);

		// test용
		//System.out.println(playerCard);
	}

	
	public static void cardviewer1() {
		System.out.print("┌─────┐");
	}

	public static void cardviewer2(String card) {
		System.out.printf("│%3s  │", card);
	}

	public static void cardviewer3() {
		System.out.print("└─────┘");
	}

	
	public static void HitCardP() {
		playerCard.add(CardDto.carddeck[Hitcardnum]);
	}
	
	public static void cardviewerP() {
		int playerscore = 0;
		Line.sLine(50);
		System.out.println("▶ 당신의 카드 ◀");
		
		carddeal();  //처음받은카드
		//HitCardP();//추가로받은카드부분 추가
		
		int size = playerCard.size();
		int deckcount =0;
		for (deckcount = 0; deckcount < size; deckcount++) {
			cardviewer1();
		}
		System.out.println();
		for (deckcount = 0; deckcount < size; deckcount++) {
			 cardviewer2(playerCard.get(deckcount));
		}
		System.out.println();
		for (deckcount = 0; deckcount < size; deckcount++) {
			cardviewer3();
		}
		
		//플레이어 점수 더해두기
		for(int i =0; i<size ; i++ ) {
			playerscore += cardDto.cardscore[i];
		}
		
		System.out.println(); // 줄바꿈
		System.out.println("당신의 현재점수 : " + playerscore);
		
	
	}// end cardviewerP

}
