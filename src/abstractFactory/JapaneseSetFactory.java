package abstractFactory;

public class JapaneseSetFactory extends SetFactory {

	@Override
	public Food getFood() {
		return new RiceBowl();
	}

	@Override
	public Beverage getBeverage() {
		return new Tea();
	}
	
}