package templateMethod;

public abstract class AbstractDisplay {
	public abstract void open();
	public abstract void print();
	public abstract void close();
	
	public final void display() {
		// 何かを3回処理することと前処理と後処理という処理の流れを共通化できる。
		open();
		for (int i = 0; i < 3; i++) {
			print();
		}
		close();
	}
	
}
