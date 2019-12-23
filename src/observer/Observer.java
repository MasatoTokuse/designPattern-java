package observer;

// Observersに通知するためのインターフェースが必要
public interface Observer {
    public abstract void update(NumberGenerator generator);
}