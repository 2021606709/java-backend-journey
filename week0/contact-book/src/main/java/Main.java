
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Logic logic = new Logic();      
        Scanner scanner = new Scanner(System.in);
        
        int choice = 0;
        System.out.println("Chao mung ban den voi chuong trinh quan ly danh ba");
        while(choice != 4){
            System.out.println("1. Them danh ba");
            System.out.println("2. Tim kiem danh ba theo ten");
            System.out.println("3. Hien thi tat ca danh ba");
            System.out.println("4. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            switch(choice){
                case 1: 
                    System.out.print("Nhap ten: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhap so dien thoai: ");
                    String phone = scanner.nextLine();
                    System.out.print("Nhap email: ");
                    String email = scanner.nextLine();
                    if(logic.addContact(name, phone, email) != null){
                        System.out.println("Them danh ba thanh cong!");
                    }else{
                        System.out.println("Them danh ba that bai! Vui long kiem tra lai thong tin.");
                    }   
                    break;
                case 2:
                    System.out.println("Nhap ten can tim kiem: ");
                    String searchName = scanner.nextLine();
                    List<Contact> matchingContacts = logic.searchContactsByName(searchName);
                    if(matchingContacts.isEmpty()){
                        System.out.println("Khong tim thay danh ba nao voi ten: " + searchName);
                    }else{
                        System.out.println("Danh ba tim thay:\n");
                        for(Contact c : matchingContacts){
                            c.displayContactInfo();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Tat ca danh ba:\n");
                    logic.getAll().forEach(Contact::displayContactInfo);
                    break;
                case 4:
                    System.out.println("Cam on ban da su dung chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le! Vui long thu lai.");
            }
        }
    }
}