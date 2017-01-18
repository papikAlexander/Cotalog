package ua.artcode.dao;

import ua.artcode.model.Contact;
import ua.artcode.utils.FileSaver;

import java.util.List;

/**
 * Created by Alexander on 13.12.2016.
 */
public class ContactJsonDao implements IContactJsonDao {

    private FileSaver fileSaver;

    public ContactJsonDao(FileSaver fileSaver) {
        this.fileSaver = fileSaver;
    }

    @Override
    public boolean saveContact(Contact contact) {

        List<Contact> contacts = fileSaver.read();

        if(!contacts.contains(contact)){
            contacts.add(contact);
            fileSaver.save(contacts);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteContact(Contact contact) {

        return fileSaver.delete(contact);
    }

    @Override
    public List<Contact> read() {
        return fileSaver.read();
    }
}
