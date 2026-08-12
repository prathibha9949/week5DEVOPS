public class TestFactorial {

    public static void main(String[] args) {

        Factorial f = new Factorial();

        long expected = 120;
        long actual = f.calculate(5);

        if (actual == expected) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + actual);

            System.exit(1);   // Tell Jenkins that test failed
        }
    }
}
