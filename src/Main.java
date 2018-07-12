import java.util.Scanner;

/**
 * Created by student on 03.07.2018.
 */

public class Main {

    public static void main(String[] args) {
//        Calculator calc = new Calculator();
//
//        int i = 1;
//        int j = 1;
//        int k = 2;
//        String puppy = "puppy";
//        String puppy1 = "puppy1";
//        String puppy2 = "puppy2";
//        int result = i;
//        i++;
//        int result1 = i + j * k;
//        j++;
//        int result2 = i + j * k;
//        k++;
//        int result3 = i + j * k;
//
//        System.out.println("====>>>> Result i " + i + " = " + result //0
//                + "\n====>>>> Result1 j " + i + " = " + result1 //
//                + "\n====>>>> Result2 j " + j + " = " + result2
//                + "\n====>>>> Result3 k " + k + " = " + result3
//                + "\n====>>>> New result i++ = " + i++
//                + "\n====>>>> New result ++i = " + ++i);
////        System.out.println("\n====>>>> New result ++i = " + ++i);
//
//        if (k > j || k > i) {
//            System.out.println("New result k > i = " + k + " > " + i + "\n or " + k + " > " + j);
//        } else if (k == i) {
//            System.out.println("New result k < i = " + k + " = " + i);
//        } else {
//            System.out.println("New result k < i = " + k + " < " + i);
//        }
//
//
//        int res;
//        res = calc.divideD(i, j)
//                + calc.multiplyM(i, j)
//                * calc.multiplyM(i, j);
//        {
//            System.out.println("divideD result = " + res);
//        }
//
//        IfElseOperations ifelse = new IfElseOperations();
//        ifelse.ifElseMethod("Vas", 5);
//
//        SwitchCaseOperations swcase = new SwitchCaseOperations();
//        swcase.ageResult(12, "ggg");
//
//
//        Cycles cl = new Cycles();
//        cl.whileCycles(0);
//        cl.forCycles(1);
//
//
//        Cycles cly = new Cycles(10, "Nme");
//
//        Arrays arr = new Arrays();
//        int filler = 6;
//        int[] array = {1, 2, 3, 4, 5};
//        System.out.println(arr.resultChar);
//        System.out.println(arr.arrSize);
//        System.out.println(arr.lastValue);
//        //arr.arrChar[arr.arrSize-1] = 'D';
//        //System.out.println(arr.arrChar);
//
//        for (int l = 0; l < arr.arrChar.length; l++) {
//            //System.out.println(" Value " + arr.arrChar[i]);
//            System.out.println(" Index " + i);
//
//            arr.fill(array, filler);
//            arr.sum(array);
//            System.out.println(arr.sum(array));
//        }


        Scanner sc = new Scanner(System.in);
        String line;
//        int number;
        boolean b;
        String bye = "bye";
        String matches = "matches 1234567890";

        System.out.println("Please enter your name: ");

        line = sc.next();
        if (line.matches(".*\\d+.*")) {
            b = true;
        } else b = false;

        if (b) {
            System.out.println("You are enter the name with numbers " + line);
        } else {
            System.out.println("You are enter the name is " + line);
        }

        System.out.println("Please enter your phone #: ");

        line = sc.next();

        if (line.matches("\\d{10}")) {
            b = true;
        } else b = false;

        if (b) {
            System.out.println("You are enter correct phone # " + line);
        } else {
            System.out.println("You are enter incorrect number " + line);
            System.out.println("Please enter the correct number");
            line = sc.next();
            if (line.matches("\\d{10}")) {
                b = true;
            } else b = false;
            if (b) {
                System.out.println("You are enter correct phone # " + line);
            } else {
                System.out.println("You are enter incorrect number " + line + "\n" + matches);
                System.out.println(bye);
            }


//        System.out.println("You are enter " + line);
//        int num;
//        System.out.println("Please enter your number: ");
//        num = sc.nextInt();
//        if (num == 0) {
//            System.out.println("You are enter " + num);
//        } else {
//            System.out.println("Good work" + num);
//        }
//
//        number = 0;
//        if (number >= 0){
//            b = true;
//        }
//        else b = false;
//
//        System.out.println("Please enter your number2: ");
////        number = sc.nextInt();
////        System.out.println("You are enter value " + number);
////        System.out.println("Please enter your number2 again: ");
//
//        number = sc.nextInt();
//        if (b) {
//            System.out.println("You are enter " + number);
//        } else {
//            System.out.println("You are enter text " + number);
        }
    }
}


