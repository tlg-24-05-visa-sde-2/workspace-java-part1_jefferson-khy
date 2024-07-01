class BadmintonRacketClient {
    public static void main(String[] args) {
        BadmintonRacket racket1 = new BadmintonRacket();
        BadmintonRacket racket2 = new BadmintonRacket();

        racket1.setBrand("Yonex");
        racket1.setStringTension(24);
        racket1.setWeight(4);
        racket1.setGripSize(5);

        racket2.setBrand("Victor");
        racket2.setStringTension(30);
        racket2.setWeight(3);
        racket2.setGripSize(5);

        racket1.smash();
        racket1.block();
        racket1.clear();
        racket1.drop();
        System.out.println();
        racket2.smash();
        racket2.block();
        racket2.clear();
        racket2.drop();
        System.out.println();

        System.out.println(racket1);
        System.out.println(racket2);
    }
}