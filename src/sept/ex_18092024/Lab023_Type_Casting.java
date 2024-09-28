package sept.ex_18092024;

import java.net.StandardSocketOptions;

public class Lab023_Type_Casting {
    public static void main(String[] args) {
        //widening - implicit, explicit - losses
        //Narrowing - implicit, explicit(with data type), loss

        //example of widening
        byte b = 10;
        int a = b; //we can store byte value into integer since interger is greater than byte - Implicit casting JVM will do it automatically
        int a1 = (int)b; // this is explicit casting where JVM will do automatically but (int) is hidden

        //Example of Narrowing
        int val = 300;
        //byte b1 = val; (i cannot store integer value into byte as interger is greater than byte and JVM will not agree) - invalid implicit casting
        byte b2 = (byte)val; // invalid explicit casting - loss of data
        System.out.println(b2); //44 int a=300; -> int means 32 bits memory required
        //0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 1 0 1 1 0 0
        //byte b1=(byte)a; -> byte means 8 bits memory required
        //0 0 1 0 1 1 0 0
        //Value is
       // 0 + 0 + 32 + 0 + 8 + 4 + 0 + 0 = 44.

    }
}
