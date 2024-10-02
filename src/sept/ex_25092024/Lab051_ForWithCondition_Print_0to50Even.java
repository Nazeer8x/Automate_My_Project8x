package sept.ex_25092024;

public class Lab051_ForWithCondition_Print_0to50Even {
    public static void main(String[] args) {
        for (int i=0; i<=50; i++){
            if(i%2==0){
                System.out.println("Even ->" +i);
                continue;
            }
            System.out.println(i);
        }
    }
}
