package by.epam.simplecalculator;

/**
 * Created by Yahor_Faliazhynski on 11/3/2015.
 */

import java.lang.String;

public class simpleCalculator {

    public static void main(String[] args) {

        float result;
        String oper = new String();

        keywordReader argumKey = new keywordReader();
        argumKey.keyScanner();

        operationExecute opEx = new operationExecute();
        opEx.operationResult(argumKey.firstNumber, argumKey.secondNumer, argumKey.operation);

        if (opEx.flag == false) {
            result = opEx.res;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Result: No result");
        }

    }

}

