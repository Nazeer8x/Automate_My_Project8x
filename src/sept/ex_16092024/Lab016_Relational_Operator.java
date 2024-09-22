package sept.ex_16092024;

public class Lab016_Relational_Operator {
    public static void main(String[] args) {
        // relational operators are condition based like boolean
        // < , >, <=, >=, ==, !=, !
        int a = 10;
        int b = 30;
        boolean c = a > b;
        System.out.println(c); //false
        int age_Nazeer = 35;
        int age_Mona = 35;
       // boolean result = age_Mona > age_Nazeer; false
        boolean result = age_Mona >= age_Nazeer; // true
        System.out.println(result);


    }
}
