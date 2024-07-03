/*
 * application or system class to model workings of a television
 * It has properties, attributes, business methods but NO main() method
 */
class Television {
    //class level static variables, these live in shared zone
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;

    public static int getInstanceCount(){
        return instanceCount;
    }

    //Fields/instance variables
    private String brand;
    private int volume;
    private DisplayType displayType = DisplayType.LED;
    private boolean isMuted;
    private int oldVolume;

    //constructors
    public Television(){
        instanceCount++;
    }

    public Television(String brand){
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType displayType) {
        this(brand, volume);
        setDisplay(displayType);
    }

    //Business/action methods

    public void turnOn(){
        boolean isConnected = verifyInternetConnection();
        System.out.printf("Turning on your %s television to volume %d %n", getBrand(), getVolume());
    }

    public void turnOff(){
        System.out.printf("Shutting down...goodbye %n");
    }

    public void mute(){
        if(isMuted == false){
            oldVolume = getVolume();
            setVolume(MIN_VOLUME);
            isMuted = true;
        }
        else{
            setVolume(oldVolume);
            isMuted = false;
        }
    }

    //Accessor Methods/ toString Methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        switch (brand){
            case "Samsung":
                this.brand = "Samsung";
                break;
            case "LG":
                this.brand = "LG";
                break;
            case "Sony":
                this.brand = "Sony";
                break;
            case "Toshiba":
                this.brand = "Toshiba";
                break;
            default:
                String errorMsg = "Invalid brand: " + brand + "\nAllowed brands are: Samsung, LG, Sony, or Toshiba";
                System.out.println(errorMsg);
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume >= MIN_VOLUME && volume <= MAX_VOLUME){
            this.volume = volume;
        }
        else{
            String errorMsg = "Volume must be between " + MIN_VOLUME + " and " + MAX_VOLUME + ".";
            System.out.println(errorMsg);
        }
    }

    public DisplayType getDisplay(){
        return displayType;
    }

    public void setDisplay(DisplayType displayType) {
        this.displayType = displayType;
    }

    public boolean isMuted() {
        return isMuted;
    }

    private boolean verifyInternetConnection(){
        return true;
    }

    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
        return "Television Brand: " + getBrand() + ", " + "Volume: " + volumeString + ", display type: " + getDisplay();
    }
}