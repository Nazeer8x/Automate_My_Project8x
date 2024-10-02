package sept.ex_25092024;

public class Lab050_ForLoop_WithCondition_continue {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            System.out.println(i);
            if (i==5){
                continue;
            }
            System.out.println("After");
//            0
//            After
//            1
//            After
//            2
//            After
//            3
//            After
//            4
//            After
//            5
//            6
//            After
//            7
//            After
//            8
//            After
//            9
//            After
        }
    }
}
