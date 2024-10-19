package Oct.ex_09102024.Polymorphism.MethodOverriding.Realexample;

public class Lab068 {
    public static void main(String[] args) {
        Nazeer n = new Nazeer();
        n.home();


    Father f = new Father();
    f.home();

    //Dynamic dispatch
        Father object = new Nazeer();
        object.home();

    }
}
