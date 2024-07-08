import java.util.Arrays;

/*
 * application or system class to model workings of a television
 * It has properties, attributes, business methods but NO main() method
 */
class Television {
    //class level static variables, these live in shared zone
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;
    public static final String[] VALID_BRANDS = { "Samsung", "LG", "Sony", "Toshiba" };

    public static int getInstanceCount(){
        return instanceCount;
    }

    public static boolean isValidBrand(String brand){
        boolean valid = false;
        for(String currentBrand : VALID_BRANDS){
            if(currentBrand.equals(brand)){
                valid = true;
                break;
            }
        }
        return valid;
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

    //VALID_BRANDS contains { "Samsung", "LG", "Sony", "Toshiba" };
    public void setBrand(String brand) {
        if(!isValidBrand(brand)){
            System.out.printf("Invalid brand: %s. Valid brands are: %s.%n", brand, Arrays.toString(VALID_BRANDS));
        }
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume >= MIN_VOLUME && volume <= MAX_VOLUME){
            this.volume = volume;
        }
        else{
            System.out.printf("Invalid volume: %s. Valid range is %s and %s %n", volume, MIN_VOLUME, MAX_VOLUME);
//            String errorMsg = "Volume must be between " + MIN_VOLUME + " and " + MAX_VOLUME + ".";
//            System.out.println(errorMsg);
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
        return String.format("Television: brand = %s, volume = %s, display = %s", getBrand(), volumeString, getDisplay());
//        return "Television Brand: " + getBrand() + ", " + "Volume: " + volumeString + ", display type: " + getDisplay();
    }
}