package bridge;

// Bridgeパターン：冗長的なクラス構成にならないような設計
// 機能拡張(メソッド追加)のためのクラス
public class Sorter {
	private SortImple sortImple;
	public Sorter(SortImple sortImple) {
		this.sortImple = sortImple;
	}
	// sortの種類が増えても、インスタンスを変えるだけで対応できる。
	public void sort(Object obj[]) {
		sortImple.sort(obj);
	}
}
