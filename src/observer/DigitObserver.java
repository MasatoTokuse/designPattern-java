package observer;

// NumberGenerator(Subject)の状態が更新された際の処理を実装
public class DigitObserver implements Observer {
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver:" + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
    }
}
