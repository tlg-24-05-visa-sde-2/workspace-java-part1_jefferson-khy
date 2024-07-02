class CalculatorClient {
    public static void main(String[] args) {
        double sum = Calculator.add(1, 3);

        System.out.println("sum is: " + sum);
        System.out.println("difference is: " + Calculator.subtract(1.1, 3.3));
        System.out.println("is sum even: " + Calculator.isEven(sum));
        System.out.println();
        System.out.println("winner is: " + Calculator.randomInt());
    }
}