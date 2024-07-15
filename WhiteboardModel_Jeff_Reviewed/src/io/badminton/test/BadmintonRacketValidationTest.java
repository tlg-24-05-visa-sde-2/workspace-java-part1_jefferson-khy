package io.badminton.test;

import io.badminton.BadmintonRacket;
import io.badminton.Brand;

/**
 * JR: not thorough enough.
 * For proper BVT (Boundary Value Testing) for stringTension range [20-30], need to test:
 *  19,20  and  30,31
 * and likewise for the other ranges.
 */
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