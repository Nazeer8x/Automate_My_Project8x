package sept.ex_23092024;

public class Lab038_Switch_Condition {
    public static void main(String[] args) {
        //switch condition
        //syntax : switch (expression) {
        //         case statement 1:
        //          code
        //          break;
        // }

        // days : 1-> monday, 2 -> Tuesday,.....7 -> Sunday
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

        }



    }
}
