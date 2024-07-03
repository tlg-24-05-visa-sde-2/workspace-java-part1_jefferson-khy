class BadmintonRacketValidationTest {
    public static void main(String[] args) {
        BadmintonRacket racket1 = new BadmintonRacket("Yonex", 4, 4);
        System.out.println(racket1);
        System.out.println();

        BadmintonRacket racket2 = new BadmintonRacket("Victor", 27,4, 5);
        System.out.println(racket2);
        System.out.println();

        BadmintonRacket racket3 = new BadmintonRacket("Fake", 70, 0, 7);
        System.out.println(racket3);
        System.out.println();
    }
}