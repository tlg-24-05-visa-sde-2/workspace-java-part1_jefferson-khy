package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

/*
 * Application main-class
 * In main method, create television objects and give basic test drive
 */
class TelevisionClient {
    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances");

        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(32);
        tv1.setDisplay(DisplayType.PLASMA);

        Television tv2 = new Television("Sony", 50, DisplayType.OLED);
//        tv2.setBrand("Sony");
//        tv2.setVolume(50);

        Television tv3 = new Television("Toshiba", Television.MAX_VOLUME);
//        tv3.setBrand("Toshiba");
//        tv3.setVolume(1);

        tv1.turnOn();
        tv1.turnOff();
        System.out.println();

        tv2.turnOn();
        tv2.turnOff();
        System.out.println();

        tv3.turnOn();
        tv3.turnOff();
        System.out.println();

        System.out.println(tv1.toString());
        System.out.println(tv2);
        System.out.println(tv3);
        System.out.println();

        System.out.println(Television.getInstanceCount() + " instances");
    }
}