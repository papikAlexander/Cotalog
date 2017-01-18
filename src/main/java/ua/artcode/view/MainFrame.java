package ua.artcode.view;

import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 * Created by Alexander on 13.12.2016.
 */
public class MainFrame extends JFrame{

    private Object[] columnName = {"Full name", "Address", "Phone"};
    private Object[][] data = {
            {"Sasha Papusha", "lalka", ""},
            {"Sasha Papusha", "lalka", ""}
    };

    private JTable table;


    private JButton addButton = new JButton("Add a new contact");
    private JButton deleteButton = new JButton("Delete a contact");
    private JButton editButton = new JButton("Edit contacts");

    public MainFrame() {
        setTitle("Catalog");
        setSize(new Dimension(500, 500));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());


        table = new JTable(data, columnName);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setPreferredScrollableViewportSize(new Dimension(500, 200));

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5,30,10,30);
        constraints.gridx = 0;
        constraints.gridy = 0;

        add(scrollPane);

        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add(addButton, constraints);

        constraints.gridy = 3;
        add(deleteButton, constraints);

        constraints.gridy = 4;
        add(editButton, constraints);

       pack();

    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getDeleteButton() {
        return deleteButton;
    }

    public JButton getEditButton() {
        return editButton;
    }

}
