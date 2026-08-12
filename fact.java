import java.util.Scanner;

public class TestFactorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Factorial f = new Factorial();

        long result = f.calculate(n);

        System.out.println("Factorial of " + n + " = " + result);

        sc.close();
    }
}
