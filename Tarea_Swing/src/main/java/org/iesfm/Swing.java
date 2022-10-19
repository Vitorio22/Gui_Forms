package org.iesfm;

import javax.swing.*;
import java.awt.*;

public class Swing extends JFrame {

    private JPanel mainPanel;

    private JPanel northPanel;

    private JButton buttonOne;

    private JButton buttonTwo;

    private JButton buttonThree;

    private JPanel westPanel;

    private JLabel optionOne;

    private JLabel optionTwo;

    private JLabel optionThree;

    private JLabel optionFour;

    private JLabel optionFive;

    private JPanel eastPanel;
    private Color turquoise;


    public static void main(String[] args) {

        Swing swing = new Swing();

    }

    public Swing() throws HeadlessException {
        this.setBounds(10,10,600,500);
        this.setVisible(true);
        this.setResizable(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(createMainPanel());
        repaint();
        revalidate();
    }
    private Color createCustomColor(){
        return turquoise = new Color(6,163,184);
    }

    private JPanel createMainPanel() {

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        mainPanel.add(createNorthPanel(), BorderLayout.NORTH);
        mainPanel.add(createWestPanel(), BorderLayout.WEST);
        mainPanel.add(createEastPanel(), BorderLayout.EAST);
        return mainPanel;
    }

    private JPanel createNorthPanel() {

        northPanel = new JPanel();
        northPanel.setLayout(new FlowLayout());
        northPanel.add(createOptionButton1());
        northPanel.add(createOptionButton2());
        northPanel.add(createOptionButton3());
        northPanel.setBackground(createCustomColor());
        return northPanel;
    }

    private JButton createOptionButton1() {
        
        buttonOne = new JButton("Option 1");
        return buttonOne;
    }
    
    private JButton createOptionButton2() {
        
        buttonTwo = new JButton("Option 2");
        return buttonTwo;
    }

    private JButton createOptionButton3() {
        
        buttonThree = new JButton("Option 3");
        return buttonThree;
    }

    private JPanel createWestPanel() {

        westPanel = new JPanel();
        westPanel.setLayout(new GridLayout(5,1));
        westPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.gray), "Submenu"));
        westPanel.add(createLabelOption1());
        westPanel.add(createLabelOption2());
        westPanel.add(createLabelOption3());
        westPanel.add(createLabelOption4());
        westPanel.add(createLabelOption5());
        westPanel.setBackground(createCustomColor());
        return westPanel;
    }

    private JLabel createLabelOption1() {

        optionOne = new JLabel("Option1");
        return optionOne;
    }

    private JLabel createLabelOption2() {

        optionTwo = new JLabel("Option2");
        return optionTwo;
    }

    private JLabel createLabelOption3() {
        
        optionThree = new JLabel("Option3");
        return optionThree;
    }

    private JLabel createLabelOption4() {
        
        optionFour = new JLabel("Option4");
        return optionFour;
    }
    private JLabel createLabelOption5() {
        
        optionFive = new JLabel("Option5");
        return optionFive;
    }


    private JPanel createEastPanel() {
        eastPanel = new JPanel();
        return eastPanel;
    }

}