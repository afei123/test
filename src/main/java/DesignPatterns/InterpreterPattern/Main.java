package DesignPatterns.InterpreterPattern;

import DesignPatterns.InterpreterPattern.Interpreter.AndInterpreter;
import DesignPatterns.InterpreterPattern.Interpreter.BaseInterpreter;
import DesignPatterns.InterpreterPattern.Interpreter.OrInterpreter;

/**
 * Created by AFei on 2017/11/24.
 */
public class Main {
    private static final String key1 = "a";
    private static final String key2 = "b";
    private static final String key3 = "ab";
    public static void main(String[] args){
        BaseInterpreter base1 = new BaseInterpreter(key1);
        BaseInterpreter base2 = new BaseInterpreter(key2);
        OrInterpreter orInterpreter = new OrInterpreter(base1, base2);
        boolean a = orInterpreter.interpreter(key1);
        System.out.println(a);
        AndInterpreter andInterpreter = new AndInterpreter(base1, base2);
        boolean b = andInterpreter.interpreter(key3);
        System.out.println(b);

    }
}
