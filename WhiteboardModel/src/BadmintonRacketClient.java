class BadmintonRacketClient {
    public static void main(String[] args) {
        BadmintonRacket racket1 = new BadmintonRacket();
        BadmintonRacket racket2 = new BadmintonRacket();

        racket1.brand = "Yonex";
        racket1.stringTension = 24;
        racket1.weight = 4;
        racket1.gripSize = 5;

        racket2.brand = "Victor";
        racket2.stringTension = 30;
        racket2.weight = 3;
        racket2.gripSize = 5;

        racket1.smash();
        racket1.block();
        racket1.clear();
        racket1.drop();
        System.out.println();
        racket2.smash();
        racket2.block();
        racket2.clear();
        racket2.drop();
    }
}