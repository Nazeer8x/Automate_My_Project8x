package sept.ex_16092024;

public class Lab024_PostIncrement_example {
    public static void main(String[] args) {
        int a = 20;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
        //line no.|exp|a
        //5|   | 20
        //6| b=20 | 21
        //7| b=20 | 20
    }
}
