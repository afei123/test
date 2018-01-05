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
public class BaseInterpreter implements Interpreter {
    private String key = "";

    @Override
    public boolean interpreter(String checkString) {
        boolean flag = false;
        if(checkString.contains(key)){
            flag = true;
        }
        return flag;
    }
}
