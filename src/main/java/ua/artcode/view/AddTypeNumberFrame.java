package ua.artcode.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Alexander on 13.12.2016.
 */
public class AddTypeNumberFrame extends JFrame {

    private JTextField edit = new JTextField(15);
    private JLabel editLabel = new JLabel("New number type");
    private JButton add = new JButton("Add");
    private JButton cancel = new JButton("Cancel");

    public AddTypeNumberFrame(){
        setTitle("Add number types");
        setResizable(false);
        setSize(new Dimension(600, 400));
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(15,15,15,15);

        constraints.fill = GridBagConstraints.BOTH;

        constraints.gridx = 0;
        constraints.gridy = 0;
        add(editLabel, constraints);

        constraints.gridx = 1;
        add(edit, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        add(add, constraints);

        constraints.gridx = 1;
        add(cancel, constraints);

        pack();

    }

    public JTextField getEdit() {
        return edit;
    }

    public JButton getAdd() {
        return add;
    }

    public JButton getCancel() {
        return cancel;
    }
}
