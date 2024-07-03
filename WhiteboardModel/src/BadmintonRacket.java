class BadmintonRacket {
    private static final int minStringTension = 20;
    private static final int maxStringTension = 30;
    private static final int minGripSize = 1;
    private static final int maxGripSize = 5;
    private static final int minWeight = 2;
    private static final int maxWeight = 5;

    private String brand;
    private int stringTension;
    private int weight;
    private int gripSize;

    public BadmintonRacket(String brand, int weight, int gripSize){
        setBrand(brand);
        setWeight(weight);
        setGripSize(gripSize);
    }

    public BadmintonRacket(String brand, int stringTension, int weight, int gripSize) {
        this(brand, weight, gripSize);
        setStringTension(stringTension);
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
        switch (brand){
            case "Li-Ning":
                this.brand = "Li-Ning";
                break;
            case "Victor":
                this.brand = "Victor";
                break;
            case "Yonex":
                this.brand = "Yonex";
                break;
            default:
                String errorMsg = "Invalid brand: " + brand + "\nAllowed brands are: Li-Ning, Victor, or Yonex";
                System.out.println(errorMsg);
        }
    }

    public int getStringTension() {
        return stringTension;
    }

    public void setStringTension(int stringTension) {
        if(stringTension < minStringTension || stringTension > maxStringTension){
            this.stringTension = stringTension;
        }
        else{
            String errorMsg = "String tension: " + stringTension + " is invalid" + "\nString tension should be between " + minStringTension + " and " + maxStringTension + ".";
            System.out.println(errorMsg);
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight < minWeight || weight > maxWeight){
            this.weight = weight;
        }
        else{
            String errorMsg = "Racket weight: " + weight + " is invalid" + "\nRacket weight should be between " + minWeight + " and " + maxWeight + ".";
            System.out.println(errorMsg);
        }
    }

    public int getGripSize() {
        return gripSize;
    }

    public void setGripSize(int gripSize) {
        if(gripSize < minGripSize || gripSize > maxGripSize){
            this.gripSize = gripSize;
        }
        else{
            String errorMsg = "Grip size: " + gripSize + " is invalid" + "\nGrip Size should be between " + minGripSize + " and " + maxGripSize + ".";
            System.out.println(errorMsg);
        }
    }

    public String toString(){
        return "Badminton Racket: " + getBrand() + " " + getStringTension() + "lb" + " " + getWeight() + "U" + " " + getGripSize() + "G";
    }
}