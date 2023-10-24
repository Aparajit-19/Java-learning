                                            //JUST ANOTHER WAY WITH ALOT OF CHANGES

package com.company;

public class Main {

   private static final String INVALID_VALUE_MESSAGE = "Invalid value"; //rem how constant declared

   public static void main(String[] args) {

       System.out.println(getDurationString(65,45));
       System.out.println(getDurationString(3945));                        //  THIS IS ANOTHER WAY TO PRINT INSTEAD DECLARE NEW VARIABLE AND THEN PRINT
       System.out.println(getDurationString(-41));
       System.out.println(getDurationString(65,9));

   }

    public static String getDurationString (int minutes, int seconds) {

        if (minutes >= 0 && seconds >=0 &&  seconds <= 59){

            int seconds2 = minutes * 60;
            System.out.println("sec = " + seconds2);

            seconds += seconds2 ;
            System.out.println("total sec = " + seconds);

            int hour = seconds / 3600;
            String hourN = hour + "h" ;                     //rem
            if (hour < 10) {                                    //rem
                hourN = "0" + hourN ;                           //rem
            }
            System.out.println("hr = " + hourN);                        //rem

            int min = seconds % 3600;
            min = min / 60;
            String minN = min + "m" ;                                                        //rem
            if (min < 10) {//rem
                minN = "0"  +  minN ;                                                                   //rem
            }
            System.out.println("min = " + minN) ;                                                               //rem

            int sec = seconds % 3600;
            sec = sec % 60;
            String secN = sec + "s" ;                           //rem
            if (sec < 10) {//rem
                secN =  "0" + secN ;                                            //rem
            }
            System.out.println("sec = " + secN);                                        //rem

            return ( hourN  +  ":" + minN  + ":" +  secN);   //Return statement for string - rem the format.....( hourN  +  " " + minN  + " " +  secN) for adding space....//rem

        }
        else {
            return INVALID_VALUE_MESSAGE;   //USE OF CONSTANT
        }
    }

    public static String getDurationString (int seconds) {
        if (seconds >= 0){
            int min = seconds / 60;
            System.out.println("min = " + min);

            int remainingSec = seconds % 60;
            System.out.println("remainin sec = " + remainingSec);

            String check = getDurationString(min, remainingSec);
            return check;
        }
        else {
            return INVALID_VALUE_MESSAGE;           //USE OF CONSTANT
        }
    }
}

