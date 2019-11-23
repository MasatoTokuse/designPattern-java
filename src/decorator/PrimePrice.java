package decorator;

public class PrimePrice implements Price {
	private int value;
	
	PrimePrice(int value){
		this.value = value;
	}
	@Override
	public int getValue() {
		return this.value;
	}

}
