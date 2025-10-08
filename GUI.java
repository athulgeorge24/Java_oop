package newproject;

import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame();
        mainFrame.setSize(300, 300);
        mainFrame.setTitle("My First GUI");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout());

        mainFrame.add(panel);
        panel.aetLayout(new GridLayout(3,2,10,10));
        JLabel userLabel= new JLabel("User name");
        JTextField userField=new JTextField;
        JLabel pwdLabel("Password");
        JPasswordField pwdField=new JPasswordField();
        JButton loginButton=new JButton("Login");
        panel.add(userLabel);
        panel.add(userField);
        panel.add(pwdLabel);
        panel.add(pwdField);
        panel.add(new JLabel(""));
        panel.add(loginButton);
        mainFrame.add(panel);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }
}
