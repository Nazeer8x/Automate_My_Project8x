package sept.ex_18092024;

public class Lab029_TypeCasting_Example {
    public static void main(String[] args) {
        long phone_no = 9767630052l;
        //short s = phone_no; i cannot store long value into short as long is greater than short - invalid implicit narrowing
        short s1 = (short)phone_no; //Narrowing - explicit - loss of data -invalid explicit narrowing
        System.out.println(s1); //13540


    }
}
