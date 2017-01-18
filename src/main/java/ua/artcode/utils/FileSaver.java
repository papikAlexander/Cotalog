package ua.artcode.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ua.artcode.model.Contact;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander on 13.12.2016.
 */
public class FileSaver {
    private String path;
    private Gson gson;

    public FileSaver(String path) {

        this.path = path;
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public List<Contact> read() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            List<Contact> contacts = gson.fromJson(br, new TypeToken<List<Contact>>(){}.getType());
            if (contacts == null){
                contacts = new ArrayList<>();
            }
            return contacts;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void save(List<Contact> contacts){

        String json = gson.toJson(contacts);

        try (FileWriter writer = new FileWriter(path)){
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean delete(Contact contact){
        List<Contact> contacts = read();
        boolean result = contacts.remove(contact);
        save(contacts);
        return result;
    }
}
