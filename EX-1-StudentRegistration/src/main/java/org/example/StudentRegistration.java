
import javax.swing.*;
import java.awt.*;

public class StudentRegistration extends JFrame {

    JTextField nameField, rollField, emailField;
    JRadioButton male, female;
    JComboBox<String> courseBox;
    JCheckBox agreeBox;
    JButton registerButton;

    StudentRegistration() {

        setTitle("Student Registration Form");
        setSize(450, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(8, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Student Name
        panel.add(new JLabel("Student Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        // Roll Number
        panel.add(new JLabel("Roll Number:"));
        rollField = new JTextField();
        panel.add(rollField);

        // Email
        panel.add(new JLabel("Email:"));
        emailField = new JTextField();
        panel.add(emailField);

        // Gender
        panel.add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel();

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        genderPanel.add(male);
        genderPanel.add(female);
        panel.add(genderPanel);

        // Course
        panel.add(new JLabel("Course:"));

        String[] courses = {
                "B.Tech", "BCA", "BBA", "MCA", "MBA"
        };

        courseBox = new JComboBox<>(courses);
        panel.add(courseBox);

        // Agreement
        panel.add(new JLabel("Terms and Conditions:"));
        agreeBox = new JCheckBox("I agree");
        panel.add(agreeBox);

        // Register Button
        panel.add(new JLabel(""));

        registerButton = new JButton("Register");
        panel.add(registerButton);

        // Button Action
        registerButton.addActionListener(e -> {

            String name = nameField.getText().trim();
            String roll = rollField.getText().trim();
            String email = emailField.getText().trim();

            String gender = "";

            if (male.isSelected()) {
                gender = "Male";
            } else if (female.isSelected()) {
                gender = "Female";
            }

            String course = (String) courseBox.getSelectedItem();

            if (name.isEmpty() || roll.isEmpty()
                    || email.isEmpty() || gender.isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please fill all the fields!"
                );

            } else if (!email.contains("@")
                    || !email.contains(".")) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please enter a valid email!"
                );

            } else if (!agreeBox.isSelected()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please accept the terms and conditions!"
                );

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "Registration Successful!\n\n"
                                + "Name: " + name + "\n"
                                + "Roll Number: " + roll + "\n"
                                + "Email: " + email + "\n"
                                + "Gender: " + gender + "\n"
                                + "Course: " + course
                );
            }
        });

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
                new StudentRegistration()
        );
    }
}
