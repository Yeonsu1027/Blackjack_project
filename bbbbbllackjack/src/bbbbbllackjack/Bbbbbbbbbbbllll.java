package bbbbbllackjack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bbbbbbbbbbbllll {

	// 카드는 총 52장, 점수 A는1 ,JQK는 10
	// 카드 두장씩 받는다.
	// 21 초과면 패배, 21이거나 21에 가장 가까우면승리
	// 딜러의 카드 2장의 합계가 16점이하면 반드시 1장추가로 뽑는다
	// 17점 이상이면 추가할 수 없다

//		String trump = "src/Service/trump.txt";
//		try {
//			InputStream trumpcard = new FileInputStream(trump);
//			
//		} catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//		}

	// 구성할것.. 문양순서대로 card[52]를 생성
	// 각 카드에 점수 부여 :
	// cart[1] ~ card[13] : 1~10,10,10
	// cart[14] ~ card[26] : 1~10,10,10
	// cart[27] ~ card[39] : 1~10,10,10
	// cart[40] ~ card[52] : 1~10,10,10 cardscore의 점수를 부여
	// 문자열[52]에 문양,스코어 넣고 점수계산할땐 substring으로 앞에 문양 잘라서
	// 점수 숫자로 만들면 될듯?
	// ---------------------
	//

	// scan = new Scanner(trumpcard);

	Scanner scan = null;

	public static void main(String[] args) {

		// -------------------------------------------------

		int cardscore1 = 1; // 트럼프 카드의 점수
		int cardscore2 = 2;
		int cardscore3 = 3;
		int cardscore4 = 4;
		int cardscore5 = 5;
		int cardscore6 = 6;
		int cardscore7 = 7;
		int cardscore8 = 8;
		int cardscore9 = 9;
		int cardscore10 = 10;

		int dealerscore = 0; // 딜러카드의 점수
		int playerscore = 0; // 플레이어카드의 점수

		// ------------------------------------------------

		String[] carddeck = { 
				"♣A", "♣2", "♣3", "♣4", "♣5", "♣6", "♣7", "♣8", "♣9", "♣10", "♣J", "♣Q", "♣K", "♥A", "♥2",
				"♥3", "♥4", "♥5", "♥6", "♥7", "♥8", "♥9", "♥10", "♥J", "♥Q", "♥K", "♠A", "♠2", "♠3", "♠4", "♠5", "♠6",
				"♠7", "♠8", "♠9", "♠10", "♠J", "♠Q", "♠K", "◆A", "◆2", "◆3", "◆4", "◆5", "◆6", "◆7", "◆8", "◆9", "◆10",
				"◆J", "◆Q", "◆K" };

		// ---------------------------------------------

		System.out.println("블랙잭 게임을 시작합니다");
		
		// 카드를 랜덤으로 뽑을때 사용할 카드번호
		//int cardnum = (int) (Math.random() * 52); //0~51, 총52장의 카드
		
		
		for ( int i = carddeck.length-1; i>0;i--) {
			int j = (int) (Math.random() * 52);
			String temp = carddeck[i];
			carddeck[i] = carddeck[j];
			carddeck[j] = temp;
		}
		
		
		
		// 플레이어와 딜러의 보유카드 목록 & 초기화
		List<String> playerCard = new ArrayList<>();
		List<String> dealerCard = new ArrayList<>();
		
		
		
		
//		
//		for ( String card : carddeck) {
//			System.out.println("┌─────┐\t┌─────┐");
//			System.out.printf("│%3s  │\t│%3s  │\n",card,card);
//			System.out.println("└─────┘\t└─────┘");
//			
//		}
	
		
		//카드 출력할때 사용
	//	System.out.println("┌─────┐");
	//	System.out.printf("│%3s  │\n",carddeck[cardnum]);
	//	System.out.println("└─────┘");
		
	//	System.out.println("┌─────┐\t┌─────┐");
	//	System.out.printf("│%3s  │\t│%3s  │\n",carddeck[cardnum],carddeck[cardnum]);
	//	System.out.println("└─────┘\t└─────┘");
		
		// trump[i], i=1*card 이런식으로
		//

		// while문

		// 카드덱을 초기화하고 섞는곳

		// 게이머와 딜러의 카드를 초기화

		// 처음 두장을 나눠준다

	}
}