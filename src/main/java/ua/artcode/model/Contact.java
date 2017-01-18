package ua.artcode.model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


/**
 * Created by Alexander on 13.12.2016.
 */
public class Contact {
    private String fullName;
    private String address;
    private ArrayList<String> phone;
    private String skype;
    private String nameGroup;
    private Date dateCreate;
    private Date dateEdit;

   /* public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis());
        System.out.println(date);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        date = new Date();
        System.out.println(date);
    }*/

    public Contact(String fullName, String address, ArrayList phone, String skype,
                    String nameGroup, Date dateCreate) {

        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
        this.skype = skype;
        this.nameGroup = nameGroup;
        this.dateCreate = dateCreate;
    }
    public Contact(Date dateEdit, String fullName, String address, ArrayList phone,
                   String skype, String nameGroup) {

        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
        this.skype = skype;
        this.nameGroup = nameGroup;
        this.dateEdit = dateEdit;
    }


    /*public void addTypePhone(String name){
        phone.add(name);
    }*/

    @Override
    public String toString() {
        return "Contact{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", skype='" + skype + '\'' +
                ", nameGroup='" + nameGroup + '\'' +
                ", dateCreate=" + dateCreate +
                ", dateEdit=" + dateEdit +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (!fullName.equals(contact.fullName)) return false;
        return address.equals(contact.address);

    }

    @Override
    public int hashCode() {
        int result = fullName.hashCode();
        result = 31 * result + address.hashCode();
        return result;
    }
}
