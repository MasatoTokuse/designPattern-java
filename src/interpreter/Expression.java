package interpreter;

import java.util.Stack;

interface Expression {
    void interpret(Stack<Integer> s);
}
