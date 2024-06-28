class Calculator {
    double Add(double a, double b) {
        return a + b;
    }

    double Subtract(double a, double b){
        return a - b;
    }

    boolean isEven(double value){
        return value % 2 == 0;
    }

    /*
     * Returns a random integer between min and max (inclusive)
     *
     * TODO: implement this algorithm
     */

    int randomInt(int min, int max){
        return 0;
    }

    /*
     * Returns a random integer between 1 and 11 (inclusive)
     *
     * HINT: see a class called Math (in package java.lang) look for helpful method here
     * NOTE: these methods are all "static", call them as follows: Math.methodName()
     *
     *
     */

    int randomInt(){
        int result = 0;

        double rand = Math.random(); // between 0.0 and 1.0      * including 0.0
        double scaled = (rand * 11) + 1;
        result = (int) scaled;
        return result;
    }
}