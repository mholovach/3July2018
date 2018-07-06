public class IfElseOperations {

    public int printInt(int val) {
        System.out.println(val);
        return val;
    }

    protected String print(String value) {
        System.out.println(value);
        return value;
    }



    public void ifElseMethod(String name, int age){
        int age1 = 15;
        if (name == null || age <=0){
            System.out.println("underground");
        } else if (name == "Vasya" && age == 30) {
            System.out.println("Vasya");
        } else {
            System.out.println("else: not Vasya");
        }


        int ageRes = (age1 == 20) ? printInt(20) : printInt(10);
        String ageResult = (age1 == 20 || name == "Vasya") ? print("Vasya 20") : print("not detected");

    }
}
