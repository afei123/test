package DesignPatterns.InterpreterPattern;

import jdk.internal.org.objectweb.asm.Type;
import jdk.internal.org.objectweb.asm.tree.AbstractInsnNode;
import jdk.internal.org.objectweb.asm.tree.analysis.AnalyzerException;
import jdk.internal.org.objectweb.asm.tree.analysis.Interpreter;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.List;

/**
 * Created by AFei on 2017/11/24.
 */
public class jdkInterpreter extends Interpreter {
    protected jdkInterpreter(int i) {
        super(i);
    }

    @Override
    public Value newValue(Type type) {
        return null;
    }

    @Override
    public Value newOperation(AbstractInsnNode abstractInsnNode) throws AnalyzerException {
        return null;
    }

    @Override
    public Value copyOperation(AbstractInsnNode abstractInsnNode, Value value) throws AnalyzerException {
        return null;
    }

    @Override
    public Value unaryOperation(AbstractInsnNode abstractInsnNode, Value value) throws AnalyzerException {
        return null;
    }

    @Override
    public Value binaryOperation(AbstractInsnNode abstractInsnNode, Value value, Value v1) throws AnalyzerException {
        return null;
    }

    @Override
    public Value ternaryOperation(AbstractInsnNode abstractInsnNode, Value value, Value v1, Value v2) throws AnalyzerException {
        return null;
    }

    @Override
    public Value naryOperation(AbstractInsnNode abstractInsnNode, List list) throws AnalyzerException {
        return null;
    }

    @Override
    public void returnOperation(AbstractInsnNode abstractInsnNode, Value value, Value v1) throws AnalyzerException {

    }

    @Override
    public Value merge(Value value, Value v1) {
        return null;
    }
}
