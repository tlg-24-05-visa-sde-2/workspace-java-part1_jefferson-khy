class CalculatorClient {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double sum = calc.Add(1, 3);

        System.out.println("sum is: " + sum);
        System.out.println("difference is: " + calc.Subtract(1.1, 3.3));
        System.out.println("is sum even: " + calc.isEven(sum));
        System.out.println();
        System.out.println("winner is: " + calc.randomInt(5, 20));
    }
}