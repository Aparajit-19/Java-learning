                                                   //FOR UNDERSTANDING PURPOSE
public class ClassA extends Object  {
}

//IMP. POINTS:
//-All classes(i.e. every single class we create) in java is automatically inheriting from java supplied class called Object class.
//-If we're writing(like this with Object class) or not writing the keyword extends after class name, that class is automatically inheriting from java supplied class called Object class.
//-Right click on mouse inside the class > Generate....> Override Methods.....> then all methods shown under class: java.lang.Object are the methods that class will inherit automatically whether
// class use extends keyword or not.
//-java.lang.Object is Object class(i.e. java supplied class) from which all classes inherit automatically.


                                                        //********************//


// Challenge ques.:
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.