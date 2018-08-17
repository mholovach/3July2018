import java.util.Scanner;

public class Menu {

    public void mainMenu() {

Redactor redactor = new Redactor();
        Scanner sc = new Scanner(System.in);
        String line;
        int number;
        boolean b;
        String bye = "bye";
        String matches = "matches 1234567890";

        System.out.println("Please enter letter: \n" +
                            "c \n" +
                            "r \n" +
                            "u \n" +
                            "d \n");

        line = sc.next();
if (line.matches("c")) {
    ;
}
//            b = true;
//        } else b = false;
//
//        if (b) {
//            System.out.println("You are enter the name with numbers " + line);
//        } else {
//            System.out.println("You are enter the name is " + line);
//        }
//
//        System.out.println("Please enter your phone #: ");
//
//        line = sc.next();
//
//        if (line.matches("\\d{10}")) {
//            b = true;
//        } else b = false;
//
//        if (b) {
//            System.out.println("You are enter correct phone # " + line);
//        } else {
//            System.out.println("You are enter incorrect number " + line);
//            System.out.println("Please enter the correct number");
//            line = sc.next();
//            if (line.matches("\\d{10}")) {
//                b = true;
//            } else b = false;
//            if (b) {
//                System.out.println("You are enter correct phone # " + line);
//            } else {
//                System.out.println("You are enter incorrect number " + line + "\n" + matches);
//                System.out.println(bye);
//            }

        }
    }
