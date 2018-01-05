package DesignPatterns.InterpreterPattern.jpaInterpreterPattern;

/**
 * Created by AFei on 2017/11/24.
 */
public class jpaBaseInterpreter implements JpaInterpreter {
    private static final String And = "And";
    private static final String Where = "FindBy";
    private static final String OrderBy = "OrderBy";
    @Override
    public String interpreter(String methodName) {
        StringBuffer stringBuffer = new StringBuffer();
        String replace = methodName.replace(Where, " where ").replace(And, " and ");
        return replace;
    }
}
