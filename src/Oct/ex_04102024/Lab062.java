package Oct.ex_04102024;

public class Lab062 {
    public static void main(String[] args) {
        AHuman nazeer = new AHuman(); // object creation of default constructor
        AHuman naseer = new AHuman("Naseer"); // object creation of parameterized constructor
        AHuman yousuf = new AHuman("Yousuf");
        System.out.println(nazeer.name);
        System.out.println(naseer.name);
        System.out.println(yousuf.name);
    }
}
