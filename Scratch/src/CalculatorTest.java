class CalculatorTest {
    public static void main(String[] args) {
        boolean isCorrect = true;

        // call randomInt 100_000_000 times and check result each time
        // if it is less than 5 or greater than 16, NOT CORRECT, bail and show result
        int min = 5;
        int max = 16;

        for (int i = 0; i < 100_000_000; i++) {
            int random = Calculator.randomInt(min, max);
            if (min > random || random > max) {
                isCorrect = false;
                break;
            }
        }
        if (isCorrect) {
            System.out.println("IT WORKS!");
        }
        else {
            System.out.println("IT's BROKE!");

        }
    }
}