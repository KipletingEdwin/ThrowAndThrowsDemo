//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

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