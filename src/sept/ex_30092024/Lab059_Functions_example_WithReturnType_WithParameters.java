package sept.ex_30092024;

public class Lab059_Functions_example_WithReturnType_WithParameters {
    public static void main(String[] args) {
        int result = function_name(10, 20);
        System.out.println(result);
    }
    public static int function_name(int a, int b){
        System.out.println("with parameters and with Return type");
        return a+b;
    }

}
