import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== SCIENTIFIC CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square");
            System.out.println("6. Square Root");
            System.out.println("7. Power");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            double num1, num2, result;

            switch (choice) {

                case 1:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();

                    result = num1 + num2;

                    System.out.println("Result = " + result);
                    break;

                case 2:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();

                    result = num1 - num2;

                    System.out.println("Result = " + result);
                    break;

                case 3:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();

                    result = num1 * num2;

                    System.out.println("Result = " + result);
                    break;

                case 4:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();

                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;

                case 5:
                    System.out.print("Enter Number: ");
                    num1 = sc.nextDouble();

                    result = num1 * num1;

                    System.out.println("Square = " + result);
                    break;

                case 6:
                    System.out.print("Enter Number: ");
                    num1 = sc.nextDouble();

                    result = Math.sqrt(num1);

                    System.out.println("Square Root = " + result);
                    break;

                case 7:
                    System.out.print("Enter Base Number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter Power: ");
                    num2 = sc.nextDouble();

                    result = Math.pow(num1, num2);

                    System.out.println("Result = " + result);
                    break;

                case 8:
                    System.out.println("Calculator Closed!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}