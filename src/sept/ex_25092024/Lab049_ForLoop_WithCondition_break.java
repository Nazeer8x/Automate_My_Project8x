package sept.ex_25092024;

public class Lab049_ForLoop_WithCondition_break {
    public static void main(String[] args) {
        for (int i=0; i<=10; i++){
            if (i==5){
                break; //break the loop when i=5
            }
            System.out.println(i); //output: 0,1,2,3,4
        }
    }
}
