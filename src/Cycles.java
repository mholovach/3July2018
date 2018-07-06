public class Cycles {
    public void whileCycles(int i) {
        System.out.println("while ");
        while (i <= 10) {
            System.out.println("cycle " + i);
            i++;
        }

        System.out.println("while true ");
        i = 0;
        while (true) {
            if (i > 10) break;
            System.out.println("cycle " + i);
            i++;
        }

        System.out.println("do while ");
        i = 0;
        do {
            if (i == 0) break;
            System.out.println("cycle " + i);
            i++;
        } while (i <= 10);
    }

    public void forCycles(int i) {

        for (int j = 1; j <= 10; j++) {
            i = i*j;
            System.out.println("J value " + i);
        }


        int[] numbers = {1,2,3,4,5,6,7,8,9};

        int n =0;
        for (int number : numbers) {
            if (number == 5) break;{
                n++;

                System.out.println("We found # " + number);

            };
            System.out.println(n);
        }
    }
}

