class BadmintonRacket {
    private String brand;
    private int stringTension;
    private int weight;
    private int gripSize;

    public BadmintonRacket(String brand){
        setBrand(brand);
    }

    public BadmintonRacket(String brand, int stringTension, int weight, int gripSize) {
        this(brand);
        setStringTension(stringTension);
        setWeight(weight);
        setGripSize(gripSize);
    }

    public void smash(){
        System.out.printf("You used %s racket to smash!%n", getBrand());
    }

    public void block(){
        System.out.printf("You used %s racket with %d pound string tension to block.%n", getBrand(), getStringTension());
    }

    public void drop(){
        System.out.printf("Your %s racket is weight rated: %dU%n", getBrand(), getWeight());
    }

    public void clear(){
        System.out.printf("Clearing is easier with a smaller grip size and your %s racket has G%d gripSize.%n", getBrand(), getGripSize());
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
        return "Badminton Racket: " + getBrand() + " " + getStringTension() + "lb" + " " + getWeight() + "U" + " " + getGripSize() + "G";
    }
}