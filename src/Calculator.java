import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();


        double result = num1;
        while (true) {
            char operator = sc.next().charAt(0);
            double num2 = sc.nextDouble();

            switch (operator) {
                case '+':

                    result = result + num2;
                    System.out.println(result);
                    break;
                case '*':

                    result = result * num2;
                    System.out.println(result);
                    break;
                case '-':
                    result = result - num2;
                    System.out.println(result);
                    break;
                case '/':
                    result = result / num2;
                    System.out.println(result);
                    break;
                default:
                    System.exit(0);

            }
        }
    }
}