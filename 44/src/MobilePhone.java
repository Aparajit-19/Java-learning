import java.util.ArrayList;

public class MobilePhone{

    private String myNumber;
    private ArrayList<Contact> myContacts; //-This is the way, how we write arraylist as field.

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        myContacts = new ArrayList<Contact>(); //-This is the way of creating the object of arraylist.
    }

    public boolean addNewContact(Contact newContact){
        String newContactName = newContact.getName();
        for(int i=0; i < myContacts.size(); i++){
            String oldContactName = myContacts.get(i).getName();
            if(oldContactName == newContactName){
                return false;
            }
        }
        myContacts.add(newContact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        String oldContactName = oldContact.getName();
        for(int i=0; i < myContacts.size(); i++){
            String checkOldContactName = myContacts.get(i).getName();
            if(checkOldContactName == oldContactName){
                myContacts.set(i, newContact);
                return true;
            }
        }
        return false;
    }

    public boolean removeContact(Contact newContact){
        String newContactName = newContact.getName();
        for(int i=0; i < myContacts.size(); i++){
            String checkNewContactName = myContacts.get(i).getName();
            if(checkNewContactName == newContactName){
                myContacts.remove(i);
                return true;
            }
        }
        return false;
    }

    private int findContact(Contact newContact){
        String newContactName = newContact.getName();
        for(int i = 0; i < myContacts.size(); i++){
            String checkNewContactName = myContacts.get(i).getName();
            if(checkNewContactName == newContactName){
                return this.myContacts.indexOf(newContact);
            }
        }
        return -1;
    }

    private int findContact(String newContactName){
        for(int i = 0; i < myContacts.size(); i++){
            String checkNewContactName = myContacts.get(i).getName();
            if(checkNewContactName == newContactName){
                return  this.myContacts.indexOf(myContacts.get(i)); //-Remember very imp.
            }
        }
        return -1;
    }

    public Contact queryContact(String newContactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            String checkNewContactName = myContacts.get(i).getName();
            if (checkNewContactName == newContactName) {
                return this.myContacts.get(i);
            }
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for(int i=0; i < myContacts.size(); i++){
            System.out.println(i+1 + ". " + this.myContacts.get(i).getName() +
                    " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }

}
//NOTE:
//-Attributes means fields.
//-"Instantiates" means "creating an object.
