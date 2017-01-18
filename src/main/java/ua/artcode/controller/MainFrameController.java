package ua.artcode.controller;

import ua.artcode.dao.ContactJsonDao;
import ua.artcode.dao.IContactJsonDao;
import ua.artcode.utils.FileSaver;
import ua.artcode.view.AddFrame;
import ua.artcode.view.AddTypeNumberFrame;
import ua.artcode.view.MainFrame;

/**
 * Created by Alexander on 13.12.2016.
 */
public class MainFrameController {

    private MainFrame frame;
    private IContactJsonDao dao;

    public MainFrameController(MainFrame mainFrame, IContactJsonDao dao) {
        this.frame = mainFrame;
        this.dao = dao;

       /* frame.getAddTypePhoneButton().addActionListener(e -> {
            AddTypeNumberFrameController controller = new AddTypeNumberFrameController(new AddTypeNumberFrame(), new ContactJsonDao(new FileSaver("")));
            controller.run();
        });*/

        frame.getAddButton().addActionListener(e -> {
            AddFrameController controller = new AddFrameController(new AddFrame(), new ContactJsonDao
                    (new FileSaver("C:\\Users\\Alexander\\IdeaProjects\\Catalog\\src\\main\\resources\\contact.txt")));
            controller.run();
        });


    }

    public  void run(){
        frame.setVisible(true);
    }
}
