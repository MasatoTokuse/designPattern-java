package observer;

import java.util.ArrayList;
import java.util.Iterator;

// 通知する側でObserversを管理、通知する。
public abstract class NumberGenerator {
    private ArrayList observers = new ArrayList();
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer)iterator.next();
            observer.update(this);
        }
    }

    public abstract int getNumber();
    public abstract void execute();
}
