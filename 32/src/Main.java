public class Main {

    public static void main(String[] args) {

        Point object = new Point(2,4);//1st object declare by using Point class
        Point object2 = new Point(1,2);//2nd object declare by using Point class

        System.out.println(object.getX());

        System.out.println(object.getY());

        System.out.println(object.distance());

        System.out.println(object.distance(1,2));

        System.out.println(object.distance(object2));//here by putting object2 (which we create) in place of parameter value what we do is actually
        // iss object ko uss object ke equal kardiya jisse ki abb yeh dono object same ho gaye......

        //line 16 me hume parameter another of type Point ki value rakhni thi par humne object2 rakh diya jisse ki kuch aisaa hua:-
        // Point another = object2
        //matlab abb dono object same ho gaye......
    }
}
