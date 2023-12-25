package Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import utils.Line;

public class gameService {
	public static void game() {

		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		String str = null;

		int endScoreD = 0;
		int endScoreP = 0;

		int deckcount = 0;
		// ------------------------------------------------

		String[] carddeck = { "♣A", "♣2", "♣3", "♣4", "♣5", "♣6", "♣7", "♣8", "♣9", "♣10", "♣J", "♣Q", "♣K"
				, "♥A", "♥2", "♥3", "♥4", "♥5", "♥6", "♥7", "♥8", "♥9", "♥10", "♥J", "♥Q", "♥K"
				, "♠A", "♠2", "♠3", "♠4", "♠5", "♠6", "♠7", "♠8", "♠9", "♠10", "♠J", "♠Q", "♠K"
				, "◆A", "◆2", "◆3", "◆4", "◆5", "◆6", "◆7", "◆8", "◆9", "◆10", "◆J", "◆Q", "◆K" };

//		int[] cardscore = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10
//						, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10
//						, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10
//						, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };
		
		//위에 주석과 같은 똑같은 배열 생성
		int[] cardscore = new int[52];
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

		int index = 0;
		for (int i = 0; i < 4; i++) {
		    for (int j = 0; j < 13; j++) {
		        cardscore[index] = numbers[j];
		        index++;
		    }
		}
		
		
		

		int dealerscore = 0;
		int playerscore = 0;

		// ---------------------------------------------
		String temp = null;
		int temp2 = 0;
		Random random = new Random();
		

		inform();

		while (true) {
			str = scan.nextLine();

			if (str.equals("START")) {

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

			} else if (str.equals("QUIT")) break;
				
			
				

			List<String> dealerCard = new ArrayList<>();
			List<String> playerCard = new ArrayList<>();

			dealerCard.add(carddeck[0]);
			dealerCard.add(carddeck[1]);
			playerCard.add(carddeck[2]);
			playerCard.add(carddeck[3]);

			inform();

			// -----------------------------------------------------------
			System.out.println("▶ 딜러의 카드 ◀");
			System.out.println("┌─────┐┌─────┐");
			// System.out.printf("│%3s ││%3s │\n",dealerCard.get(0),dealerCard.get(1));
			// //테스트용 보여주기
			System.out.printf("│%3s  ││%3s  │\n", dealerCard.get(0), "??"); // 실전용 안보여주기
			System.out.println("└─────┘└─────┘");
			dealerscore = cardscore[0]; // 카드번호에 맞는 점수 주기
			dealerscore += cardscore[1];
			System.out.println("딜러의 현재점수 : " + "???"); // 실전용 안보여주기
			// System.out.println("딜러의 현재점수 : "+dealerscore); //테스트용 점수보여주기

			Line.sLine(50);

			System.out.println("▶ 당신의 카드 ◀");
			System.out.println("┌─────┐┌─────┐");
			System.out.printf("│%3s  ││%3s  │\n", playerCard.get(0), playerCard.get(1));
			System.out.println("└─────┘└─────┘");
			playerscore = cardscore[2];
			playerscore += cardscore[3];
			System.out.println("당신의 현재점수 : " + playerscore);

			// -----------------------------------------------------------------------------------

			// 게임진행 시작

			Line.sLine(50);

			// 0~3은 처음 2장씩 나눠준 4장의 카드.
			int PCardNum = 4;  //hit하는 곳위에다가 새로받는 카드번호 설정해두기
			

			while (true) {
				System.out.println("HIT or STOP ???");
				str = scan.nextLine();

				// -----------------------------------------------
				if (str.equals("HIT")) {

					playerCard.add(carddeck[PCardNum]);
					playerscore += cardscore[PCardNum];

					if (playerscore > 21) {
						break;
					} else if (playerscore == 21)
						break;

					PCardNum++;
				//	playerHitCard++; // hit 으로 새로받은 플레이어의 카드 번호

					// ☆★☆★ HIT 하면 출력될 곳 ★☆★☆
					inform();
					System.out.println("▶ 딜러의 카드 ◀");
					System.out.println("┌─────┐┌─────┐");
					// System.out.printf("│%3s ││%3s │\n",dealerCard.get(0),dealerCard.get(1));
					// //테스트용 보여주기
					System.out.printf("│%3s  ││%3s  │\n", dealerCard.get(0), "??"); // 실전용 안보여주기
					System.out.println("└─────┘└─────┘");
					dealerscore = cardscore[0];
					dealerscore += cardscore[1];
					System.out.println("딜러의 현재점수 : " + "???"); // 실전용 안보여주기
					// System.out.println("딜러의 현재점수 : "+dealerscore); //테스트용 점수보여주기

					Line.sLine(50);
					System.out.println("▶ 당신의 카드 ◀");
					// ----------------처음2장의 카드와 HIT한 카드를 추가로보여주는곳--
					int psize = playerCard.size();

					for (deckcount = 0; deckcount < psize; deckcount++) {
						cardviewer1();
					}
					System.out.println();
					for (deckcount = 0; deckcount < psize; deckcount++) {
						cardviewer2(playerCard.get(deckcount));
					}
					System.out.println();
					for (deckcount = 0; deckcount < psize; deckcount++) {
						cardviewer3();
					}
					System.out.println(); // 줄바꿈
					System.out.println("당신의 현재점수 : " + playerscore);

					// ----------------------------------------------------

					continue;

				} else if (str.equals("STOP")) {
					break; 
				}
			} // end while

			// ---------------------------------------
			// 딜러의 카드와 점수가 계산된 곳
			// 플레이어가 hit를 끝냈을시 딜러카드계산하게함
			
			int DCardNum =0;
			// DCardNum = PCardNum +1; 
			//플레이어가 쓰고난 카드 다음부터 사용시작 //카드 최대 51번까지
			for (DCardNum = PCardNum +1; DCardNum < 51; DCardNum++) {

				if (dealerscore < 17) {
					dealerCard.add(carddeck[DCardNum]);
					dealerscore += cardscore[DCardNum];
				}
			} // end for

			// -------------------------------------------------------
			inform();
			System.out.println("▶ 딜러의 카드 ◀");
			int dsize = dealerCard.size();
			for (deckcount = 0; deckcount < dsize; deckcount++) {
				cardviewer1();
			}
			System.out.println();
			for (deckcount = 0; deckcount < dsize; deckcount++) {
				cardviewer2(dealerCard.get(deckcount));
			}
			System.out.println();
			for (deckcount = 0; deckcount < dsize; deckcount++) {
				cardviewer3();
			}
			System.out.println();
			System.out.println("딜러의 점수 : " + dealerscore);
			Line.sLine(50);

			// --------------------------------------------
			int psize = playerCard.size();
			System.out.println("▶ 당신의 카드 ◀");
			for (deckcount = 0; deckcount < psize; deckcount++) {
				cardviewer1();

			}
			System.out.println();
			for (deckcount = 0; deckcount < psize; deckcount++) {
				cardviewer2(playerCard.get(deckcount));

			}
			System.out.println();
			for (deckcount = 0; deckcount < psize; deckcount++) {
				cardviewer3();

			}
			System.out.println();
			System.out.println("당신의 점수 : " + playerscore);
			Line.sLine(50);

			// 승리판별 "STOP을 입력했을시"-----------------------------------------------

			endScoreD = 21 - dealerscore;
			endScoreP = 21 - playerscore;

			if (playerscore > 21) {
				System.out.println("BUST! 21점이 넘었습니다");
				System.out.println("당신의 패배입니다..");
			} else if (dealerscore > 21) {
				System.out.println("딜러 BUST!");
				System.out.println("당신의 승리입니다!");
			}
			// ------------------------
			else if (dealerscore == playerscore) {
				System.out.println("비겼습니다!");
			} else if (playerscore == 21) {
				System.out.println("★ BlackJack! ★");
				System.out.println("당신의 승리입니다!");
			} else if (endScoreD > endScoreP) {
				System.out.println("당신의 승리입니다!");
			} else if (endScoreD < endScoreP) {
				System.out.println("당신의 패배입니다..");
			}
						

			Line.sLine(50);

		} // endwhile2
		System.out.println("게임이 종료되었습니다.");
		// --------------------------------------------------------

	}// end main
	
	public static void inform() {
		Line.dLine(50);
		System.out.println("★ Welcome!! ★");
		System.out.println("★ Blackjack Game ★");
		Line.dLine(50);
		System.out.println("※ 규칙 안내 ※");
		System.out.println("BUST(21점초과)시 딜러의 패와 관계없이");
		System.out.println("당신의 패배입니다");
		Line.sLine(50);
		System.out.println("게임시작 및 재시작 : START");
		System.out.println("게임종료 : QUIT");
		Line.dLine(50);
	}

	// 추가로 보여줄 카드출력용
	public static void cardviewer1() {
		System.out.print("┌─────┐");
	}

	public static void cardviewer2(String card) {
		System.out.printf("│%3s  │", card);
	}

	public static void cardviewer3() {
		System.out.print("└─────┘");
	}	
	
//	public static void cardviewer(int deckcount, int psize) {
//		for (deckcount = 0; deckcount < psize; deckcount++) {
//			cardviewer1();
//		}
//		System.out.println();
//		for (deckcount = 0; deckcount < psize; deckcount++) {
//			cardviewer2(playerCard.get(deckcount));
//		}
//		System.out.println();
//		for (deckcount = 0; deckcount < psize; deckcount++) {
//			cardviewer3();
//		}
//		System.out.println(); // 줄바꿈
//	}
	
	
	
	
}

