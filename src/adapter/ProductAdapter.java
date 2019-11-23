package adapter;

public class ProductAdapter implements ProductPrice{
	private Product product = new Product();
	//getCostからgetPriceにインターフェースを変えたい
	@Override
	public int getPrice() {
		return product.getCost();
		// 継承でもインターフェースを変更可能
		// return this.getCost();
	}
}