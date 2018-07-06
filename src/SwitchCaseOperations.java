public class SwitchCaseOperations {
IfElseOperations ifElse = new IfElseOperations();
    public void ageResult(int age, String ggg){
        switch (age){
            case 10:
               ifElse.print("case 10 " + ggg) ;
                break;
            case 20:
                ifElse.print("case 20 ") ;
                break;
            default:
                ifElse.print("defaulf ") ;
        }
    }
}
