package sept.ex_23092024;

public class Lab041_switch_using_Arrow {
    public static void main(String[] args) {
        int itemcode = 001;
        switch (itemcode) {
            case 001, 002, 005 -> System.out.println("All of them are electronic gadgets");
            case 006, 004, 010 -> System.out.println("This are mechanical gadgets");
            default -> System.out.println("NONE");
        }
    }
}
