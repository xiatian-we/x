package װ��ģʽ;

public class Client {
	public static void main(String[] args) {
		String name = "С��";
		Person person = new Person(name) {
			public void show() {
				System.out.print("װ���" + name);
			}
		};
		
		System.out.print("��һ��װ�磺");
		Sneakers sneakers = new Sneakers(); //����Ь
		BigTrouser bigTrouser = new BigTrouser(); //���
		TShirts tShirts = new TShirts(); //T��
		
		sneakers.Decorate(person);
		bigTrouser.Decorate(sneakers);
		tShirts.Decorate(bigTrouser);
		tShirts.show();
	//----------------------------------------------------------
		System.out.print("\n�ڶ���װ�磺");
		LeatherShoes leatherShoes = new LeatherShoes(); //ƤЬ
		Tie tie = new Tie(); //���
		Suit suit = new Suit(); //��װ
		
		leatherShoes.Decorate(person);
		tie.Decorate(leatherShoes);
		suit.Decorate(tie);
		suit.show();
	}
}
