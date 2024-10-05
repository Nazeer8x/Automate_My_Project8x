package Tasks;

import java.util.Scanner;

public class Task_20_sep_2024 {
    public static void main(String[] args) {
        //Write a program that prints numbers from 1 to 100. However, for multiples of 3, print "Fizz" instead of the number, and for multiples of 5, print "Buzz." For numbers that are multiples of both 3 and 5, print "FizzBuzz."
        //Logic Building
        //Step 1:
        //input > int n > n=100 - Scanner class
        //output > String > Fizz,Buzz and FizzBuzz
        //Step 2:
        //Write rough logic
        //for - int i=1 to i <=100 (n)
        //i -> multiple of 3 -> modules - 1%3 == 0 -> Fizz
        //i -> multiple of 5 -> modules - 1%5 == 0 -> Buzz
        //i -> multiple of 3,5 -> modules - 1%3 && i%5 == 0 -> FizzBuzz
        //Step 3:
        //Write real logic

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n = 100");
        int n = sc.nextInt();
        for (int i=1; i<=100; i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }

        }



    }
}
