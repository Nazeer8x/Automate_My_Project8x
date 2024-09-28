package sept.ex_16092024;

public class Lab027_PostAndPre_Example_2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        //line no./value/exp
        //A -> ++a , exp1 = 11 , a = 11
        //B -> a++ , exp2 = 11, a= 12
        //C -> a++, exp3 = 12, a=13
    }



}
