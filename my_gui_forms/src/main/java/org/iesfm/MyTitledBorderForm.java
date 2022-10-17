package org.iesfm;

import javax.swing.*;

public class MyTitledBorderForm {
    private JPanel mainPanel;
    private JPanel searchPanel;
    private JRadioButton byNameRadioButton;
    private JRadioButton byIDRadioButton;

    public static void main(String[] args) {

        JFrame windowTitledBorder = new JFrame();
        windowTitledBorder.setBounds(50, 50, 350, 600);
        windowTitledBorder.setVisible(true);
        windowTitledBorder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        windowTitledBorder.setContentPane(new MyTitledBorderForm().mainPanel);
        windowTitledBorder.repaint();
        windowTitledBorder.revalidate();
    }
}
