package chainOfResponsibility;

public class StdoutLogger extends Logger {
    public StdoutLogger(int mask) { super(mask); }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("Writting to stdout: " + msg);
    }
}