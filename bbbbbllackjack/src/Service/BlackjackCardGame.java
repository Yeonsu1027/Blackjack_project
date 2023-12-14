package Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import utils.Line;

public class BlackjackCardGame {
	//카드 숫자의 합이 21을 초과하게 되는 순간 '버스트'라고 하며 
			//딜러의 결과에 관계없이 플레이어가 패배한다. -나무위키
	

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		String str = null;
				
		int endScoreD =0;
		int endScoreP =0;
		
		int i_temp = 0;
		// ------------------------------------------------
		
		String[] carddeck = { "♣A", "♣2", "♣3", "♣4", "♣5", "♣6", "♣7", "♣8", "♣9", "♣10", "♣J", "♣Q", "♣K", "♥A", "♥2",
				"♥3", "♥4", "♥5", "♥6", "♥7", "♥8", "♥9", "♥10", "♥J", "♥Q", "♥K", "♠A", "♠2", "♠3", "♠4", "♠5", "♠6",
				"♠7", "♠8", "♠9", "♠10", "♠J", "♠Q", "♠K", "◆A", "◆2", "◆3", "◆4", "◆5", "◆6", "◆7", "◆8", "◆9", "◆10",
				"◆J", "◆Q", "◆K" };
		
		int[] cardscore = { 1,2,3,4,5,6,7,8,9,10,10,10,10,
							1,2,3,4,5,6,7,8,9,10,10,10,10,
							1,2,3,4,5,6,7,8,9,10,10,10,10,
							1,2,3,4,5,6,7,8,9,10,10,10,10 };
		
		int dealerscore = 0; 
		int playerscore = 0; 

		// ---------------------------------------------

		
		Random random = new Random();
		for (int i = carddeck.length - 1; i > 0; i--) {
		    int j = random.nextInt(i + 1);
		    String temp = carddeck[i];
		    carddeck[i] = carddeck[j];
		    carddeck[j] = temp;   
		    
		    int temp2 = cardscore[i];
		    cardscore[i] = cardscore[j];
		    cardscore[j] = temp2;  
		}
		
		
		
		
		
		inform();
		
		while(true) {
			str = scan.nextLine();
			
			if(str.equals("RESTART")) {
				
				random = new Random();
				for (int i = carddeck.length - 1; i > 0; i--) {
				    int j = random.nextInt(i + 1);
				    String temp = carddeck[i];
				    carddeck[i] = carddeck[j];
				    carddeck[j] = temp;   
				    
				    int temp2 = cardscore[i];
				    cardscore[i] = cardscore[j];
				    cardscore[j] = temp2;  
				}
				
				
			} else if(str.equals("QUIT")) {
				break;
			}else if(str.equals("START"));
			
			
			
			
			List<String> dealerCard = new ArrayList<>();
			List<String> playerCard = new ArrayList<>();
		
		
		dealerCard.add(carddeck[0]);
		dealerCard.add(carddeck[1]);
		playerCard.add(carddeck[2]);
		playerCard.add(carddeck[3]);  
		
		
		
		inform();
		
		
		//-----------------------------------------------------------
		System.out.println("▶ 딜러의 카드 ◀");
		System.out.println("┌─────┐┌─────┐");
		//System.out.printf("│%3s  ││%3s  │\n",dealerCard.get(0),dealerCard.get(1)); //테스트용 보여주기
		System.out.printf("│%3s  ││%3s  │\n",dealerCard.get(0),"??"); //실전용 안보여주기
		System.out.println("└─────┘└─────┘");
		dealerscore = cardscore[0]; //카드번호에 맞는 점수 주기
		dealerscore += cardscore[1];
		System.out.println("딜러의 현재점수 : "+"???"); //실전용 안보여주기
		//System.out.println("딜러의 현재점수 : "+dealerscore); //테스트용 점수보여주기
		
		Line.sLine(50);
		
		System.out.println("▶ 당신의 카드 ◀");
		System.out.println("┌─────┐┌─────┐");
		System.out.printf("│%3s  ││%3s  │\n",playerCard.get(0),playerCard.get(1));
		System.out.println("└─────┘└─────┘");
		playerscore = cardscore[2]; 
		playerscore += cardscore[3];
		System.out.println("당신의 현재점수 : "+playerscore);
					
		
		//-----------------------------------------------------------------------------------
		
		//게임진행 시작
		
		Line.sLine(50);
		
		int playerHitCard = 2;
		int playerCardNum = 13; 
		
		
		while(true) {
			System.out.println("HIT or STOP ???");
			 str = scan.nextLine(); 
			

			
			//-----------------------------------------------
			if(str.equals("HIT")) { 	
				
				playerCard.add(carddeck[playerCardNum]); 
				playerscore += cardscore[playerCardNum]; 
				
				if(playerscore>21) { break;
				}else if(playerscore == 21) break;
				
							
				playerCardNum++;  
				playerHitCard++; //hit 으로 새로받은 플레이어의 카드 번호
				
				
				// ☆★☆★ HIT 하면 출력될 곳 ★☆★☆
				inform();
				System.out.println("▶ 딜러의 카드 ◀");
				System.out.println("┌─────┐┌─────┐");
				//System.out.printf("│%3s  ││%3s  │\n",dealerCard.get(0),dealerCard.get(1)); //테스트용 보여주기
				System.out.printf("│%3s  ││%3s  │\n",dealerCard.get(0),"??"); //실전용 안보여주기
				System.out.println("└─────┘└─────┘");
				dealerscore = cardscore[0]; 
				dealerscore += cardscore[1];
				System.out.println("딜러의 현재점수 : "+"???"); //실전용 안보여주기
				//System.out.println("딜러의 현재점수 : "+dealerscore); //테스트용 점수보여주기
				
				Line.sLine(50);
				System.out.println("▶ 당신의 카드 ◀");
				//----------------처음2장의 카드와 HIT한 카드를 추가로보여주는곳--
				int psize = playerCard.size();  
				
				for ( i_temp = 0; i_temp < psize; i_temp++) {    
					cardviewer1();
				} System.out.println();
				for ( i_temp = 0; i_temp < psize; i_temp++) {
					cardviewer2(playerCard.get(i_temp)); 
				} System.out.println();
				for ( i_temp = 0; i_temp < psize; i_temp++) {
					cardviewer3();
				} 
				System.out.println(); //줄바꿈				
				System.out.println("당신의 현재점수 : "+playerscore);
								
				
				//----------------------------------------------------
							
				
				continue; 
				
			
				
			} else if (str.equals("STOP")) {
				break; //while 밖으로.
			}
		}// end while 
		
		//---------------------------------------
		//딜러의 카드와 점수가 계산된 곳
		for(int d = 4; d < 13 ; d++) {  
			
			if(dealerscore < 17) {
				dealerCard.add(carddeck[d]); 
				dealerscore += cardscore[d]; 
			}
		}// end for
		
		//-------------------------------------------------------
		inform();
				System.out.println("▶ 딜러의 카드 ◀");
				int dsize = dealerCard.size(); 
				for ( i_temp = 0; i_temp<dsize ; i_temp++) { 
					cardviewer1();
				} System.out.println(); 
				for ( i_temp = 0; i_temp<dsize ; i_temp++) { 
					cardviewer2(dealerCard.get(i_temp));
				} System.out.println(); 
				for ( i_temp = 0; i_temp<dsize ; i_temp++) { 
					cardviewer3();
				} System.out.println(); 
				System.out.println("딜러의 점수 : "+dealerscore);
				Line.sLine(50);
		
		
		//--------------------------------------------
				int psize = playerCard.size();  
				System.out.println("▶ 당신의 카드 ◀");
				for ( i_temp = 0; i_temp < psize; i_temp++) {     
					cardviewer1();
			
				} System.out.println();
				for ( i_temp = 0; i_temp < psize; i_temp++) {
					cardviewer2(playerCard.get(i_temp)); 
				
				} System.out.println();
				for ( i_temp = 0; i_temp < psize; i_temp++) {
					cardviewer3();
				
				} 
				System.out.println(); 			
				System.out.println("당신의 점수 : "+playerscore);
				Line.sLine(50);
				
	
		
		//승리판별 "STOP을 입력했을시"-----------------------------------------------
		 
		endScoreD = 21 - dealerscore;
		endScoreP = 21 - playerscore; 
		
		if(playerscore>21) {
			System.out.println("BUST! 21점이 넘었습니다");
			System.out.println("당신의 패배입니다..");
		}else if(dealerscore>21) { 
			System.out.println("딜러 BUST!");
			System.out.println("당신의 승리입니다!");
		}
		//------------------------
		else if(dealerscore == playerscore ) {
			System.out.println("비겼습니다!");
		} else if (playerscore == 21) {   
			System.out.println("★ BlackJack! ★");
			System.out.println("당신의 승리입니다!");
		}
		else if(endScoreD > endScoreP) { 
			System.out.println("당신의 승리입니다!");
		}else if (endScoreD < endScoreP) {
			System.out.println("당신의 패배입니다..");
		}
		Line.sLine(50);
		
		
		
		
		}//endwhile2
		System.out.println("게임이 종료되었습니다.");
		//--------------------------------------------------------
		
		
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
		System.out.println("게임시작 : START");
		System.out.println("게임종료 : QUIT");
		Line.dLine(50);
	}
	
	
	
	
	// 추가로 보여줄 카드출력용
	public static void cardviewer1() {
		System.out.print("┌─────┐");
	}
	public static void cardviewer2(String pcard) {
		System.out.printf("│%3s  │",pcard);
	}
	public static void cardviewer3() {
		System.out.print("└─────┘");
	}
	
	

}
