package abstractFactory;

public class AbstractFactorySample {

	public static void main(String[] args) {
		SetMenu setMenu = new SetMenu();
		SetFactory factory = createFactory(args[0]);
		setMenu.setFood(factory.getFood());
		setMenu.setBeverage(factory.getBeverage());
		System.out.println(setMenu.getFood().getClass());
		System.out.println(setMenu.getBeverage().getClass());
	}

	private static SetFactory createFactory(String str) {
		if ("Japanese".equals(str)) {
			return new JapaneseSetFactory();
		} else if ("American".equals(str)) {
			return new AmericanSetFactory();
		} else {
			return new JapaneseSetFactory();
		}
	}
}
