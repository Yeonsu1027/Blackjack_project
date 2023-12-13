package bbbbbllackjack;

import java.util.Scanner;

public class testtest {
	public static void main(String[] args) {
		testver3 t3 = new testver3();

//		for (int iii = 0; iii < 3; iii++) {
//			t3.cardviewer1();
//		}
//		
//		System.out.println();
//		
//		for (int iii = 0; iii < 3; iii++) {
//			t3.cardviewer2("★7");
//		}
//		System.out.println();
//		for (int iii = 0; iii < 3; iii++) {
//			t3.cardviewer3();
//		}
		
		/// 이건 원하는대로 되고있음
		
//		for (int iii = 0; iii < 3; iii++) {
//		System.out.printf("출력테스트중 %d",777);
//		}
//		System.out.println();
//		for (int iii = 0; iii < 3; iii++) {
//			System.out.printf("출력테스트중 %d",888);
//			}
//		System.out.println();
//		for (int iii = 0; iii < 3; iii++) {
//			System.out.printf("출력테스트중 %d",999);
//			}
		
		
//		for (int iii = 0; iii < 3; iii++) {
//			System.out.print("┌─────┐");
//		}
//		System.out.println();
//
//		for (int iii = 0; iii < 3; iii++) {
//			System.out.printf("│%3s  │","★");
//		}
//		System.out.println();
//
//		for (int iii = 0; iii < 3; iii++) {
//			System.out.print("└─────┘");
//		}
		
		// test ver3
		String[] card = {"★1","★2","●3"};
		
		for (int iii = 0; iii < 3; iii++) {
			t3.cardviewer1();
		} System.out.println();
		for (int iii = 0; iii < 3; iii++) {
			t3.cardviewer2(card[iii]);
		} System.out.println();
		for (int iii = 0; iii < 3; iii++) {
			t3.cardviewer3();
		} 
		
		//----------------------------
		// 승패판정 점검용
		Scanner scan = new Scanner(System.in);
		int score1 = 30;
		
		while(true) {
			System.out.println("HIT or STOP ???");
			String str = scan.nextLine(); 
			if(str.equals("HIT")) {
				if(score1>21) { break;//result = false; // hit 하다가 21점 넘겨버리면 즉시 점수판정으로 넘어가서 패배처리.
				}else if(score1 == 21) break;
			}// end if
		
		 else if (str.equals("STOP")) {
			break; //while 밖으로.
		}

	}//end while
		// 승패판정위치
		System.out.println("승패판정 확인용");
		
	}
}
