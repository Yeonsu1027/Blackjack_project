package Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardService {
	static List<String> dealerCard = null;
	static List<String> playerCard = null;
	
	static int dealerscore = 0;
	static int playerscore = 0;
	

	public CardService() {
		dealerCard = new ArrayList<>();
		playerCard = new ArrayList<>();
	}
	
	public static void card() {
		String[] carddeck = { "♣A", "♣2", "♣3", "♣4", "♣5", "♣6", "♣7", "♣8", "♣9", "♣10", "♣J", "♣Q", "♣K", "♥A", "♥2",
				"♥3", "♥4", "♥5", "♥6", "♥7", "♥8", "♥9", "♥10", "♥J", "♥Q", "♥K", "♠A", "♠2", "♠3", "♠4", "♠5", "♠6",
				"♠7", "♠8", "♠9", "♠10", "♠J", "♠Q", "♠K", "◆A", "◆2", "◆3", "◆4", "◆5", "◆6", "◆7", "◆8", "◆9", "◆10",
				"◆J", "◆Q", "◆K" };

		int[] cardscore = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 1, 2,
				3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };

		String temp = null;
		int temp2 = 0;
		Random random = new Random();

		random = new Random();
		for (int i = carddeck.length - 1; i > 0; i--) {
			int j = random.nextInt(i + 1);
			temp = carddeck[i];
			carddeck[i] = carddeck[j];
			carddeck[j] = temp;

			temp2 = cardscore[i];
			cardscore[i] = cardscore[j];
			cardscore[j] = temp2;

			

			dealerCard.add(carddeck[0]);
			dealerCard.add(carddeck[1]);
			playerCard.add(carddeck[2]);
			playerCard.add(carddeck[3]);
		}
		
		
	}//end card
	
	public static void playscore() {
		
	}
	
	
	
	
	public static void cardviewerP() {
		card();
		System.out.println("▶ 당신의 카드 ◀");
		int psize =0;
		int deckcount =0;
		for (deckcount = 0; deckcount < psize; deckcount++) {
			cardviewer1();

		}
		System.out.println();
		for (deckcount = 0; deckcount < psize; deckcount++) {
			cardviewer2(playerCard.get(deckcount));
			//cardviewer2(playerCard.get(deckcount));

		}
		System.out.println();
		for (deckcount = 0; deckcount < psize; deckcount++) {
			cardviewer3();

		}
		System.out.println();
		System.out.println("당신의 점수 : " + playerscore);
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
	
	
	
	
	
	
	
}
