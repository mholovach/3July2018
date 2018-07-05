public class SwitchCaseOperations {
IfElseOperations ifElse = new IfElseOperations();
    public void ageResult(int age, String ggg){
        switch (age){
            case 10:
               ifElse.print("ggg" + ggg) ;
                break;
            case 20:
                ifElse.print("ggg") ;
                break;
            default:
                ifElse.print("ttt") ;
        }
    }
}
