package Oct.ex_09102024.Polymorphism.MethodOverloading;

public class Lab066 {
    public static void main(String[] args) {
        MathsOperations m = new MathsOperations();
        int result = m.add(3,4);
        System.out.println(result);

        String name = m.add("Nazeer", "Uddin");
        System.out.println(name);
    }
}
