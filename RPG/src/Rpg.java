
import java.util.Scanner;

public class Rpg {

	public static void main(String[] args) {
			Person ginta = new Person("銀太", 5, 3);
			Person foy = new Person("ふぉい", 5, 4);
			Person syatyo = new Person("DJ社長", 8, 3);

//			自己紹介
			Person [] fighter = {ginta, foy, syatyo };
			for(int i=0;i<3;i++) {
				Person member = fighter[i];
				member.introduce();
			}

//			戦闘
			while(ginta.hp > 0 && foy.hp >0 && syatyo.hp >0) {

			int i;
			int j;

			Scanner scanner = new Scanner(System.in);
			do {
			System.out.println("だれが攻撃する？");
			System.out.println("０→銀太、１→ふぉい、２→DJ社長");
			i = scanner.nextInt();


			System.out.println("だれに攻撃する？");
			System.out.println("０→銀太、１→ふぉい、２→DJ社長");
			j = scanner.nextInt();

			if(i == j || i<0 || i>2 || j<0 || j>2) {
				System.out.println("入力し直し！");
			}

			}while(i == j || i<0 || i>2 || j<0 || j>2);

			Person attacker = fighter[i];
			Person damager = fighter[j];
			attacker.attack();
			damager.damage(attacker);
			System.out.println();
			}
		}
}
