package decorator;

public class DoublePrice extends MarginPrice {
	DoublePrice(Price price) {
		super(price);
	}

	public int getValue() {
		return this.originalPrice.getValue() * 2;
	}
}
