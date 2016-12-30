package com.JavaStudyGroup.Projects;

/**
 * Created by MikeSamsung7 on 30/12/2016.
 */
public class ClockCreater {

    private int hours;
    private int minutes;
    private int seconds;

    public ClockCreater (String time){
        System.out.println("Parsing hours...");
        this.hours = Integer.parseInt(time.substring(0,2));
        System.out.println("Hours: " + hours);
        System.out.println("Parsting minutes...");
        this.minutes = Integer.parseInt(time.substring(4,6));
        System.out.println("Minutes: " + minutes);
        System.out.println("Parsting seconds...");
        this.seconds = Integer.parseInt(time.substring(7,9));
        System.out.println("Seconds: " + seconds);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
