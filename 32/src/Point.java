//Acc. to ques this point means field together as (x,y) of Point class.
//under root is same as square root
public class Point {

    private int x;
    private int y;

    public Point () {

    }

    public Point (int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x; // here x is field as x of above method is access in their method only
    }

    public int getY() {
        return y; //in getter method this.y is also that field and simple y is also that field so this.y likhe ya simple y dono same field hee hai.....
    }

    public void setX(int x ) {
        this.x = x;
        //but in setter method this.x is field but simple x is par so here simple x is not used in place of this.x (and if we use simple x inplace of
        // this.x then par is assigned to itself)
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance (){
        double distance = Math.sqrt((this.x)*(this.x) + (this.y)*(this.y));//((this.x)*(this.x) + (this.y)*(this.y))...REM THIS WAY
        return distance;
    }

    public double distance (int x, int y){
        double distance = Math.sqrt((this.x - x)*(this.x - x) + (this.y - y)*(this.y - y));
        return distance; //var declared inside method not access outside the method
        //but var value can be returned
    }
    //double type value returns from method that's why double is used(same concept used when other type value returns) and if nothing return void is used.
    public double distance (Point another){
        return distance(another.x, another.y); //calling 2nd method.
    }
}

//Last method: (Actual concept)
  // Here, Point used is class - Point(yeh wala hee)
  // another is object name
  // Point another...... is object declared with no constructor and no new keyword.
  // another.x is actually object.field
  // Same concept with another.y
  // Point another used in this method is object creating from class Point.
  // And this method give distance between 1st object fields and 2nd object fields
  // type Point means class Point

// Point another used in method is object and this object is in Point class so fields of this object
      // which is private so it access only in object class is also accessed in Point class(as object class is also Point) inspite of fact that they
                                            // were private

//Object uses only class and their field & methods not values..........
//Diff object created from same class, uses class and their field & methods with diff diff values.....
//All diff objects create from same class are also totally diff from each other.