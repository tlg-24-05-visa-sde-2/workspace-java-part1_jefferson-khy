package org.snooze;/*
 * client-side main-class focused only on testing setSnoozeInterval
 * we will do BVT (Boundary Value Testing)
 * any bug will be sniffed out on the edges of the valid range
 * we test 0,1 and 20,21
 * we test on each boundary, and just outside it
 */

class AlarmClockValidationTest {
    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();
        clock.setSnoozeInterval(1); //value should "stick", no error message
        System.out.println(clock);

        clock.setSnoozeInterval(20);
        System.out.println(clock);
        System.out.println();

        clock.setSnoozeInterval(0);
        System.out.println(clock);
        System.out.println();

        clock.setSnoozeInterval(21);
        System.out.println(clock);
    }
}