public class Redactor {


    public String[] create(String[] arr, String value) {
        for (String str : arr) {
            if (str == null) {
                str = value;
            }
            break;
        }
        return arr;
    }

    public void read(String[] arr, int index, String val) {
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                arr[i] = val;
                if (arr[i] != null) {
                    System.out.println(arr[i] + ", ");
                }
            }
        }
    }

    public void read(String[] arr, int index) {
        if (index > arr.length - 1 || index >= 0) {
            System.out.println("Value " + arr[index]);
        } else {
            System.out.println("Value not applicaliable ");
        }
    }


        public String[] update (String[]arr,int index, String val){
            for (int i = 0; i < arr.length; i++) {
                if (i == index) {
                    arr[i] = val;
                } else {
                    arr[i] = "test";
                }
                System.out.println("Value: " + arr[i]);
            }
            return arr;
        }

        public String[] delete (String[]arr){
            return arr;
        }
    }

//    Scanner sc = new Scanner(System.in);
//    String line = "";
//    int number;
//    boolean b;
//    String bye = "bye";
//    String matches = "matches 1234567890";
//
//        System.out.println("Please enter your name: ");
//
//        line =sc.next();
//        if(line.matches(".*\\d+.*"))
//
//    {
//        b = true;
//    } else b =false;
//
//        if(b)
//
//    {
//        System.out.println("You are enter the name with numbers " + line);
//    } else
//
//    {
//        System.out.println("You are enter the name is " + line);
//    }
//
//        System.out.println("Please enter your phone #: ");
//
//    line =sc.next();
//
//        if(line.matches("\\d{10}"))
//
//    {
//        b = true;
//    } else b =false;
//
//        if(b)
//
//    {
//        System.out.println("You are enter correct phone # " + line);
//    } else
//
//    {
//        System.out.println("You are enter incorrect number " + line);
//        System.out.println("Please enter the correct number");
//        line = sc.next();
//        if (line.matches("\\d{10}")) {
//            b = true;
//        } else b = false;
//        if (b) {
//            System.out.println("You are enter correct phone # " + line);
//        } else {
//            System.out.println("You are enter incorrect number " + line + "\n" + matches);
//            System.out.println(bye);
//        }
//
//
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
//        if (number >= 0) {
//            b = true;
//        } else b = false;
//
//        System.out.println("Please enter your number2: ");
//        number = sc.nextInt();
//        System.out.println("You are enter value " + number);
//        System.out.println("Please enter your number2 again: ");
//
//        number = sc.nextInt();
//        if (b) {
//            System.out.println("You are enter " + number);
//        } else {
//            System.out.println("You are enter text " + number);
