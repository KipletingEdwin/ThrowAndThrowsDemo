//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //throw    =      used to throw an exception explicitely
    //                used when custom exception is to be used

    public static double divide(double a, double b){
        if(b == 0){
            throw  new ArithmeticException("Invalid Division");
        } else {
            return  a/b;
        }
    }


    public static void main(String[] args) {
        System.out.println(divide(10, 0));

    }
}