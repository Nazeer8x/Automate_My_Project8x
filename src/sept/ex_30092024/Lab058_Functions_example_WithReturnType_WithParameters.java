package sept.ex_30092024;

public class Lab058_Functions_example_WithReturnType_WithParameters {
    public static void main(String[] args) {
        String name = function_name("Saurabh");
        System.out.println(name);
    }
    public static String function_name(String name){
        System.out.println("with parameters and with Return type");
        return name;
    }
}
//another exapmple:
// public static void main(String[] args) {
//        int result = function_name(3,4);
//        System.out.println(name);
//    }
//    public static int function_name(int a, int b){
//        System.out.println("with parameters and with Return type");
//        return a+b;
