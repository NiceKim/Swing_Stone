import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
 * ������Ʈ �̸�: SwingStone 
 * �ۼ��� : ������
 * ������ ������Ʈ ��¥ : 2017�� 10�� 23��
 * ������ ������Ʈ ���� : �ϼ��� toString
 */

public class GameTest {

	public static void main(String args[]){
		System.out.println("������ �����մϴ�.\n");
		int turn=0, choice=0; 
		Scanner scan = new Scanner(System.in);
		
		//������ ����
		Hero player = new Hero();
		Hero enemy = new Hero();
		//�� ����
		ArrayList<Cards> myDeck = DataBases.sampleDeck1();
		ArrayList<Cards> compDeck = DataBases.sampleDeck1();
		//�� �� ����
		ArrayList<Cards> myHand = new ArrayList<>();
		ArrayList<Cards> compHand = new ArrayList<>();
		//�ϼ����� �� �� �ִ� �ʵ� ����
		Minions[] myField = new Minions[7];
		Minions[] compField = new Minions[7];

		Minions a = new Minions(6,"�����",6,7);
		Minions b = new Minions(4,"����",4,5);
		Minions c = new Minions(2,"�Ǿ�",2,3);
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		System.out.println();
		System.out.print("����Ű� ������ ����, ");
		a.attack(b);
		System.out.print("����� ü��" + a.health + ", ");
		System.out.println("���� ü��" + b.health);
		
		if(a.health<=0)
			System.out.println("����� ���!");
		else if(b.health<=0)
			System.out.println("���� ���!");
		
		
		System.out.print("�Ǿ ����Ÿ� ����" + ", ");
		c.attack(a);
		System.out.print("�Ǿ� ü��" + c.health + ", ");
		System.out.println("����� ü��" + a.health);
		
		
		if(a.health<=0)
			System.out.println("����� ���!");
		else if(c.health<=0)
			System.out.println("�Ǿ� ���!");
		
		/*System.out.println("ī�带 3�� �̽��ϴ�.");
		draw(3,player,myDeck,myHand);
		//draw(4,compDeck,compHand);
		System.out.println("�� ���� ���� ī��: " + myDeck.size());
		System.out.println("�� �տ� �ִ� ī�� ��:" + myHand.size() +"��");
		System.out.println();

		while(true){

			System.out.println("����� ��!\n");
			System.out.println("ī�带 ���� �̽��ϴ�.");
			draw(1,player,myDeck,myHand);
			System.out.println("�� ���� ���� ī�� ��: " + myDeck.size() +"��");
			System.out.println("�� �տ� �ִ� ī�� ��:" + myHand.size() +"��");
			System.out.println();
			if(player.health<0){
				System.out.println("!!���� ����!!");
				break;
			}
			
			while(turn==0){
				System.out.println("1:�� �� ���� 2:�� ����");
				choice=scan.nextInt();
				switch(choice){
				case 1:
					for(int i=0; i<myHand.size(); i++)
						System.out.println("�ڵ� �ε���[" + i +"]\n" + myHand.get(i).toString() + "\n");
					break;
				case 2:
					System.out.println("�� ����\n");
					turn ++;
					break;
				default:
					System.out.println("���ڸ� �ٽ� �Է� ���ּ���.");
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

	//ī�� �̱� �޼ҵ�
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
				System.out.println("���� ī�尡 �����ϴ�, Ż��: -" + hero.fatigue);
				System.out.println("�÷��̾� ���� ä��: " + hero.health);
			} */
	}
	
}
