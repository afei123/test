package DesignPatterns.InterpreterPattern.Interpreter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by AFei on 2017/11/24.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AndInterpreter implements Interpreter {
    private Interpreter int1;
    private Interpreter int2;
    @Override
    public boolean interpreter(String checkString) {
        return int1.interpreter(checkString) && int2.interpreter(checkString);
    }
}
