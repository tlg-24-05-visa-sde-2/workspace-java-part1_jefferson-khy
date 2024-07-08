package com.entertainment.client;

import com.entertainment.Television;

class TelevisionMuteTest {
    public static void main(String[] args) {
        Television tv = new Television("Samsung", 32);
        System.out.println(tv);
        System.out.println();

        tv.setVolume(100);
        System.out.println(tv);

        tv.setVolume(-1);
        System.out.println(tv);

        tv.setVolume(101);
        System.out.println(tv);
        System.out.println();

        tv.mute();
        System.out.println(tv);

        tv.mute();
        System.out.println(tv);

        tv.mute();
        tv.setVolume(50);
        System.out.println(tv);
        tv.mute();
        System.out.println(tv);
    }
}