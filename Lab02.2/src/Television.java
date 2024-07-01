/*
 * application or system class to model workings of a television
 * It has properties, attributes, business methods but NO main() method
 */
class Television {
    //Fields/instance variables
    private String brand;
    private int volume;

    //Business/action methods
    public void turnOn(){
        boolean isConnected = verifyInternetConnection();
        System.out.printf("Turning on your %s television to volume %d %n", getBrand(), getVolume());
    }

    public void turnOff(){
        System.out.printf("Shutting down...goodbye %n");
    }

    //Accessor Methods/ toString Methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean verifyInternetConnection(){
        return true;
    }

    public String toString() {
        return "Television Brand: " + getBrand() + " " + getVolume();
    }
}