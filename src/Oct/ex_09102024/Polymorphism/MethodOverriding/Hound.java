package Oct.ex_09102024.Polymorphism.MethodOverriding;

public class Hound extends Dog{ //Hound is a type of dog, it will have is a relationship


    @Override
    void bark() {
        System.out.println("iam Hound, i will also bark");
    }
}
