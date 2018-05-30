package View.Panels;

import View.Buttons.GetEscapeRootButton;
import View.Buttons.RegisterUserButton;
import View.MainFrame;

import javax.swing.*;
import java.awt.*;

import static View.MainFrame.APPLICATION_HEIGHT;
import static View.MainFrame.APPLICATION_WIDTH;
import static View.Panels.BottomNavigationPanel.BOTTOM_PANEL_HEIGHT;

public class AdminPanel extends JPanel {

    public final static int LOGIN_PANEL_WIDTH = APPLICATION_WIDTH;
    public final static int LOGIN_PANEL_HEIGHT = APPLICATION_HEIGHT - BOTTOM_PANEL_HEIGHT;
    private MainFrame properMainFrame;

    public AdminPanel(MainFrame properMainFrame, String name, String surname) {
        this.properMainFrame = properMainFrame;
        setPreferredSize(new Dimension(LOGIN_PANEL_WIDTH, LOGIN_PANEL_HEIGHT));
        setBackground(Color.darkGray);
        JLabel textLabel = new JLabel("Welcome " + name + " " + surname,SwingConstants.CENTER);
        textLabel.setFont(new Font("Arial", Font.BOLD, 40));
        textLabel.setForeground(Color.white);
        setLayout(new GridLayout(7,1));
        JButton addNewUser = new RegisterUserButton(this.properMainFrame, "Add new user",true);
        add(textLabel);
        add(addNewUser);
    }
}
