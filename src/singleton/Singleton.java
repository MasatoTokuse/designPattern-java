package singleton;
// アプリ全体で統一されなければならない仕組み(多言語化など)の実装に使用される。
 final class Singleton {
	private Singleton() {}
	 // インスタンス生成のタイミングをgetInstance()呼び出し時にする。
	private static class SingletonHolder {
		 // synchronizedでgetInstanceでnewするよりこちらの方が同期コストが低い。
		private static final Singleton instance = new Singleton();
	}
	public static Singleton getInstance() {
		return SingletonHolder.instance;
	}
}