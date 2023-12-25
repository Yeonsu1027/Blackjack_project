package BlackJackService;

public class scoretest {
	public static void main(String[] args) {
		
//		int[] cardscore = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10
//				, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10
//				, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10
//				, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };
		int[] cardscore = new int[52];
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

		int index = 0;
		for (int i = 0; i < 4; i++) {
		    for (int j = 0; j < 13; j++) {
		        cardscore[index] = numbers[j];
		        index++;
		    }
		}
		
		System.out.println(cardscore[0]); //1
		System.out.println(cardscore[13]); //1
		System.out.println(cardscore[14]); //2
		System.out.println(cardscore[16]); //4
		System.out.println(cardscore[24]); //10
		System.out.println(cardscore[26]); //1
		System.out.println(cardscore[30]); //5
		System.out.println(cardscore[32]); //7
		System.out.println(cardscore[51]); //10
		
	}

}
