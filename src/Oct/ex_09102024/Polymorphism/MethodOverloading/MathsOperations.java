package Oct.ex_09102024.Polymorphism.MethodOverloading;

public class MathsOperations {
    //Method overloading: it can have multiple type of functions with single object
    //They will have same function name but different parameter and return types
    int add(int a, int b){
        return a+b;
    }

    String add(String a, String b){
        return a+b;
    }

    double add(double d1, double d2){
           return d1+d2;
        }
        double add(double d3, double d4, float f1){
               return d3+d4+f1;
            }

}
