
import java.util.ArrayList;
import java.util.List;

public class Logic{
    private final List<Contact> contacts = new ArrayList<>();
    
    public static boolean isDigitsOnly(String s){
        if(s.isEmpty() || s == null){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) < '0' || s.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }

    public boolean isPhoneNumberAvailable(String phoneNumber){
        for(Contact contact : this.contacts){
            if(contact.getPhone().equals(phoneNumber)){
                return false;
            }
        }
        return true;
    }

    public Contact addContact(String name, String phone, String email){
        if(name == null || name.isEmpty()){
            return null;
        }
        if(!isDigitsOnly(phone) || phone.length() < 9 || phone.length() > 11 || !isPhoneNumberAvailable(phone)){
            return null;
        }
        if(email == null || email.isEmpty() || !email.contains("@")){
            return null;
        }

        Contact contact = new Contact(name, phone, email);
        this.contacts.add(contact);
        return contact;
    }

    public List<Contact> searchContactsByName(String name) {
        List<Contact> matchingContacts = new ArrayList<>();
        for (Contact contact : contacts){
            if(contact.getName().toLowerCase().contains(name.toLowerCase())){
                matchingContacts.add(contact);
            }
        }
        return matchingContacts;
    }

    public List<Contact> getAll(){
        return new ArrayList<>(this.contacts);
    }

}