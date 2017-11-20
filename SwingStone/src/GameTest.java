import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
 * 프로젝트 이름: SwingStone 
 * 작성자 : 김조운
 * 마지막 업데이트 날짜 : 2017년 10월 23일
 * 마지막 업데이트 내용 : 하수인 toString
 */

public class GameTest {

	public static void main(String args[]){
		System.out.println("게임을 시작합니다.\n");
		int turn=0, choice=0; 
		Scanner scan = new Scanner(System.in);
		
		//영웅들 생성
		Hero player = new Hero();
		Hero enemy = new Hero();
		//덱 생성
		ArrayList<Cards> myDeck = DataBases.sampleDeck1();
		ArrayList<Cards> compDeck = DataBases.sampleDeck1();
		//손 패 생성
		ArrayList<Cards> myHand = new ArrayList<>();
		ArrayList<Cards> compHand = new ArrayList<>();
		//하수인을 낼 수 있는 필드 생성
		Minions[] myField = new Minions[7];
		Minions[] compField = new Minions[7];

		Minions a = new Minions(6,"오우거",6,7);
		Minions b = new Minions(4,"설인",4,5);
		Minions c = new Minions(2,"악어",2,3);
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		System.out.println();
		System.out.print("오우거가 설인을 공격, ");
		a.attack(b);
		System.out.print("오우거 체력" + a.health + ", ");
		System.out.println("설인 체력" + b.health);
		
		if(a.health<=0)
			System.out.println("오우거 사망!");
		else if(b.health<=0)
			System.out.println("설인 사망!");
		
		
		System.out.print("악어가 오우거를 공격" + ", ");
		c.attack(a);
		System.out.print("악어 체력" + c.health + ", ");
		System.out.println("오우거 체력" + a.health);
		
		
		if(a.health<=0)
			System.out.println("오우거 사망!");
		else if(c.health<=0)
			System.out.println("악어 사망!");
		
		/*System.out.println("카드를 3장 뽑습니다.");
		draw(3,player,myDeck,myHand);
		//draw(4,compDeck,compHand);
		System.out.println("내 덱에 남은 카드: " + myDeck.size());
		System.out.println("내 손에 있는 카드 수:" + myHand.size() +"장");
		System.out.println();

		while(true){

			System.out.println("당신의 턴!\n");
			System.out.println("카드를 한장 뽑습니다.");
			draw(1,player,myDeck,myHand);
			System.out.println("내 덱에 남은 카드 수: " + myDeck.size() +"장");
			System.out.println("내 손에 있는 카드 수:" + myHand.size() +"장");
			System.out.println();
			if(player.health<0){
				System.out.println("!!게임 오버!!");
				break;
			}
			
			while(turn==0){
				System.out.println("1:내 패 보기 2:턴 종료");
				choice=scan.nextInt();
				switch(choice){
				case 1:
					for(int i=0; i<myHand.size(); i++)
						System.out.println("핸드 인덱스[" + i +"]\n" + myHand.get(i).toString() + "\n");
					break;
				case 2:
					System.out.println("턴 종료\n");
					turn ++;
					break;
				default:
					System.out.println("숫자를 다시 입력 해주세요.");
					break;
				}
			}
			
			player.fullMana++;
			player.currentMana=player.fullMana;
			if(!player.heroPowerOn)
				player.heroPowerOn=true;
			turn=0;
			
		}
		
	}

	//카드 뽑기 메소드
	public static void draw(int cards, Hero hero, ArrayList<Cards> deck, ArrayList<Cards> hand){
	
		for(int i = 0; i<cards; i++)
			if(deck.size()>0){	
			System.out.println(deck.get(0).toString());
			hand.add(deck.get(0));
			deck.remove(0);
			}
			else{
				hero.fatigue++;
				hero.health-=hero.fatigue;
				System.out.println("덱에 카드가 없습니다, 탈진: -" + hero.fatigue);
				System.out.println("플레이어 남은 채력: " + hero.health);
			} */
	}
	
}
