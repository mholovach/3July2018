public class Calculator extends ArithmeticAbs {

    @Override
    public Integer plusPlus(int one, int two) {
        if (one == 0 || two == 0) {
            System.out.println("zero " + one + " zero " + two + " = zero");
        } else if (one != 0 || two != 0) {
            System.out.println("plusPlus = " + (one + two));
        }
        return null;
    }

    @Override
    public Integer minusMinus(int one, int two) {
        if (one == 0 || two == 0) {
            System.out.println("zero");
        } else if (one != 0 || two != 0) {
            System.out.println("minusMinus = " + (one - two));
        }
        return null;
    }

    @Override
    public Integer multiplyM(int one, int two) {
        int res = 0;
        if (one == 0 || two == 0) {
            System.out.println("zero");
        } else if (one != 0 || two != 0) {
            res = one * two;
            System.out.println("multiplyM = " + res);
        }
        return res;
    }

    @Override
    public Integer divideD(int one, int two) {
        int res = 0;
        if (one == 0 || two == 0) {
            System.out.println("zero");
        } else if (one != 0 || two != 0){
            res = one / two;
            System.out.println("divideD = " + res);
        }
        return res;
    }


//
//
//    @Override
//    public String result(String res) {
//        return super.result(res);
//    }
}
