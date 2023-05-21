package Phonebook;

public class AppPhone {
    public static void main(String[] args) {
        PhoneBook phoneBook =new PhoneBook();
        phoneBook.add("Ivan", "0966891531");
        phoneBook.add("Pavel", "0966891532");
        phoneBook.add("Dan", "0966891533");
        phoneBook.add("Pavel", "0966891535");
        phoneBook.add("Pavel", "0966891536");
        phoneBook.showRecordList();
        System.out.println("\nFirst number - " + phoneBook.find("Pavel"));
        System.out.println("\nNumbers " + phoneBook.findAll("Pavel"));;

    }


}
