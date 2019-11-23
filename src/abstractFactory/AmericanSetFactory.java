package abstractFactory;

public class AmericanSetFactory extends SetFactory {

	@Override
	public Food getFood() {
		return new Hamburger();
	}

	@Override
	public Beverage getBeverage() {
		return new Juice();
	}

}
