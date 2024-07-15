package io.badminton.client;

import io.badminton.BadmintonRacket;
import io.badminton.Brand;

import java.util.Arrays;

/**
 * JR: works as intended, but usage banner needs improvement.
 *  - Example usage does not work:
 *      java io.badminton.client.BadmintonRacketClientArgs YONEX, 28(optional), 4, 3
 *    Crashes with exception.
 *      Do not specify commas, and "28(optional)" is not a valid value for string tension.
 *      I understand the point of your example, but it should work verbatim.
 *  - If brand is given as "Li-Ning" per the usage info, application crashes with exception.
 *      This is because of the overridden toString() in the Brand enum.
 *      One way to address this would be to replace the "-" with an "_" in the input string:
 *          Brand brand = Brand.valueOf(args[0].replaceAll("-", "_").toUpperCase());
 */
class BadmintonRacketClientArgs {
    public static void main(String[] args) {
        if (args.length < 3) {
            String usage = "Usage: BadmintonRacketClientArgs <brand> <stringTension>(optional) <weight> <gripSize>";
            String example = "Example: BadmintonRacketClientArgs YONEX, 28(optional), 4, 3\n";
            String note1 = "Supported Badminton racket brands are: " + Arrays.toString(Brand.values());
            String note2 = "Racket stringTension is OPTIONAL; if it's included, it must be between " + BadmintonRacket.minStringTension + " and " + BadmintonRacket.maxStringTension;
            String note3 = "Racket weight must be between " + BadmintonRacket.minWeight + " and " + BadmintonRacket.maxWeight;
            String note4 = "Racket gripSize must be between " + BadmintonRacket.minGripSize + " and " + BadmintonRacket.maxGripSize;
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note1);
            System.out.println(note2);
            System.out.println(note3);
            System.out.println(note4);
            return;
        }

        /*
         * JR: significant redundancy between the 3-inputs and 4-inputs cases.
         * Okay enough for the assignment, given the early stage of the course we were in back then.
         */
        else if (args.length == 4) {
            Brand brand = Brand.valueOf(args[0].toUpperCase());

            // JR: autoboxing allows you to assign the int from parseInt() to an Integer
            // better to just use Integer.valueOf() instead, which directly returns an Integer
            Integer stringTension = Integer.parseInt(args[1]);
            Integer weight = Integer.parseInt(args[2]);
            Integer gripSize = Integer.parseInt(args[3]);

            BadmintonRacket badmintonRacket = new BadmintonRacket(brand, stringTension, weight, gripSize);

            System.out.println("Congratulations, your custom badminton racket is on its way!");
            System.out.println(badmintonRacket.toString());
            return;
        }

        Brand brand = Brand.valueOf(args[0].toUpperCase());
        Integer weight = Integer.parseInt(args[1]);
        Integer gripSize = Integer.parseInt(args[2]);

        BadmintonRacket badmintonRacket = new BadmintonRacket(brand, weight, gripSize);

        System.out.println("Congratulations, your custom badminton racket is on its way!");
        System.out.println(badmintonRacket.toString());
        return;
    }
}