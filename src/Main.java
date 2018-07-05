
/**
 * Created by student on 03.07.2018.
 */
public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int i = 1;
        int j = 1;
        int k = 2;
        String puppy = "puppy";
        String puppy1 = "puppy1";
        String puppy2 = "puppy2";
        int result = i;
        i++;
        int result1 = i +j * k;
        j++;
        int result2 = i +j * k;
        k++;
        int result3 = i +j * k;

        System.out.println("====>>>> Result i " + i + " = "+ result //0
                        + "\n====>>>> Result1 j " + i + " = " + result1 //
                        + "\n====>>>> Result2 j " + j + " = " + result2
                        + "\n====>>>> Result3 k " + k+ " = " + result3
                        + "\n====>>>> New result i++ = " + i++
                        + "\n====>>>> New result ++i = " + ++i);
//        System.out.println("\n====>>>> New result ++i = " + ++i);

        if (k > j || k > i){
            System.out.println("New result k > i = " + k +" > "+ i + "\n or " + k + " > " + j);
        } else if (k == i){
            System.out.println("New result k < i = " + k +" = "+ i);
        } else {
            System.out.println("New result k < i = " + k +" < "+ i);
        }



        int res;
        res = calc.divideD(i, j)
            + calc.multiplyM(i, j)
                * calc.multiplyM(i, j);
        {
            System.out.println("divideD result = " + res);
        }

    IfElseOperations ifelse = new IfElseOperations();
        ifelse.ifElseMethod("Vas", 5);
    }

}


