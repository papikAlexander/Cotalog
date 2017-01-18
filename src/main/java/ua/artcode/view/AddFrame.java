package ua.artcode.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Alexander on 13.12.2016.
 */
public class AddFrame extends JFrame{

    private JTextField name = new JTextField(15);
    private JTextField surname = new JTextField(15);
    private JTextField address = new JTextField(15);
    private JTextField phone = new JTextField(15);
    private JTextField phone2 = new JTextField(15);
    private JTextField phone3 = new JTextField(15);
    private JTextField skype = new JTextField(15);
    private JTextField nameGroup = new JTextField(15);

    private JLabel nameLabel = new JLabel("Name:");
    private JLabel surnameLabel = new JLabel("Surname:");
    private JLabel addressLabel = new JLabel("Address:");
    private JLabel phoneLabel = new JLabel("Phone:");
    private JLabel skypeLabel = new JLabel("Skype:");
    private JLabel nameGroupLabel = new JLabel("Name group:");

    private JButton addButton= new JButton("Add");
    private JButton addTypePhone= new JButton("Add a new phone");
    private JButton cancelButton = new JButton("Cancel");

    public AddFrame(){
        setTitle("Add new contact");
        setResizable(false);
        setSize(new Dimension(600, 400));
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5,15,5,15);

        constraints.fill = GridBagConstraints.BOTH;

        constraints.gridx = 0;
        constraints.gridy = 0;
        add(nameLabel, constraints);

        constraints.gridx = 1;
        add(name, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        add(surnameLabel, constraints);

        constraints.gridx = 1;
        add(surname, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        add(addressLabel, constraints);

        constraints.gridx = 1;
        add(address, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        add(phoneLabel, constraints);

        constraints.gridx = 1;
        add(phone, constraints);

        constraints.gridy = 4;
        add(phone2, constraints);

        constraints.gridy = 5;
        add(phone3, constraints);

        constraints.gridx = 0;
        constraints.gridy = 6;
        add(skypeLabel, constraints);

        constraints.gridx = 1;
        add(skype, constraints);

        constraints.gridx = 0;
        constraints.gridy = 7;
        add(nameGroupLabel, constraints);

        constraints.gridx = 1;
        add(nameGroup, constraints);

        constraints.gridx = 0;
        constraints.gridy = 8;
        add(addButton, constraints);

        constraints.gridx = 1;
        add(addTypePhone, constraints);

        constraints.gridy = 9;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add(cancelButton, constraints);

        pack();


    }
    public JTextField getNameText() {
        return name;
    }

    public JTextField getSurname() {
        return surname;
    }

    public JTextField getAddress() {
        return address;
    }

    public JTextField getPhone() {
        return phone;
    }

    public JTextField getPhone2() { return phone2;}

    public JTextField getPhone3() {
        return phone3;
    }

    public JTextField getSkype() {
        return skype;
    }

    public JTextField getNameGroup() {
        return nameGroup;
    }

    public JButton getAddTypePhone() {return addTypePhone;}

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }
}
