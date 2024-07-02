class BadmintonRacketClient {
    public static void main(String[] args) {
        BadmintonRacket racket1 = new BadmintonRacket("Yonex", 24, 4, 5);
        BadmintonRacket racket2 = new BadmintonRacket("Victor",3,5);

//        racket1.setBrand("Yonex");
//        racket1.setStringTension(24);
//        racket1.setWeight(4);
//        racket1.setGripSize(5);
//
//        racket2.setBrand("Victor");
//        racket2.setWeight(3);
//        racket2.setGripSize(5);

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