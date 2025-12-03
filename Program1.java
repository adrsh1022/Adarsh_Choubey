import java.util.*;

class Calculator 
{
    public double calculate(double a, double b, String op) 
  {
        switch (op) 
        {
            case "add":
                return a + b;
            case "sub":
                return a - b;
            case "mul":
                return a * b;
            case "div":
                if (b == 0) {
                    System.out.println("Error: Division by zero");
                    return 0;
                }
                return a / b;
            default:
                System.out.println("Invalid operation");
                return 0;
        }
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String op = sc.next();

        Calculator calc = new Calculator();
        System.out.println(calc.calculate(a, b, op));
    }
}
