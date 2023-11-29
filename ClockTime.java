
/**
 * Name: Abdeljawad Ali (alia)
 * Course: CSCI 241 - Computer Science I
 * Section: 001
 * Assignment: 9
 * 
 * Projects Description:
 * Complete and test an instantiable class that keeps track of information for a clock time.
 */

public class ClockTime
{
    // Instance variables (Ints)
    private int hour;
    private int minute;
    private int second;

    // Default constructor sets time to 00:00:00
    public ClockTime(){
        this(0,0,0);
    }

    // Parameterized constructor validates and sets time
    public ClockTime(int hour, int minute, int second){
        // Ensure values are within valid ranges and adjust if necessary
        // Set instance variables for hour, minute, and second
        // if input values exceed valid ranges
        if (second > 59){
            minute += second / 60;
            second %= 60;
        } else if (second<0){
            second = 0;
        }

        if (minute > 59){
            hour += minute / 60;
            minute %= 60;
        } else if (minute < 0){
            minute = 0;
        }

        if (hour > 24){
            hour %= 24;
        } else if (hour < 0){
            hour = 0;
        }

        this.hour = hour;
        this.minute = minute;
        this.second=second;
    }

    // Getters for hour, minute, and second
    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

     // Setters ensure valid values are set for each component of time
    public void setHour(int hour){
        if (hour>= 0&& hour <= 24){
            this.hour = hour;
        }
    }

    public void setMinute(int minute){
        if (minute >= 0 && minute <= 59){
            this.minute = minute;
        }
    }

    public void setSecond(int second){
        if (second >= 0 && second <= 59){
            this.second = second;
        }
    }

    // toString methods to formate the the information into strings
    // toString() returns time in 24-hour format
    public String toString(){

        return String.format("%02d:%02d:%02d",hour,minute,second);

    }
    
    // toString12() returns time in 12-hour format with AM/PM
    public String toString12(){
        int twelveHourFormat = hour % 12;
        twelveHourFormat = (twelveHourFormat == 0) ? 12 : twelveHourFormat;
        String period = (hour >= 12) ? "P.M." : "A.M.";

        return String.format("%02d:%02d:%02d %s",twelveHourFormat,minute,second,period);
    }
    
    // Method to advance time by a specified number of seconds
    public void advance(int secondsToAdd){
        second+=secondsToAdd;
        for (int i = secondsToAdd; i>=60; i-=60){
            if (second > 59){
                minute += second / 60;
                second %= 60;
            } else if (second<0){
                second = 0;
            }

            if (minute > 59){
                hour += minute / 60;
                minute %= 60;
            } else if (minute < 0){
                minute = 0;
            }

            if (hour > 24){
                hour %= 24;
            } else if (hour < 0){
                hour = 0;
            }
        }

    }
    
    // Method to check if two ClockTime objects represent the same time
    public boolean equals(ClockTime otherClock){
        return (this.hour == otherClock.hour) && (this.minute == otherClock.minute) && (this.second == otherClock.second);

    }
}

