package org.iesfm;

import javax.swing.*;

public class CalculatorForm {
    private JPanel mainPanel;
    private JPanel northPanel;
    private JTextField a0TextField;

    public static void main(String[] args) {

        JFrame windowTitledBorder = new JFrame();
        windowTitledBorder.setBounds(10, 10, 300, 500);
        windowTitledBorder.setVisible(true);
        windowTitledBorder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        windowTitledBorder.setContentPane(new CalculatorForm().mainPanel);
        windowTitledBorder.repaint();
        windowTitledBorder.revalidate();

    }
}
