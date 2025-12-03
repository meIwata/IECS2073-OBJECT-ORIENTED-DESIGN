package java1126;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JGUIDemo extends JFrame implements ActionListener {

    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 250;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 30;
    private static final String EMPTY_STRING = "";
    private static final String NEWLINE = System.getProperty("line.separator");

    private JButton clearButton;
    private JButton addButton;

    private JTextField inputLine; // The JTextField for the user to enter a text
    private JTextArea textArea; //The JTextArea for displaying the entered text

    private JMenuItem clearMenuItem;

    public JGUIDemo(String title) {
        super(title);

        //set the frame properties
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setResizable(true);
        //this.setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        this.setLocation(0, 0);

        Container contentPane = getContentPane();
        //contentPane.setLayout(new FlowLayout());
        contentPane.setLayout(new BorderLayout());

        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollText = new JScrollPane(textArea);
        contentPane.add(scrollText, "Center");


        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        inputLine = new JTextField(10);
        panel.add(inputLine, "South");


        addButton = new JButton("ADD");
        panel.add(addButton);
        addButton.addActionListener(this);

        clearButton = new JButton("CLEAR");
        panel.add(clearButton);
        clearButton.addActionListener(this);

        contentPane.add(panel, "South");

        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        JMenu funcMenu = new JMenu("FUNC");

        clearMenuItem = new JMenuItem("clear");
        clearMenuItem.addActionListener(this);
        funcMenu.add(clearMenuItem);
        menuBar.add(funcMenu);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setVisible(true);
    }

    public static void main(String arg[]) {
        new JGUIDemo("Text Frame");
    }

    public void actionPerformed(ActionEvent event) {
//        System.out.println(event.getSource());
//        if (event.getSource() == addButton) {
//            System.out.println("user intput:" + inputLine.getText());
//        } else if(event.getSource() == clearButton) {
//            System.out.println("let's clear the text area");
//        } else if(event.getSource() == inputLine) {
//            System.out.println("user intput:" + inputLine.getText());
//        } else if(event.getSource() == clearMenuItem) {
//            System.out.println("let's clear the text area");
//        }
        if (event.getSource() == addButton) {
            String input = inputLine.getText();
            textArea.append(input + NEWLINE);
            inputLine.setText(EMPTY_STRING);
        } else if (event.getSource() == clearButton || event.getSource() == clearMenuItem) {
            textArea.setText(EMPTY_STRING);
        }
    }
}
