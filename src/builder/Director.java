package builder;

// 異なる材料だが同じ手順でオブジェクトを生成させる
public class Director {
	// Builderを可変にすることで、材料を可変にする
	private Builder builder;
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	// 作成過程を定義する
	public void constract() {
		builder.addSolvent(100);
		builder.addSolute(40);
		builder.abandonSolution(70);
		builder.addSolvent(100);
		builder.addSolute(15);
	}
	
	public void constractTwo() {
		builder.addSolvent(356);
		builder.addSolute(345);
		builder.abandonSolution(44);
		builder.addSolvent(345);
		builder.addSolute(2345);
	}
}
