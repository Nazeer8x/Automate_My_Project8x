package Oct.ex_09102024.Inheritance.Hierarical.Inheritance;

public class Lab065 {
    public static void main(String[] args) {
        Daughter d = new Daughter();
        d.d2(); //// daughter can access her home and father home
        d.home();

        Son1 s1 = new Son1();
        s1.s2(); // son1 can access his home and father home
        s1.home();

        Son2 nazeer = new Son2();
        nazeer.h2(); // son2 can access his home and father home
        nazeer.home();

        Father f = new Father(); //father can access only his home
        f.home();
    }
}
