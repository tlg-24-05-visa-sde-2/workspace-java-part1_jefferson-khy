/*
 * Application main-class
 * In main method, create television objects and give basic test drive
 */
class TelevisionClient {
    public static void main(String[] args) {
        Television tv1 = new Television();
        tv1.brand = "Samsung";
        tv1.volume = 32;

        Television tv2 = new Television();
        tv2.brand = "Sony";
        tv2.volume = 50;

        Television tv3 = new Television();
        tv3.brand = "Toshiba";
        tv3.volume = 1;

        tv1.turnOn();
        tv1.turnOff();
        tv2.turnOn();
        tv2.turnOff();
        tv3.turnOn();
        tv3.turnOff();
    }
}