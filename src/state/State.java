package state;

/**
 * 由実ちゃんの状態を表すクラスが実装すべきインタフェース
 */

interface State {
    /**
     * 状態名を返すメソッドを定義する
     */
    public String getName();

    /**
     * 朝のあいさつを返すメソッドを定義する
     */
    public String morningGreet();

    /**
     * 寒いときの対策を返すメソッドを定義する
     */
    public String getProtectionForCold();
}