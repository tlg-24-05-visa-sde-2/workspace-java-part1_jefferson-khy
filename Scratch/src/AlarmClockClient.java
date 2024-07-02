/*
 * Client-side "main-class" i.e., the class definition with main().
 * That's the ONLY thing in here.
 * we will create a few AlarmClock objects and give them a basic test-drive
 */
class AlarmClockClient {

    // starting point or "entry" point for every standalone Java application
    public static void main(String[] args) {
        // create an instance or object of AlarmClock and set its snoozeInterval
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(7);

        // create an instance or object of AlarmClock and set its snoozeInterval
        AlarmClock clock2 = new AlarmClock(10);

        // create a 3rd AlarmClock object and don't set snoozeInterval
        AlarmClock clock3 = new AlarmClock(AlarmClock.MAX_INTERVAL);

        clock1.snooze();
        clock2.snooze();
        clock3.snooze();
        System.out.println();

        System.out.println(clock1.toString());
        System.out.println(clock2);
        System.out.println(clock3);
    }
}