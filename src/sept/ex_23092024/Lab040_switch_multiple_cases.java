package sept.ex_23092024;

public class Lab040_switch_multiple_cases {
    public static void main(String[] args) {
        int itemcode = 006;
        switch (itemcode){
            case 001,002,005:
            System.out.println("All of them are electronic gadgets");
            break;
            case 006,004,010:
                System.out.println("This are mechanical gadgets");
                break;
            default:
                System.out.println("NONE");
            break;
        }
    }
}
