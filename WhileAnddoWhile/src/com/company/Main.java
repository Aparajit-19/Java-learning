//While statement is same as that of for statement, means while statements do all works of for statement but have different way of writing.
//13-17 and 20-22 and 32-34 and 68-74 are same but 26-28 is different .
//*Variable declared outside of code block can be accessed inside of code block and also have changes in their value due to conditions and this changed value of variable, accessed outside
//of code block also but this things not happen with variable declared inside of code block, i.e it cannot accessed outside of code block.
//of code block also but this things not happen with variable declared inside of code block, i.e it cannot accessed outside of code block.
//* In while statement, rem to define a variable outside of code block and then incremented it inside of code block.
//If not incremented, it give infinite loop as condition not proceed and cond which we left with is always true on checking hence repeat same result.
package com.company;
public class Main {

    public static void main(String[] args) {
//1                                                        //WHILE STATEMENT
        int count = 0;
        while (count != 5) { //while means jab
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println("**************");
                                                        //FOR STATEMENT
        for (int i = 0; i < 5; i++) {
            System.out.println("Count value is " + i);
        }

        System.out.println("**************");

        for (int i = 0; i < 5; i++) {
            System.out.println("Count value is " + count); //It print 5 in whole loop because after while statement completed, count has 5 as value and this line is print only this because it dont have any relation which for cond as for is defined for i only.
        }

        System.out.println("**************");

        for (count = 0; count < 5; count++) {
            System.out.println("Count value is " + count);
        }

        System.out.println("**************");


                                            //ANOTHER WAY FOR WRITING SAME WHILE STATEMENT THAT IS DEFINED ABOVE
//2
        count = 0;//After while statement completed which was defined above count have 5 as value, if we use count again it uses 5 as value for count that why we again defined value for count as 0.
        while (true) { //It means processing a infinite loop with given cond, as print Count value is 0, 1, 2, 3..................never end...false means reverse of true
            if (count == 5) { //This cond is used to stop that infinite loop at this cond
                break;//It used to terminates the loop.
            }
            System.out.println("Count value is " + count);
            count++;
        }
//3
        count = 5;//It means variable already declare with some assigning value, here we give that variable a new value thats it......
        while (count != 5) {
            System.out.println("Count value is " + count);
            count++; //It prints nothing and there is no increment in count as cond turns false hence loop not moves forward....
        }

        for (int i = 5; i !=5; i++){
            System.out.println("Count value is " + i ); //Same as that of, exact above while statement
        }

//4
       count = 6;
        while (count != 5) {
            System.out.println("Count value is " + count);
            count++; //It forms a infinite value as given con never turns false
        }
                                                            //DO WHILE STATEMENT

        count = 0;
        do {
            System.out.println("Count value was " + count);
            count++;
        }
        while (count !=5);//It uses here to stop loop at this point.

//*As going to code block of do with count = 5 and increment the count by 1, now count = 6, and after this we go into code block of while and now this
//cond never achieves i.e. 6 always not equal to 5 and also not 7,8,9,..........so loop never stops
        count = 5;
        do {
            System.out.println("Count value was " + count);
            count++;
        }
        while (count !=5);//It gives infinite loop as this condition never true.

                                                                //REM THIS
        count = 5;
        do {
            System.out.println("Count value was " + count);
            count++;
            if (count > 100){
                break;
            }
        }
        while (count !=5);//This never take itno consideration as count already exceeds 5.


    }

}


