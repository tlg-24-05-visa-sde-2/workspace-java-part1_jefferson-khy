/*
 * application or system class to model workings of a television
 * It has properties, attributes, business methods but NO main() method
 */
class Television {
    String brand;
    int volume;

    void turnOn(){
        System.out.printf("Turning on your %s television to volume %d %n", brand, volume);
    }

    void turnOff(){
        System.out.printf("Shutting down...goodbye %n");
    }
}