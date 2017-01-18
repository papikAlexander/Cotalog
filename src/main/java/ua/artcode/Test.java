package ua.artcode;

import ua.artcode.controller.MainFrameController;
import ua.artcode.dao.ContactJsonDao;
import ua.artcode.model.TypeNumber;
import ua.artcode.utils.FileSaver;
import ua.artcode.view.MainFrame;

/**
 * Created by Alexander on 13.12.2016.
 */
public class Test {
    public static void main(String[] args) {
        MainFrameController frameController = new MainFrameController(new MainFrame(), new ContactJsonDao
                (new FileSaver("C:\\Users\\Alexander\\IdeaProjects\\Catalog\\src\\main\\resources\\contact.txt")));
        frameController.run();
        /*SimpleGUI app = new SimpleGUI();
        app.setVisible(true);*/

    }
}

