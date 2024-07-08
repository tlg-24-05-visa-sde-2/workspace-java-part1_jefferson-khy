import java.util.Arrays;

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
        else if (args.length == 4) {
            Brand brand = Brand.valueOf(args[0].toUpperCase());
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