
public class Person {

	public String name;
	public int hp;
	public int mp;

	Person(String name, int hp, int mp){
		this.name = name;
		this.hp = hp ;
		this.mp = mp ;
	}
	public void introduce() {
		System.out.println("自己紹介！");
		System.out.println("名前は"+this.name);
		System.out.println("体力は"+this.hp);
		System.out.println("魔力は"+this.mp);
		System.out.println();
	}

	public void attack(Person damager,Person attacker) {
		System.out.println(this.name + "の攻撃！"+ this.name +"魔力は"+ this.mp + "!");
		damager.damage(attacker);
	}

	public void damage(Person attacker) {
		System.out.println(this.name + "がダメージ"+ attacker.mp +"を受けた!");
		this.hp -= attacker.mp;
		if(this.hp > 0) {
			System.out.println(this.name+"の残りhpは"+ this.hp);
		}
		if(this.hp <= 0) {
			System.out.println("お〜っと、ここで"+ this.name + "がまさかのダウン~");
			System.out.println(attacker.name+" まじつえ〜まじ卍〜");
		}
	}
}
