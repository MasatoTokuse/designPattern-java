package flyweight;

public class Stamp {
	char type;

	Stamp(char type) {
		this.type = type;
	}

	void print() {
		System.out.print(this.type);
	}
}
