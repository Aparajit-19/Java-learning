public class Main {
    public static void main(String[] args) { //without this code not run.

        //returns int from 1st method so here we assign that returned value to new var check, obviously of type int as int return thats why
        int check = PaintJob.getBucketCount(3.4,2.1,1.5,2);
        System.out.println(check);

        int check1 = PaintJob.getBucketCount(3.4,2.1,1.5);
        System.out.println(check1);

        int check3 = PaintJob.getBucketCount(6.26,2.2);//PaintJob.getBucketCount(6.26,2.2); rem this how to call
        System.out.println(check3);
    }
}
