package observer;

import java.util.Random;

// 状態を更新する処理と更新された際にObserverに通知する処理を実装
public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random();
    private int number;

    public int getNumber() {
        return number;
    }

    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}