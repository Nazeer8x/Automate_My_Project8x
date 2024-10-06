package Tasks;

public class Task_27_09_2024_print_five_even_numbers {
    public static void main(String[] args) {
//Program to print first 5 even numbers
        int count = 0;
        int number = 2;
        do{
            System.out.println(number);
            count++;
            number += 2;
            }while (count < 5);
        }
    }
