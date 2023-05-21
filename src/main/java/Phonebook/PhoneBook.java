package Phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    List<Record> record2List = new ArrayList<>();


    public void add(String name, String phone) {
        Record record2 = new Record();
        record2.setName(name);
        record2.setPhone(phone);
        record2List.add(record2);
    }

    public String find(String name) {
        String phone = null;
        for (Record record2 : record2List) {
            if (record2.getName() == name) {
                phone = record2.getPhone();
                System.out.println("\nName: " + record2.getName() + " - phone: " + record2.getPhone());
                break;
            }

        }
        return phone;
    }

    public List<String> findAll(String name) {
        List<String> phoneNumber = new ArrayList<>();
        for (Record record2 : record2List) {
            if (record2.getName() == name) {
                phoneNumber.add(record2.getPhone());
                System.out.println("\nName: " + record2.getName() + " - phone: " + record2.getPhone());
            }
        }
        return phoneNumber;
    }

    public void showRecordList() {
        for (Record record2 : record2List) {
            System.out.println("Name - " + record2.getName() + " phone - " + record2.getPhone());
        }
    }

}
