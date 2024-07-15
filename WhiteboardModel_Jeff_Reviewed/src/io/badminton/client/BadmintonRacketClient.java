package io.badminton.client;

import io.badminton.BadmintonRacket;
import io.badminton.Brand;

/**
 * JR: good basic test-drive of a few valid instances.
 */
class BadmintonRacketClient {
    public static void main(String[] args) {
        BadmintonRacket racket1 = new BadmintonRacket(Brand.YONEX, 24, 4, 5);
        BadmintonRacket racket2 = new BadmintonRacket(Brand.VICTOR,3,5);

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