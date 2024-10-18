package Oct.ex_04102024.Constructor_Demo;

public class Dog {
    String name;
    String breed;
    int age;
    int legs;

    Dog(){
        System.out.println("Default constructor");
    }
    Dog (String name, String breed, int age, int legs){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.legs = legs;
    }

    void walk(){
        System.out.println("Dog can walk");
    }

    void eat(){
        System.out.println("Dog can eat");
    }
}
