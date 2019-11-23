package interpreter;

class InterpreterSample {
    public static void main(String[] args) {
        evaluate("42 4 2 - +");
        evaluate("100 50 - 30 - 10 - 1 +");
    }

    private static void evaluate(String expression) {
        Parser p = new Parser(expression);
        System.out.println("'" + expression + "' equals " + p.evaluate());
    }
}