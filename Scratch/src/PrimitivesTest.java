class PrimitivesTest {

    public static void main(String[] args) {
        int age = 57;
        System.out.printf("age is: %d%n", age);

        long population = 8_000_000_000L;
        System.out.printf("population is: %d%n", population);

        double price = 799.99;
        System.out.printf("price is: %.2f%n", price);

        boolean isCloudy = true;
        System.out.printf("isCloudy is: %b%n", isCloudy);

        char size = 'S';
        System.out.printf("size is: %c%n", size);

        String grade = "A";
        System.out.printf("my grade on the test was: %s %n", grade);

        String quote = "What's up, \"Doc\"?";
        System.out.printf("Bugs Bunny says: %s%n", quote);

        System.out.println("roses are red\nviolets are blue");
        System.out.println();

        int n = 18;
        int m = n;

        n = 19;
        System.out.println(m);
        System.out.println();

        int kids = 2;
        System.out.println("number of kids: " + kids++);
    }
}