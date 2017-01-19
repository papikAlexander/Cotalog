package ua.artcode.view;

import ua.artcode.controller.AddFrameController;
import ua.artcode.dao.ContactJsonDao;
import ua.artcode.utils.FileSaver;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Alexander on 13.12.2016.
 */
public class AddFrame extends JFrame{

    int numberPhoneType = 0;
    private JTextField name = new JTextField(15);
    private JTextField surname = new JTextField(15);
    private JTextField address = new JTextField(15);
    private JTextField phone = new JTextField(15);
    private JTextField phone2 = new JTextField(15);
    private JTextField phone3 = new JTextField(15);
    private JTextField phone4 = new JTextField(15);
    private JTextField phone5 = new JTextField(15);
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

    public AddFrame(int numberPhoneType){
        this.numberPhoneType = numberPhoneType;
        setTitle("Add new contact");
        setResizable(false);
        setSize(new Dimension(1000, 1000));
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5,15,5,15);
        int position = constraints.gridy;
        constraints.fill = GridBagConstraints.BOTH;

        constraints.gridx = 0;
        constraints.gridy = 0;
        add(nameLabel, constraints);

        constraints.gridx = 1;
        add(name, constraints);

        constraints.gridx = 0;
        constraints.gridy ++;
        add(surnameLabel, constraints);

        constraints.gridx = 1;
        add(surname, constraints);

        constraints.gridx = 0;
        constraints.gridy ++;
        add(addressLabel, constraints);

        constraints.gridx = 1;
        add(address, constraints);

        constraints.gridx = 0;
        constraints.gridy ++;
        add(phoneLabel, constraints);

        switch (numberPhoneType){
            case 1: numberPhoneType = 1;
                constraints.gridx = 1;
                add(phone, constraints);
                break;

            case 2: numberPhoneType = 2;
                constraints.gridx = 1;
                add(phone, constraints);

                constraints.gridy++;
                add(phone2, constraints);
                break;

            case 3: numberPhoneType = 3;
                constraints.gridx = 1;
                add(phone, constraints);

                constraints.gridy++;
                add(phone2, constraints);

                constraints.gridy ++;
                add(phone3, constraints);
                break;

            case 4: numberPhoneType = 4;
                constraints.gridx = 1;
                add(phone, constraints);

                constraints.gridy++;
                add(phone2, constraints);

                constraints.gridy ++;
                add(phone3, constraints);

                constraints.gridy ++;
                add(phone4, constraints);
                break;

            default:
                constraints.gridx = 1;
                add(phone, constraints);

                constraints.gridy++;
                add(phone2, constraints);

                constraints.gridy ++;
                add(phone3, constraints);

                constraints.gridy ++;
                add(phone4, constraints);

                constraints.gridy ++;
                add(phone5, constraints);
                break;
        }

        constraints.gridx = 0;
        constraints.gridy ++;
        add(skypeLabel, constraints);

        constraints.gridx = 1;
        add(skype, constraints);

        constraints.gridx = 0;
        constraints.gridy ++;
        add(nameGroupLabel, constraints);

        constraints.gridx = 1;
        add(nameGroup, constraints);

        constraints.gridx = 0;
        constraints.gridy ++;
        add(addButton, constraints);

        constraints.gridx = 1;
        add(addTypePhone, constraints);

        constraints.gridy ++;
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

    public JTextField getPhone4() {
        return phone4;
    }

    public JTextField getPhone5() {
        return phone5;
    }

    public JTextField getSkype() {
        return skype;
    }

    public JTextField getNameGroup() {
        return nameGroup;
    }

    public JButton getAddTypePhone() {return addTypePhone;}

    public int getNumberPhoneType(){return numberPhoneType;}

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }
}
