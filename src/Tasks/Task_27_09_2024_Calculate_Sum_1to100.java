package Tasks;

public class Task_27_09_2024_Calculate_Sum_1to100 {
    public static void main(String[] args) {
        //write a program to calculate the sum of numbers from 1 to 100
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            System.out.println("The sum of numbers from 1 to 100 is: " + sum);
        }
    }
}
