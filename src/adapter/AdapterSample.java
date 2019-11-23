package adapter;

public class AdapterSample {

	public static void main(String[] args) {
		// interfaceが同じであれば同じように処理することができる
		ProductPrice pi = new ProductAdapter();
		System.out.println(pi.getPrice());
		ProductPrice si = new SameInterface();
		System.out.println(si.getPrice());
	}

}
