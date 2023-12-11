package bbbbbllackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import bbbbbllackjack.utils.Line;

public class bbbbbbbbbbbbbbbbbbbbbbbbb {

	Scanner scan = null;

	public static void main(String[] args) {

		
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

		String spentCard = null; // 이미 뽑힌카드 둘곳
		
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
		
		//--------------------------------------------
		
		Line.sLine(50);
		
		System.out.println("HIT or STOP ???");
		
		
		//앞으로 해야할 것
		//딜러는 """"점수""""합이 17""""미만""""" 인경우 카드를 더 받아야한다.
		//플레이어에게 카드를 또 받을Hit 할 것인지 그만둘 STOP것인지
		//선택할 수 있게 만든다
		//stop시에 점수공개 및 승패판정
		//21점에 가까운 쪽의 승리
		
		//처음받은 두 점수의 합이 둘다 21로 동점 블랙잭이면 무승부 처리
		// 21점 넘으면 무조건 패배
		//한게임이 끝나면 카드 리스트는 초기화 (골든키 때처럼 처음으로가게 하면될듯?)
		
		
		
		

	}// end main

}
