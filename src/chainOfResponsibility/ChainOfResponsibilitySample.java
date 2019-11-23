package chainOfResponsibility;

// 各ロギングハンドラーはログレベルで何らかのアクションを起こすべきかどうかを判断し、次のロギングハンドラーにメッセージを渡す。
public class ChainOfResponsibilitySample {
    public static void main(String[] args) {
        // Build the chain of responsibility
        final Logger l =
            new StdoutLogger(Logger.DEBUG).setNext(
            new EmailLogger(Logger.NOTICE).setNext(
            new StderrLogger(Logger.ERROR)));

        // Handled by StdoutLogger
        l.message("Entering function y.", Logger.DEBUG);

        // Handled by StdoutLogger and EmailLogger
        l.message("Step1 completed.", Logger.NOTICE);

        // Handled by all three loggers
        l.message("An error has occurred.", Logger.ERROR);
    }
}
