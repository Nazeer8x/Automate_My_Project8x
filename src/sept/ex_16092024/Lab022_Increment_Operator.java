package sept.ex_16092024;

public class Lab022_Increment_Operator {
    public static void main(String[] args) {
        // increment ++ , decrement -- operators
        // pre and post
        // pre increment -> ++operand (value is incremented first and then  stored in result)
        // increment value first and then print
        int a = 10;
        int b = ++a; //a = a+1 (it will increment value by 1)
        System.out.println(b); //11
        System.out.println(a); // increment value first and then print

        int c = 20;
        System.out.println(++c);
        System.out.println(c);

        //post increment -> a++ print value first and then increase
        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);

    }
}
