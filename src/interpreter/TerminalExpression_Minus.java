package interpreter;

import java.util.Stack;

// Flyweightが適用できそう
class TerminalExpression_Minus implements Expression {
    public void interpret(Stack<Integer> s)  { s.push( - s.pop() + s.pop() ); }
}