
public class Person {

	public String name;
	public int hp;
	public int mp;

	Person(String name, int hp, int mp){
		this.name = name;
		this.hp = hp ;
		this.mp = mp ;
	}

	public void attack(String attacker, int mp) {
		System.out.println(attacker + "の攻撃！魔力は"+ mp + "!");

	}
	public void damage(String damager, int mp) {
		System.out.println(damager + "がダメージ"+ mp +"を受けた!");
		this.hp -= mp;
//		ここでhpが減る人、ダウンをする人を定めたいができていない
		System.out.println("残りhpは"+ this.hp);
		if(this.hp <= 0) {
			System.out.println("ここで"+ this.name + "がまさかのダウン~");
		}
	}
	public void say(String attacker) {
		System.out.println("DJ社長からの一言："+attacker+"まじつえ〜まじ卍〜");
	}
}
