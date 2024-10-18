package Oct.ex_04102024;

public class AHuman {
    String eyes_color;
    String planet = "AHuman";
    String name;
    long aadhar_number;


    AHuman(){ // AHuman is default constructor
        //constructor doesnt have any return type
        //it has same name as class name
        //its a special method which invoked automatically when object is created
        // Purpose of constructor is to initialise the instance variable values
        System.out.println("i will be called , when ever object is created");
        //write a code here which will automatically called when object is created
        //i can write a code to Read a file txt
        // i can write a code to Read csv, excel file here
    }

    //Parameterized constructor
    AHuman(String name){
        System.out.println("Hi iam param constructor");
        this.name = name;
    }

    void walk(){
        System.out.println("No return type No Argument");
    }

    int talk(){
        System.out.println("With return type and no argument");
return 10;
    }

    String sleep(String name){
        System.out.println("sleeping");
        System.out.println("With return type and with argument");
        return "iam sleeping";
    }

    void eat(String name){
        System.out.println("eat");
        System.out.println("With argument and No return type");
    }
}
