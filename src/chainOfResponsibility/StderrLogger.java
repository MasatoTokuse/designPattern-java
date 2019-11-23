package chainOfResponsibility;

public class StderrLogger extends Logger {
    public StderrLogger(int mask) { super(mask); }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("Sending to stderr: " + msg);
    }
}