package bbbbbllackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import utils.Line;

public class testver2 {

	

	public static void main(String[] args) {
		
		//HIT or STAND 입력받는용
		Scanner scan = new Scanner(System.in);
		
		
		// 점수계산용
		int endScoreD =0;
		int endScoreP =0;
		
		// ------------------------------------------------
		//카드덱
		String[] carddeck = { "♣A", "♣2", "♣3", "♣4", "♣5", "♣6", "♣7", "♣8", "♣9", "♣10", "♣J", "♣Q", "♣K", "♥A", "♥2",
				"♥3", "♥4", "♥5", "♥6", "♥7", "♥8", "♥9", "♥10", "♥J", "♥Q", "♥K", "♠A", "♠2", "♠3", "♠4", "♠5", "♠6",
				"♠7", "♠8", "♠9", "♠10", "♠J", "♠Q", "♠K", "◆A", "◆2", "◆3", "◆4", "◆5", "◆6", "◆7", "◆8", "◆9", "◆10",
				"◆J", "◆Q", "◆K" };
		//점수
		int[] cardscore = { 1,2,3,4,5,6,7,8,9,10,10,10,10,
							1,2,3,4,5,6,7,8,9,10,10,10,10,
							1,2,3,4,5,6,7,8,9,10,10,10,10,
							1,2,3,4,5,6,7,8,9,10,10,10,10 };
		
		int dealerscore = 0; // 딜러카드의 점수
		int playerscore = 0; // 플레이어카드의 점수

		// ---------------------------------------------

//		String spentCard = null; // 이미 뽑힌카드 둘곳  // 필요없는거같은데
		
		Random random = new Random();
		for (int i = carddeck.length - 1; i > 0; i--) {
		    int j = random.nextInt(i + 1);
		    String temp = carddeck[i];
		    carddeck[i] = carddeck[j];
		    carddeck[j] = temp;   //카드랜덤으로 섞기
		    
		    int temp2 = cardscore[i];
		    cardscore[i] = cardscore[j];
		    cardscore[j] = temp2;  //점수도 카드랑 같은 순서로 섞어두기
		}
		
		
		// 플레이어와 딜러의 보유카드 목록 & 초기화
		List<String> dealerCard = new ArrayList<>();
		List<String> playerCard = new ArrayList<>();
		
		
		//카드 두장씩 나눠주기
		
		dealerCard.add(carddeck[0]);
		dealerCard.add(carddeck[1]);
		playerCard.add(carddeck[2]);
		playerCard.add(carddeck[3]);  
		
		
		
		//처음 카드 두장씩
		//-----------------------------------------------------------
		System.out.println("▶ 딜러의 카드 ◀");
		System.out.println("┌─────┐\t┌─────┐");
		System.out.printf("│%3s  │\t│%3s  │\n",dealerCard.get(0),dealerCard.get(1)); //테스트용 보여주기
		//System.out.printf("│%3s  │\t│%3s  │\n",dealerCard.get(0),"??"); //실전용 안보여주기
		System.out.println("└─────┘\t└─────┘");
		dealerscore = cardscore[0]; //카드번호에 맞는 점수 주기
		dealerscore += cardscore[1];
	//	System.out.println("딜러의 현재점수 : "+"???"); //실전용 안보여주기
		System.out.println("딜러의 현재점수 : "+dealerscore); //테스트용 점수보여주기
		
		Line.sLine(50);
		
		System.out.println("▶ 당신의 카드 ◀");
		System.out.println("┌─────┐\t┌─────┐");
		System.out.printf("│%3s  │\t│%3s  │\n",playerCard.get(0),playerCard.get(1));
		System.out.println("└─────┘\t└─────┘");
		playerscore = cardscore[2]; //카드번호에 맞는 점수 주기
		playerscore += cardscore[3];
		System.out.println("당신의 현재점수 : "+playerscore);
		
		
		// 딜러카드는 어차피 안보여주니까 미리 정산해두고 목록만 마지막에 승패 나눌때 보여주면 될듯?
		
		
		//-----------------------------------------------------------------------------------
		// 딜러카드 최대 장수 11장
		// 점수 17점 미만 인경우 카드 추가로 받기
		// 구현 성공! 딜러가 새로받는 카드의 시작번호는4, 점수번호도4
		for(int d = 4; d < 13 ; d++) {  //11은 딜러가 가질 수 있는 최대 장수이고 딜러의 새카드는 처음 두장을뺀
											// 4번부터 새로 9장. 따라서 13미만까지. d는 4~12 까지만.
			if(dealerscore < 17) {
				dealerCard.add(carddeck[d]); 
				dealerscore += cardscore[d]; 
				}
			}// end for
		//------------------------------------------------
		//**********************test용 딜러의 카드와 점수 출력 확인*****************************
		
		// System.out.println(dealerCard);
		// System.out.println(dealerscore);
		//-------------------------------------------
		
		
		// 마지막에 카드를 보여줄려면??
		int dealerDeck = dealerCard.size(); // 딜러가 가진 카드를 전부 보여주도록 한다
		for (int i = 0; i<dealerDeck ; i++) { //0번요소 부터~~
			
		}
		
		// 이부분은 승패 직전에 둬서 hit 했을때 출력에 문제가 없도록해야함 //딜러의 카드와 점수를 따로 계산해둠
		
		//-------------------------------------------------------------------------------
		//--------------------------------------------
		
		//****게임진행하는부분!!!!!****
		
		Line.sLine(50);
		
		int playerHitCard =2;// 히트 회수당 playerCard.get(0) get 요소추가
		int playerCardNum = 13; // 12까지 딜러꺼고 플레이어거 13부터시작
		
		while(true) {
			System.out.println("HIT or STOP ???");
			String str = scan.nextLine(); 
			
			
//			try {//hit, stop만 입력가능하게 만들기
//				if(str.equals("HIT") || str.equals("STOP"));
//						
//				} catch (Exception e) {
//				System.out.println("HIT 나 STOP 만 입력가능합니다");
//			}
			System.out.println("▶ 당신의 카드 ◀");
			
			if(str.equals("HIT")) { 						
				
				//if(playerscore>21){ break; } // hit 하다가 21점 넘겨버리면 즉시 점수판정으로 넘어가서 패배처리.
			
				playerCard.add(carddeck[playerCardNum]); // 플레이어 카드목록 에 13번째 카드부터 1장추가
				playerscore += cardscore[playerCardNum]; // 점수도추가
				
				
				//cardviewer1();
				cardviewer2(playerCard.get(playerHitCard)); //새로받는 카드는 플레이어 리스트의 요소 2부터 (이미있는 카드 0,1)
				//cardviewer3();
				System.out.println("당신의 현재 점수 : "+playerscore);
				
				playerCardNum++;  // hit 할 시마다 한 장씩추가 13++
				playerHitCard++; //hit 으로 새로받은, 플레이어의 카드 번호
				
				
				//test
				System.out.println(playerCardNum);
				System.out.println(playerHitCard);
				
			
				
				continue; // hit 하고 다시 hit 할건지 물어보기 
				
				
				
			} else if (str.equals("STOP")) {
				break; //while 밖으로.
			}
		}// end while 점수계산
		
		//---------------------------------------
		
		
		
		
		
		
		
		
		// 카드를 아래로 출력이 아니라 옆에 계속두려면????
		// 카드보여주는걸 method 로 새로만들어서 ... 3등분?
		// 그리고 그걸 하나씩 반복문에 넣어버리면?
		
		
		
		
		
		//하지만 카드 숫자의 합이 21을 초과하게 되는 순간 '버스트'라고 하며 
		//딜러의 결과에 관계없이 플레이어가 패배한다. -나무위키
		
		//그럼 딜러는 계속 숨기고 있다가 플레이어의 stand(stop)시점에 ..
		
		//승리판별 "STOP을 입력했을시"-----------------------------------------------
		// 가까운쪽이승리// 21-점수해서 숫자가 낮은쪽의 승리 
		endScoreD = 21 - dealerscore;
		endScoreP = 21 - playerscore;  //최종점이 낮으면 승리 //21넘으면 어차피 패배니
		
		if(playerscore>21) {
			System.out.println("BUST! 21점이 넘었습니다");
			System.out.println("당신의 패배입니다..");
		}
		//------------------------
		if(dealerscore == playerscore ) {
			System.out.println("비겼습니다!");
		}
		else if(endScoreD > endScoreP) { //숫자가 크면 진거
			System.out.println("☆★당신이 블랙잭에서 승리했습니다!!★☆");
		}else if (endScoreD < endScoreP) {
			System.out.println("당신의 패배입니다..");
		}
		//--------------------------------------------------------
		
		
		
		//앞으로 해야할 것
		// 21 넘으면 자동패배
				
		
				//플레이어에게 카드를 또 받을Hit 할 것인지 그만둘 STOP것인지
		//선택할 수 있게 만든다
		//stop시에 점수공개 및 승패판정
		//21점에 가까운 쪽의 승리
		
		//처음받은 두 점수의 합이 둘다 21로 동점 블랙잭이면 무승부 처리
		// 21점 넘으면 무조건 패배
		//한게임이 끝나면 카드 리스트는 초기화 (골든키 때처럼 처음으로가게 하면될듯?)
		
		
		
		
		

	}// end main
	
	public static void cardviewer1() {
		System.out.print("┌─────┐");
	}
	public static void cardviewer2(String card) {
		System.out.printf("│%3s  │\n",card);//,매개변수
	}
	public static void cardviewer3() {
		System.out.println("└─────┘");
	}
	
	// 추가로 보여줄 카드출력용
	public static void cardviewer() { //(매개변수=카드번호)
		System.out.println("┌─────┐");
		System.out.printf("│%3s  │");//,매개변수
		System.out.println("└─────┘");
	}
	

}
