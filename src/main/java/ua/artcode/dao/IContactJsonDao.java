package ua.artcode.dao;

import ua.artcode.model.Contact;

import java.util.List;

/**
 * Created by Alexander on 13.12.2016.
 */
public interface IContactJsonDao {

    boolean saveContact(Contact contact);
    boolean deleteContact(Contact contact);
    List<Contact> read();

}
