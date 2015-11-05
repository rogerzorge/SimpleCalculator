package by.epam.simplecalculator;

import java.util.Scanner;

/**
 * Created by Yahor_Faliazhynski on 11/3/2015.
 */
public class keywordReader {

    int firstNumber;
    int secondNumer;
    boolean correctInput = true;
    String operation = new String();

    public void keyScanner(){

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the 1st number: ");
        firstNumber = scn.nextInt();

        System.out.println("Enter operation (+, -, * or /): ");
        operation = scn.next();

        System.out.println("Enter the 2nd number: ");
        secondNumer = scn.nextInt();

    }

}
