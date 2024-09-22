package sept.ex_16092024;

public class Lab014_Stringexample {
    public static void main(String[] args) {
        String first_name = "Nazeer";
        String last_name = "Uddin";
        System.out.println(first_name + last_name); // + is concatenation operator in case of alphabets
        int a = 10;
        int b = 10;
        System.out.println(first_name+last_name+a+b); // Nazeeruddin1010
        System.out.println(a+b+first_name+last_name); //20Nazeeruddin
        System.out.println(first_name+last_name+(a+b)); // brackets can solve a+b -> Nazeeruddin20
    }
}
