package BlackJackService;

import utils.Line;

public class GameService {
	CardService cardservice = null;
	
	public GameService() {
		cardservice =  new CardService();
	}//end 생성자
	
	public static void ViwerService() {
	
	}

	
	
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

}//end class
