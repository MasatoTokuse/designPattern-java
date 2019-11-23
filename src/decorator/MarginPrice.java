package decorator;

public abstract class MarginPrice implements Price {
	protected Price originalPrice;

	MarginPrice(Price price) {
		this.originalPrice = price;
	}

}
