public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays (long minutes) {
        if (minutes >= 0){
            long year = (long) (minutes / 525600);

            long days = (long) (minutes % 525600);
            days = (long) (days / 1440);

            System.out.println(minutes + " min = " + year + " y and " + days + " d");
        }
        else {
            System.out.println("Invalid Value");
        }
    }
}
