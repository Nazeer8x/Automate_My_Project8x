package sept.ex_23092024;

public class Lab039_Swtich_example {
    public static void main(String[] args) {
        // in web automation - i'll ask user which browser you want to run the code
        String browser = "chrome";
        switch (browser) {
            case "chrome":
                System.out.println("Starting chrome browser");
                break;
            case "EDGE":
                System.out.println("Starting Edge browser");
                break;
            case "Firefox":
                System.out.println("Starting firefox browser");
                break;
            default:
                System.out.println("i've no idea what browser is this");
                break;
        }
    }
}
