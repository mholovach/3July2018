public class Cycles {
    public void whileCycles(int i) {
        System.out.println("while ");
        while (i <= 10) {
            System.out.println("cycle " +i);
            i++;
        }

        System.out.println("while true ");
        i=0;
        while (true) {
            if (i > 10) break;
            System.out.println("cycle " + i);
            i++;
        }

        System.out.println("do while ");
        i=0;
        do {
            System.out.println("cycle " +i);
            i++;
        } while (i <=10);
    }
}
