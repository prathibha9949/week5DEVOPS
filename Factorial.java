public class Factorial {

    public long calculate(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Factorial f = new Factorial();

        int n = 5;

        System.out.println("Number: " + n);
        System.out.println("Factorial of " + n + " = " + f.calculate(n));
    }
}
