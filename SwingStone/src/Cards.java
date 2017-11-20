
public class Cards {

	public int cost;
	public String name;
	
	public Cards(){
	}
	
	public Cards(int cost, String name){
		this.cost=cost;
		this.name=name;
	}
	
	public int getCost(){
		return cost;
	}
	
	public String getName(){
		return name;
	}

	@Override
	public String toString() {
		return "Cards [cost=" + cost + ", name=" + name + "]";
	}
	
}

class Minions extends Cards {
	
	//�ϼ��� �⺻ ����
	public int attack;
	public int health;
	public boolean canAttack;
	
	//�ϼ��� ������
	public Minions(int cost, String name, int attack, int health){
		super.cost=cost;
		super.name=name;
		this.attack=attack;
		this.health=health;
		canAttack=false;
	}
	
	public void attack(Minions ad){
		this.health-=ad.attack;
		ad.health-=this.attack;
	}

	public void attack(Hero ad){
		ad.health-=this.attack;
	}

	@Override
	public String toString() {
		return "[<" + name + ">, " + cost + "�ڽ�Ʈ]\n"
				+ "attack=" + attack + ", health=" + health;
	}

}
