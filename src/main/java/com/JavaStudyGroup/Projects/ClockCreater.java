package com.JavaStudyGroup.Projects;

/**
 * Created by MikeSamsung7 on 30/12/2016.
 */
public class ClockCreater {

    private int hours;
    private int minutes;
    private int seconds;

    private char displaySeconds;

    private char[] displayHoursRow1 = new char[4];
    private char[] displayHoursRow2 = new char[4];

    private char[] displayMinutesRow1 = new char[11];
    private char[] displayMinutesRow2 = new char[4];

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

    public void createSeconds(){
        if(seconds%2==0){
            displaySeconds = 'Y';
        }
        else{
            displaySeconds = 'O';
        }
    }

    public void createHours(){

        int row1BoxesToFill = hours/5;
        int row2BoxesToFill = hours%5;


        //Create Line 1:
        for(int i = 0;i<4;i++){
            if (i<row1BoxesToFill){
                displayHoursRow1[i] = 'R';
            }
            else{
                displayHoursRow1[i] = 'O';
            }
        }

        //Create Line 2
        for(int i = 0;i<4;i++){
            if (i<row2BoxesToFill){
                displayHoursRow2[i] = 'R';
            }
            else{
                displayHoursRow2[i] = 'O';
            }
        }
    }

    public void createMinutes(){

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

    public char getDisplaySeconds() {
        return displaySeconds;
    }

    public void setDisplaySeconds(char displaySeconds) {
        this.displaySeconds = displaySeconds;
    }

    public char[] getDisplayHoursRow1() {
        return displayHoursRow1;
    }

    public char[] getDisplayHoursRow2() {
        return displayHoursRow2;
    }
}
