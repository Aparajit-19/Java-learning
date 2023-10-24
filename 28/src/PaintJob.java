public class PaintJob {
    //value of finalBuckets return in this method which is int thats why int is used instead of void
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double area = width * height;
        double areaCovered = areaPerBucket * extraBuckets;
        double remainingArea = area - areaCovered;
        double requiredBucket = remainingArea / areaPerBucket;
        double Buckets = Math.ceil(requiredBucket);
        int finalBuckets = (int) Buckets;
        return finalBuckets;//return finalBuckets; means value of finalBuckets return which is int
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        double requiredBuckets = area / areaPerBucket;
        double Buckets = Math.ceil(requiredBuckets);
        int finalBuckets = (int) Buckets;
        return finalBuckets;
    }

    public static int getBucketCount(double area, double areaPerBucket) {//declared for this method only

        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double requiredBuckets = area / areaPerBucket;
        double Buckets = Math.ceil(requiredBuckets);
        int finalBuckets = (int) Buckets;
        return finalBuckets;
    }
}
//Here, in method3, we want Buckets which is in double to be an int so we use casting like-
               // int finalBuckets = (int) Buckets;

//Var which declared in 1 method is access in that method only.........we use same name of var in other method also which is totally diff from previous
// method var







