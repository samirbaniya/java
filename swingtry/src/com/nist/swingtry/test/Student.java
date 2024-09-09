package com.nist.swingtry.test;

import javax.swing.*;

public class Student {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setTitle("Student Form");
        frame.setLayout(null);

        // Name
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(10, 10, 100, 30);
        frame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(120, 10, 200, 30);
        frame.add(nameField);

        // Class
        JLabel classLabel = new JLabel("Class:");
        classLabel.setBounds(10, 50, 100, 30);
        frame.add(classLabel);

        JTextField classField = new JTextField();
        classField.setBounds(120, 50, 200, 30);
        frame.add(classField);

        // Age
        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(10, 90, 100, 30);
        frame.add(ageLabel);

        JTextField ageField = new JTextField();
        ageField.setBounds(120, 90, 200, 30);
        frame.add(ageField);

        // Gender
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(10, 130, 100, 30);
        frame.add(genderLabel);

        String[] genders = {"Male", "Female", "Other"};
        JComboBox<String> genderComboBox = new JComboBox<>(genders);
        genderComboBox.setBounds(120, 130, 200, 30);
        frame.add(genderComboBox);

        // Address
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(10, 170, 100, 30);
        frame.add(addressLabel);

        JTextField addressField = new JTextField();
        addressField.setBounds(120, 170, 200, 30);
        frame.add(addressField);

        // Phone Number
        JLabel phoneLabel = new JLabel("Phone Number:");
        phoneLabel.setBounds(10, 210, 100, 30);
        frame.add(phoneLabel);

        JTextField phoneField = new JTextField();
        phoneField.setBounds(120, 210, 200, 30);
        frame.add(phoneField);

        // Submit Button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(120, 250, 100, 30);
        frame.add(submitButton);

        // Frame settings
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
