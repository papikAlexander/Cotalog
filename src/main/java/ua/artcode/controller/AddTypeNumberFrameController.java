package ua.artcode.controller;

import ua.artcode.dao.IContactJsonDao;
import ua.artcode.model.Contact;
import ua.artcode.model.TypeNumber;
import ua.artcode.view.AddTypeNumberFrame;

import javax.swing.*;
import java.util.List;

/**
 * Created by Alexander on 14.12.2016.
 */
public class AddTypeNumberFrameController {
    private AddTypeNumberFrame frame;
    private IContactJsonDao dao;
    private List<Contact> list;
    TypeNumber typeNumber = new TypeNumber();

    public AddTypeNumberFrameController(AddTypeNumberFrame frame, IContactJsonDao dao) {
        this.frame = frame;
        this.dao = dao;

       /* frame.getAdd().addActionListener(e -> {
            list = dao.read();

            for (Contact iter: list) {
                iter.addTypePhone(frame.getEdit().getText());
            }

            typeNumber.print();
            frame.setVisible(false);
        });*/

        frame.getCancel().addActionListener(e -> frame.setVisible(false));
    }

    public void run(){
        frame.setVisible(true);
    }
}
