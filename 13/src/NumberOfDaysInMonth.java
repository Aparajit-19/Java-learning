                                                    //  VERY VERY VERY IMP
                                                    
//* We cannot use relational operators (<,<=,>,>=) in switch because switch will execute the statements falling under the case which matches the
// switch argument, in this case, year is an argument which is 95 for ex but year >=90 will always evaluate to either true or false and swithch
// allow only int, short, byte, char and string hence we not use rel. operators
public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;
        } else if ((year % 4) == 0 && (year % 100) != 0) {
            return true;
        } else if ((year % 4) == 0 && (year % 100) == 0 && (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth( int month, int year) {

        if (month >= 1 && month <= 12 && year >= 1 && year <= 9999) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                return (31);
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                return (30);
            }
            else if (month == 2) {
                boolean check = isLeapYear(year);
                if (check) {
                    return (29);
                } else {
                    return (28);
                }
            }
        } else {             //likh bhi sakte hai or nahi bhi 37 to 39
            return -1;
        }
        return -1;  //yeh imp hai
    }
}


