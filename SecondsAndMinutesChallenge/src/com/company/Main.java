    //IMP - STRING RETURN CONCEPT AND USE OF STRING AFTER STATIC, USE OF MODULAS OPERTAOR , STRING RETURN DOUBLE QUOTES & WITH ("")

package com.company;

public class Main {

    public static void main(String[] args) {// WITHOUT THIS METHOD DECLARATION IN THIS FORMAT ONLY I.E STRINGS & ARGS, OUR CODE NOT RUN

        String check = getDurationString (3945);
        System.out.println(check);



    }

    public static String getDurationString (int minutes, int seconds) { //Without public / private still our code run

        if (minutes >= 0 && seconds >=0 &&  seconds <= 59){

            int seconds2 = minutes * 60;
            System.out.println("sec = " + seconds2);

            seconds += seconds2 ;
            System.out.println("total sec = " + seconds);

            int hour = seconds / 3600;
            System.out.println("hr = " + hour);

            int min = seconds % 3600;
            min = min / 60;
            System.out.println("min = " + min);

            int sec = seconds % 3600;
            sec = sec % 60;
            System.out.println("sec = " + sec);

            return (hour + "h " + min + "m " + sec + "s "); //Return statement for string - rem the format

        }
        else {
            return "Invalid value"; //Return statement for string in double quotes
        }
    }

    public static String getDurationString (int seconds) {
        if (seconds >= 0){
            int min = seconds / 60;
            System.out.println("min = " + min);

            int remainingSec = seconds % 60;
            System.out.println("remainin sec = " + remainingSec);

            String check = getDurationString(min, remainingSec);
            return check; //return getDurationString (min, remainingSec); .....line 53 and 54 can also be written like this
        }
        else {
            return "Invalid value";
        }
    }
}

