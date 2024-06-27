/*
 * Application class to model the workings of an AlarmClock.
 * This class will NOT have a main() method, most such classes do not.
 */
class AlarmClock {
    // properties or attributes - these are called "instance variables" or "fields"
    int snoozeInterval = 5;

    void snooze(){
        System.out.println("Snoozing for " + snoozeInterval + " minutes");
    }
}