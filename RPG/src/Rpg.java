
public class Rpg {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person KANTARO = new Person("寛太郎",4900,29);
		Person DAIJIRO = new Person("大二郎",38,1000);
		Person KOTARO =  new Person("航太郎",38888,1);
		
		KANTARO.introduce();
		DAIJIRO.introduce();
		KOTARO.introduce();
		
		DAIJIRO.recover();
		DAIJIRO.introduce();
		
	}

}
