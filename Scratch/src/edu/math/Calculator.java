package edu.math;

/*
 * This is an all-static class, it has nothing but static methods
 */
class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b){
        return a - b;
    }

    public static boolean isEven(double value){
        return value % 2 == 0;
    }

    /*
     * Returns average of supplied integers
     *
     * TODO: make method work with only 1 parameter passed
     */
    public static double average(int first, int... rest){
        // inside here, rest is automatically an array of int[]
        int sum = first;
        for(int value : rest){
            sum += value;
        }
        return (double) sum / (rest.length + 1);
    }

    /*
     * Returns a random integer between min and max (inclusive)
     *
     * TODO: implement this algorithm
     */

    public static int randomInt(int min, int max){

        double f = Math.random()/Math.nextDown(1.0);
        double x = min*(1.0 - f) + max*f;
        return (int) x;
    }

    /*
     * returns random integer between 1 and max inclusive
     */
    public static int randomInt(int max){
        return randomInt(1, max);
    }

    /*
     * Returns a random integer between 1 and 11 (inclusive)
     *
     * HINT: see a class called Math (in package java.lang) look for helpful method here
     * NOTE: these methods are all "static", call them as follows: Math.methodName()
     *
     */

    public static int randomInt(){
        return randomInt(1, 11);
//        int result = 0;
//
//        double rand = Math.random(); // between 0.0 and 1.0      * including 0.0
//        double scaled = (rand * 11) + 1;
//        result = (int) scaled;
//        return result;
    }
}