package ua.artcode.controller;

import ua.artcode.dao.IContactJsonDao;
import ua.artcode.model.Contact;
import ua.artcode.model.TypeNumber;
import ua.artcode.view.AddFrame;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by Alexander on 14.12.2016.
 */
public class AddFrameController {

    private AddFrame frame;
    private IContactJsonDao dao;
    private Contact contact;

    public AddFrameController(AddFrame frame, IContactJsonDao dao) {
        this.frame = frame;
        this.dao = dao;

        frame.getCancelButton().addActionListener(e -> frame.setVisible(false));
        frame.getAddButton().addActionListener(e -> {
            ArrayList phone = new ArrayList();

            phone.add(frame.getPhone().getText());
            phone.add(frame.getPhone2().getText());
            phone.add(frame.getPhone3().getText());
            System.out.println(
            new Contact(frame.getNameText().getText() + " " + frame.getSurname().getText(),
                    frame.getAddress().getText(),
                    phone,
                    frame.getSkype().getText(),
                    frame.getNameGroup().getText(),
                    new Date(System.currentTimeMillis())));

        });


    }

    public void run(){
        frame.setVisible(true);
    }
}
