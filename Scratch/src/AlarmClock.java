import org.w3c.dom.ls.LSOutput;

/*
 * Application class to model the workings of an AlarmClock.
 * This class will NOT have a main() method, most such classes do not.
 */
class AlarmClock {
    // properties or attributes - these are called "instance variables" or "fields"
    private int snoozeInterval = 5;

    //constructors
    public AlarmClock() {}

    public AlarmClock(int snoozeInterval){
        setSnoozeInterval(snoozeInterval); // delegate to setter for validation/conversion if any
    }

    public void snooze(){
        System.out.println("Snoozing for " + getSnoozeInterval() + " minutes");
    }

    // accessor methods - provide controlled access to the objects fields
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    // TODO: implement constraint - must be between 1 and 20 inclusive
    // if incoming value is valid we take it, i.e. assign to private field
    // otherwise, we reject it with an error message
    public void setSnoozeInterval(int snoozeInterval) {
        if(snoozeInterval >= 1 && snoozeInterval <= 20){
            this.snoozeInterval = snoozeInterval;
        }
        else {
            String errorMsg = "Invalid snooze interval: " + snoozeInterval + "\n Must be between 1 and 20";
            System.out.println(errorMsg);
            return;
        }
    }

    public String toString(){
        return "AlarmClock: snoozeInterval=" + getSnoozeInterval();
    }
}