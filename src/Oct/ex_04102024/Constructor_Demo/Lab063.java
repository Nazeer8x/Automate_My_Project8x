package Oct.ex_04102024.Constructor_Demo;

public class Lab063 {
    public static void main(String[] args) {
        Dog gs = new Dog("DOG NAME", "GERMAN SHEPERD", 2,4);
        System.out.println(gs.name);
        System.out.println(gs.breed);
        System.out.println(gs.age);
        System.out.println(gs.legs);
        Dog bd = new Dog();

    }
}
