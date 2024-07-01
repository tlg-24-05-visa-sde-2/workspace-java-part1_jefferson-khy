/*
 * Application main-class
 * In main method, create television objects and give basic test drive
 */
class TelevisionClient {
    public static void main(String[] args) {
        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(32);

        Television tv2 = new Television();
        tv2.setBrand("Sony");
        tv2.setVolume(50);

        Television tv3 = new Television();
        tv3.setBrand("Toshiba");
        tv3.setVolume(1);

        tv1.turnOn();
        tv1.turnOff();
        tv2.turnOn();
        tv2.turnOff();
        tv3.turnOn();
        tv3.turnOff();
        System.out.println();

        System.out.println(tv1.toString());
        System.out.println(tv2);
        System.out.println(tv3);
    }
}