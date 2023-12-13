package bbbbbllackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import utils.Line;

public class GameBlackjack {
	
	public static void main(String[] args) {
		// ----------------------------------------
		// HIT or STAND 입력받는용
		Scanner scan = new Scanner(System.in);
		
		// 점수계산용
		int endScoreD = 0;
		int endScoreP = 0;
		// ----------------------------------------
		
		// 카드덱
		String[] carddeck = { "♣A", "♣2", "♣3", "♣4", "♣5", "♣6", "♣7", "♣8", "♣9", "♣10", "♣J", "♣Q", "♣K", "♥A", "♥2",
				"♥3", "♥4", "♥5", "♥6", "♥7", "♥8", "♥9", "♥10", "♥J", "♥Q", "♥K", "♠A", "♠2", "♠3", "♠4", "♠5", "♠6",
				"♠7", "♠8", "♠9", "♠10", "♠J", "♠Q", "♠K", "◆A", "◆2", "◆3", "◆4", "◆5", "◆6", "◆7", "◆8", "◆9", "◆10",
				"◆J", "◆Q", "◆K" };
		// 점수
		int[] cardscore = { 1,2,3,4,5,6,7,8,9,10,10,10,10,
				1,2,3,4,5,6,7,8,9,10,10,10,10,
				1,2,3,4,5,6,7,8,9,10,10,10,10,
				1,2,3,4,5,6,7,8,9,10,10,10,10 };

		int dealerscore = 0; // 딜러카드의 점수
		int playerscore = 0; // 플레이어카드의 점수

		// ---------------------------------------------
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
		
		
		
		

	}//end main

}
