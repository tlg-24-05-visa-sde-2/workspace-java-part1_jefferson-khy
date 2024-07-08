package io.badminton;

public class BadmintonRacket {
    public static final int minStringTension = 20;
    public static final int maxStringTension = 30;
    public static final int minGripSize = 1;
    public static final int maxGripSize = 5;
    public static final int minWeight = 2;
    public static final int maxWeight = 5;

    private Brand brand;
    private Integer stringTension;
    private Integer weight;
    private Integer gripSize;

    public BadmintonRacket(Brand brand, int weight, int gripSize) {
        setBrand(brand);
        setWeight(weight);
        setGripSize(gripSize);
    }

    public BadmintonRacket(Brand brand, int stringTension, int weight, int gripSize) {
        this(brand, weight, gripSize);
        setStringTension(stringTension);
    }

    public void smash() {
        System.out.printf("You used %s racket to smash!%n", getBrand());
    }

    public void block() {
        System.out.printf("You used %s racket with %d pound string tension to block.%n", getBrand(), getStringTension());
    }

    public void drop() {
        System.out.printf("Your %s racket is weight rated: %dU%n", getBrand(), getWeight());
    }

    public void clear() {
        System.out.printf("Clearing is easier with a smaller grip size and your %s racket has G%d gripSize.%n", getBrand(), getGripSize());
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Integer getStringTension() {
        return stringTension;
    }

    public void setStringTension(Integer stringTension) {
        if (stringTension >= minStringTension && stringTension <= maxStringTension) {
            this.stringTension = stringTension;
        } else {
            System.out.printf("String tension: %s is invalid. String tension should be between %d and %d.%n", stringTension, minStringTension, maxStringTension);
            // String errorMsg = "String tension: " + stringTension + " is invalid" + "\nString tension should be between " + minStringTension + " and " + maxStringTension + ".";
            // System.out.println(errorMsg);
        }
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        if (weight >= minWeight && weight <= maxWeight) {
            this.weight = weight;
        } else {
            System.out.printf("Racket weight: %d is invalid. Racket weight should be between %d and %d.%n", weight, minWeight, maxWeight);
            //  String errorMsg = "Racket weight: " + weight + " is invalid" + "\nRacket weight should be between " + minWeight + " and " + maxWeight + ".";
            //  System.out.println(errorMsg);
        }
    }

    public Integer getGripSize() {
        return gripSize;
    }

    public void setGripSize(Integer gripSize) {
        if (gripSize >= minGripSize && gripSize <= maxGripSize) {
            this.gripSize = gripSize;
        } else {
            System.out.printf("Grip size: %d is invalid. Grip size should be between %d and %d.%n", gripSize, minGripSize, maxGripSize);
            // String errorMsg = "Grip size: " + gripSize + " is invalid" + "\nGrip Size should be between " + minGripSize + " and " + maxGripSize + ".";
            // System.out.println(errorMsg);
        }
    }

    public String toString() {
        String stringTension = (getStringTension() == null || getStringTension() == 0) ? "%s" : "%slb";
        String weightFormat = (getWeight() == null || getWeight() == 0) ? "%s" : "%sU";
        String gripSizeFormat = (getGripSize() == null || getGripSize() == 0) ? "%s" : "%sG";
        return String.format("Badminton Racket: brand: %s, stringTension: " + stringTension + " weight: " + weightFormat + ", gripSize: " + gripSizeFormat, getBrand(), getStringTension(), getWeight(), getGripSize());
        // return "Badminton Racket: " + getBrand() + " " + getStringTension() + "lb" + " " + getWeight() + "U" + " " + getGripSize() + "G";
    }
}