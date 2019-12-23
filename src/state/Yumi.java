package state;

public class Yumi {

    /** 由実ちゃんの状態を表すプロパティ */
    private State state = null;

    /**
     * 由美ちゃんのインスタンス生成
     */
    public Yumi(State state) {
        this.state = state;
    }

    /**
     * 由実ちゃんの状態を変更するメソッド
     * @param state
     */
    public void changeState(State state) {
        this.state = state;
    }

    /**
     * 状態を返すメソッド
     * @return
     */
    public String getStateName() {
        return this.state.getName();
    }

    /**
     * 朝のあいさつを返すメソッド
     * @return
     */
    public String morningGreet() {
        return this.state.morningGreet();
    }

    /**
     * 寒いときの対策を取得するメソッド
     * @return
     */
    public String getProtectionForCold() {
        return this.state.getProtectionForCold();
    }
}