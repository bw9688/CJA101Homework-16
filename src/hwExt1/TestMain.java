package hwExt1;

public class TestMain {

	public static void main(String[] args) {
		Poppy poppy = new Poppy("波比");
		poppy.setbehaviors(new AttackFire(), new Run());
		poppy.attack();
		poppy.run();

		System.out.println("============");

		Tahmkench tahmkench = new Tahmkench("貪啃奇");
		tahmkench.setbehaviors(new Run(), new DefendSheild());
		tahmkench.defend();
		tahmkench.run();
	}
}
