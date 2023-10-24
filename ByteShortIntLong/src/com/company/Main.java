package com.company;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;

        //PRIMITIVE DATA TYPES//

        //int//

        int myMinIntValue = Integer.MIN_VALUE; //int min value is -2147483648
        int myMaxIntValue = Integer.MAX_VALUE; //int max value is 2147483647
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Max value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;//if max value exceed i.e. 21474836478(in numeric case) intellij shows error, and we also add underscore
        int myMinIntTest = -2147483648; //if min value exceed i.e -21474836489(in numeric case), intellij shows error

        //byte//

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " +myMinByteValue);//byte min value is -128
        System.out.println("Byte Maximum Value = " +myMaxByteValue);//byte max value is 127

        //short//

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " +myMinShortValue);//short min value is -32768
        System.out.println("Short Maximum Value = " +myMaxShortValue);//short max value is 32767

        //long//

        long myLongValue = 100L;//*use L or use L in place of l(looks like 1) so that long data type will work , *here this statement
        //works even after removing L as intellij treat 100 as int by default and as we know that long is twice of int, so it contains int ranges in it easily, work similarly for int, byte and
        //short
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " +myMinLongValue);//long min value is -9223372036854775808
        System.out.println("Long Maximum Value = " +myMaxLongValue);//long max value is 9223372036854775807
        long bigLongLiteralValue = 21474836478L; //here this is max value of int and hence long accept it but if we increase from max value
        //we had to add L so that long data type will work otherwise it shows error
        System.out.println(bigLongLiteralValue);

                   //conversion of primitive data types//

        short bigShortLiteralValue = 32767;// if we put 32768 with short type, it shows error because it not fit in short range, here compiler
        //shows int provided and short required as hint and if put 32767 it fit in short type.

                  //casting

            int myTotal = (myMinIntValue / 2);

            byte myNewByteValue = (byte) (myMinByteValue / 2);//*byte myNewByteValue = (myMinByteValue / 2); this command shows error, knowing fact
            //that {(myMinByteValue / 2)}- this value lie in range of byte by my own not computer. This is due to the reason that {(myMinByteValue / 2)}- this is
            //variable divided by 2 which is whole a variable which is assign to new variable and by default intellij think {(myMinByteValue / 2)} as int and therefore
            //think like assigning byte primitive data type to int type range hence show error. Note after compiling value takes place of its own
            //variable name.
            //*on declaring new variable with numeric as assign value then no problem in deciding primitive data type
            //*but on declaring new variable with taking variable(whole) as assign value i.e. line 58 after //, intellij take variable(whole) which is assign
            //value as int as default.Now {(myMinByteValue / 2)}- this is variable divided by 2 which is assign to new variable and by default
            // intellij think {(myMinByteValue / 2)} as int and therefore think like assigning byte primitive data type to int type range hence
            //show error.
            //*to remove error or the problem of default is solved by casting as shown in line 58 for other primitive data types like see line 58,70
            //variable(whole) which is assign as value. when it is variable then is considered as int by default by intellij
            short myNewShortValue = (short) (myMinShortValue / 2);
            //int range not fits in short hence show error

            //practice//

        byte myByte = 10;
        short myShort = 20;
        int myInteger =  500;
        long myLong = (50000 + 10 * (myByte + myShort + myInteger));
        //*(50000 + 10 * (myByte + myShort + myInteger)) is variable and hence considered as int by default. If int myInteger, byte myByte, short myShort =  small values then 10 * (myByte + myShort + myInteger)
        //not exceeding int range hence no warning with yellow highlight and if large value then warning
        //*on declaring variable with long, if it assigns numeric value, and it is greater than max limit of int then we add L otherwise error
        //*here we declare variable with long and value we assign is whole considered as int therefore on declaring statement it is not showing error as int range fit in long .
        //(50000 + 10 * (myByte + myShort + myInteger)) i.e complete value after = is considered as int by default including variable involved in complete value
        //(50000L + 10L * (myByteI + myShortI + myIntegerI)) is considered int as default and int range fits well in long so need of casting
        System.out.println(myLong);

        byte myByteI = 10;
        short myShortI = 20;
        int myIntegerI =  500000000;
        long myLongI = (50000L + 10L * (myByteI + myShortI + myIntegerI));//byte myByteI = 10; short myShortI = 20; int myIntegerI =  500000000; taking
        //these value show warning as it exceeds range of int so add L with numbers not variables for long to work.
        System.out.println(myLongI);

        short myTotalI = (short) (1000 + 10 *
                (myByte + myShort + myInteger)); //we also  do like this same statement in 2 lines
        //* 1000 + 10 * (myByte + myShort + myInteger) is int by default and int range not fits
        //in short hence error{plz casting basics consider} and therefore casting is used
        // (1000 + 10 * (myByte + myShort + myInteger)) i.e complete value after = consider whole as int by default including variable involved in complete value
    }
}
