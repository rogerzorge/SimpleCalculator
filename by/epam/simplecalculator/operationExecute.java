package by.epam.simplecalculator;

/**
 * Created by Yahor_Faliazhynski on 11/3/2015.
 */
public class operationExecute {

    float res;
    boolean flag = false;

    public void operationResult(float a, float b, String op) {

        System.out.println("Chosen operation is: " + op);
        if (op.equals("+")) {
            res = a + b;
            System.out.println("Operation '+' was applied");
        } else if (op.equals("-")) {
            res = a - b;
            System.out.println("Operation '-' was applied");
        } else if (op.equals("*")) {
            res = a * b;
            System.out.println("Operation '*' was applied");
        } else if (op.equals("/")) {
            res = a / b;
            System.out.println("Operation '/' was applied");
        } else {
            flag = true;
            System.out.println("Wrong operation! Please, enter one of the following operation: +, -, *, /");
        }
    }

}
