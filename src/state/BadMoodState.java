package state;

class BadMoodState implements State {

    public String getName() {
        return "機嫌が悪い";
    }

    /**
     * 朝のあいさつです。機嫌の悪いときは、ぶっきらぼうに応えます。
     */
    public String morningGreet() {
        return "おう";
    }

    /**
     * 冬の防寒方法です。機嫌の悪いときはももひきをはきます。
     */
    public String getProtectionForCold() {
        return "ももひき温かい";
    }
}