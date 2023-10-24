public class Person { //class ke andar hee sab likha jata hai ex- methods, fields, objects and so on.....

    private String firstName; //getFirstName me FirstName yeh wala hee hai
    private String lastName;
    private int age;

    public String getFirstName () {//value of this.firstName var is firstName which is String so String returns
        return this.firstName; //this.firstName is var whose value is firstName
    }

    public String getLastName () {
        return this.lastName;
    }

    public int getAge () {
        return this.age;
    }

    public void setFirstName (String firstName ) {//firstName is parameter of type String
        this.firstName = firstName;// here we assign value(which is value of parameters String firstName) to field firstName
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public void setAge (int age) {//set method not return anything so void is used
        this.age = age;
        if ( age < 0 || age > 100){
            this.age = 0;
        }
    }

    public boolean isTeen () { //returns boolean value thats why boolean used
        if ( this.age > 12 && this.age < 20){ //here we set range within this.age var lies
            return true;
        } else {
            return false;
        }
    }

    public String getFullName () {//return string ho raha hai thats why string is used
        if ( this.firstName.equals(" ") && this.lastName.equals(" ")){
            return " ";// empty String means - " ".
        }
        else if (this.lastName.equals("")){
            return this.firstName;
        }
        else if (this.firstName.equals("")){
            return this.lastName;
        } else {
            return this.firstName+ " " +this.lastName; //rem this and i use + " " + for space between both first and last name
        }
    }
}
//Pahle set hota firr get hota hai...
// this.firstName.equals(" ") means this.firstName var value equals equals " "(empty string) then-

