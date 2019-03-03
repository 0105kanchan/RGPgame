
public class Person {

	public String name;
	public int hp;
	public int mp;

	Person(String name, int hp, int mp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;

	}


	public void introduce(String name, int hp, int mp) {
		System.out.println("自己紹介をはじめます！");
		System.out.println("俺の名前は"+name);
		System.out.println("残りのHPは"+hp+"やねん");
		System.out.println("あと、俺の魔力、"+mp+"らしいわ");
		System.out.println("ヨロシク");
		System.out.println();
	}
}
