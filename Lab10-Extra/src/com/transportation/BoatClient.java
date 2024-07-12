package com.transportation;

class BoatClient {
    public static void main(String[] args) {
        Boat boat = new Boat("123");
        boat.moveTo("West Seattle");
    }
}