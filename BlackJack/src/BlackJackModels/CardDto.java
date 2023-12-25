package BlackJackModels;

import java.util.Random;

public class CardDto {
	
		public static String[] carddeck;
		public static int[] cardscore;
			
		
	public CardDto() {
		carddeck = new String[]  { "♣A", "♣2", "♣3", "♣4", "♣5", "♣6", "♣7", "♣8", "♣9", "♣10", "♣J", "♣Q", "♣K"
				, "♥A", "♥2", "♥3", "♥4", "♥5", "♥6", "♥7", "♥8", "♥9", "♥10", "♥J", "♥Q", "♥K"
				, "♠A", "♠2", "♠3", "♠4", "♠5", "♠6", "♠7", "♠8", "♠9", "♠10", "♠J", "♠Q", "♠K"
				, "◆A", "◆2", "◆3", "◆4", "◆5", "◆6", "◆7", "◆8", "◆9", "◆10", "◆J", "◆Q", "◆K" };
		
		cardscore = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10
				, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10
				, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10
				, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };
		
	}
	
	public static void shufflecard() {
	
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
		
	}

	}
}
