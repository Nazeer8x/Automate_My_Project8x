package sept.ex_16092024;

public class Lab026_PostAndPre_Example {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        //A -> a++
        //B -> ++a
        //A + B = 11 + 12
    }
}
