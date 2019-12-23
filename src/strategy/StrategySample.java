package strategy;

public class StrategySample {
    public static void main(String[] args) {
        Context context;

        // 異なるアルゴリズムに従う3つのコンテキスト。
        context = new Context(new ConcreteStrategyA());
        context.execute();

        context = new Context(new ConcreteStrategyB());
        context.execute();

        context = new Context(new ConcreteStrategyC());
        context.execute();
    }
}
