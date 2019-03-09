
import java.util.Scanner;

public class Rpg {

	public static void main(String[] args) {
			Person ginta = new Person("銀太", 2, 3);
			Person foy = new Person("ふぉい", 3, 3);
			Person syatyo = new Person("DJ社長", 88, 3);

			String [] fighter = {"銀太", "ふぉい" };
			Scanner scanner = new Scanner(System.in);
			System.out.println("レペゼン地球　銀太VSふぉい");
			System.out.println("攻撃者を選択してみ");
			System.out.print("銀太なら0、ふぉいなら1を。");
			int i = scanner.nextInt();

			ginta.attack(fighter[i],3);
			foy.damage(fighter[(i+1)%2],3);
			syatyo.say(fighter[i]);
		}
}
