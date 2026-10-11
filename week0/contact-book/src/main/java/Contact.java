public class Contact{
    private static int idCounter = 0;
    private final int id;
    private String name;
    private String phone;
    private String email;

    public Contact(){
        idCounter++;
        this.id = idCounter;
    }

    public Contact(String name, String phone, String email){
        this();
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayContactInfo() {
        System.out.print("Contact ID: " + id);
        System.out.print(", Name: " + name);
        System.out.print(", Phone: " + phone);
        System.out.print(", Email: " + email);
        System.out.println();
    }
}