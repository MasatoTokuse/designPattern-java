package decorator;

public class WholesalePrice extends MarginPrice {
	private int advantage;
	WholesalePrice(Price price, int advantage){
		super(price);
		this.advantage = advantage;
	}
	@Override
	public int getValue() {
		return this.originalPrice.getValue() + advantage;
	}

}
