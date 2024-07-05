class BadmintonRacketValidationTest {
    public static void main(String[] args) {
        BadmintonRacket racket1 = new BadmintonRacket(Brand.YONEX, 4, 4);
        System.out.println(racket1);
        System.out.println();

        BadmintonRacket racket2 = new BadmintonRacket(Brand.VICTOR, 27,4, 5);
        System.out.println(racket2);
        System.out.println();

        BadmintonRacket racket3 = new BadmintonRacket(Brand.LI_NING, 70, 0, 7);
        System.out.println(racket3);
        System.out.println();
    }
}