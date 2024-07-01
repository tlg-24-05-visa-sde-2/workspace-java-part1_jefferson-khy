class BadmintonRacket {
    private String brand;
    private int stringTension;
    private int weight;
    private int gripSize;

    public void smash(){
        System.out.printf("You used %s racket to smash!%n", brand);
    }

    public void block(){
        System.out.printf("You used %s racket with %d pound string tension to block.%n", brand, stringTension);
    }

    public void drop(){
        System.out.printf("Your %s racket is weight rated: %dU%n", brand, weight);
    }

    public void clear(){
        System.out.printf("Clearing is easier with a smaller grip size and your %s racket has G%d gripsize.%n", brand, gripSize);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStringTension() {
        return stringTension;
    }

    public void setStringTension(int stringTension) {
        this.stringTension = stringTension;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getGripSize() {
        return gripSize;
    }

    public void setGripSize(int gripSize) {
        this.gripSize = gripSize;
    }

    public String toString(){
        return "Badminton Racket: " + brand + " " + stringTension + "lb" + " " + weight + "U" + " " + gripSize + "G";
    }
}