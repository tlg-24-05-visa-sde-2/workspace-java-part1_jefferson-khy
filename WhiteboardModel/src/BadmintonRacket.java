class BadmintonRacket {
    String brand;
    int stringTension;
    int weight;
    int gripSize;

    void smash(){
        System.out.printf("You used %s racket to smash!%n", brand);
    }

    void block(){
        System.out.printf("You used %s racket with %d pound string tension to block.%n", brand, stringTension);
    }

    void drop(){
        System.out.printf("Your %s racket is weight rated: %dU%n", brand, weight);
    }

    void clear(){
        System.out.printf("Clearing is easier with a smaller grip size and your %s racket has G%d gripsize.%n", brand, gripSize);
    }
}