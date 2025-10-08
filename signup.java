import javax.swing.*;
import java.awt.*;
public class signup {
public static void main(String []args)
{
	JFrame mainFrame=new JFrame();
	mainFrame.setTitle("SignUp From");
	JPanel mainPanel =new JPanel();
	mainPanel.setLayout(new GridLayout(7,2,1,1));
	JLabel newLabel=new JLabel("Name");
	JTextField nameField=new JTextField();
	JLabel emailLabel=new JLabel("Email");
	JTextField emailField=new JTextField();
	JLabel genderLabel=new JLabel("Gender");
	JRadioButton male =new JRadioButton("Male");
	JRadioButton female= new JRadioButton("Female");
	ButtonGroup genButtonGroup =new ButtonGroup();
	genButtonGroup.add(male);
	genButtonGroup.add(female);
	JPanel genderPanel=new JPanel();
	genderPanel.setLayout(new FlowLayout());
	genderPanel.add(male);
	genderPanel.add(female);
	JLabel countryLabel=new JLabel("Country");
	String[] countries= {"India","USA","Israel","Rome"};
	JComboBox<String> countryBox=new JComboBox<>(countries);
	JLabel addressLabel=new JLabel("Address");
	JTextArea addressArea= new JTextArea(3,4);
	JButton submitButton = new JButton("Submit");
    mainPanel.add(newLabel);
    mainPanel.add(nameField);
    mainPanel.add(emailLabel);
    mainPanel.add(emailField);
    mainPanel.add(genderLabel);
    mainPanel.add(genderPanel);
    mainPanel.add(countryLabel);
    mainPanel.add(countryBox);
    mainPanel.add(addressLabel);
    mainPanel.add(addressArea);
    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    buttonPanel.add(submitButton);
    mainPanel.add(buttonPanel);
	mainFrame.add(mainPanel);
	mainFrame.setLocationRelativeTo(null);
	mainFrame.setVisible(true);
}
}