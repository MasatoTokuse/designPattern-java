package decorator;

// 柔軟な機能拡張のためのパターン
public class DecoratorSample {
	public static void main(String[] args) {
		Price primePrice = new PrimePrice(120);
		// 2倍の機能を追加
		Price doublePrice1 = new DoublePrice(primePrice);
		// 80を加算する機能を追加
		Price wholesalePrice1 = new WholesalePrice(doublePrice1, 80);
		// 2倍の機能を追加
		Price doublePrice2 = new DoublePrice(wholesalePrice1);
		// 200を加算する機能を追加
		Price wholesalePrice2 = new WholesalePrice(doublePrice2, 200);
		System.out.println(wholesalePrice2.getValue());
	}
}
