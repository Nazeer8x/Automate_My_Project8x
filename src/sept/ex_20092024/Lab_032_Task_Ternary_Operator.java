package sept.ex_20092024;

public class Lab_032_Task_Ternary_Operator {
    public static void main(String[] args) {
        int score_1 = 90;
        int score_2 = 80;
        int score_3 = 70;
        String grade_A = score_1 >= score_2 ? "A" : "B";
        System.out.println(grade_A);
        String grade_B = score_2 >= score_3 ? "B" : "C";
        System.out.println(grade_B);
        String grade_c = score_3 <= score_2 ? "C" : "A";
        System.out.println(grade_c);
    }
}
