public class Main { //iske bina bhi run nahi karega
    public static void main(String[] args) {

        //Drawing hai apne pass , sab saman hai and machines bhi hai...........abb bas building banani hai...chalo firr

        Person name = new Person();//rem the way of object declaration...
        // yaha par bata diya gaya hai naya building ban raha hai, jo drawing use kar raha hai person, toh woh issi ka saman and machine use karega

                                                    //REM THE WAY HOW I CALL

        //yaha drawing mention nahi hota hai sirf building hota hai and sab saman and machines use hota hai

        name.setFirstName("Aparajit"); //String hai par and yeh double quotes me ata hai
        name.setLastName("Sharan");// set method void hai toh kuch return nahi hoga
        name.setAge(21);
        String check = name.getFirstName();//String returned hoga so string type liya hai
        System.out.println(check);
        String check1 = name.getLastName();//String returned hoga so string type liya hai
        System.out.println(check1);
        int check2 = name.getAge();//int returned hoga so int type liya hai
        System.out.println(check2);




    }
}
// name.setFirstName("Aparajit"); means name object ke liye maine first name set kiya hai aparajit aisa and sabhi me yehi concept use hoga
//Iss drawing and sab saman and machines se hum bahot saree naye naye building jo ek dusre se bilkul alag honge(i.e all with diff values)(by using new keyword and new object name again) bana sakte hai....and then same things repeat in same as way