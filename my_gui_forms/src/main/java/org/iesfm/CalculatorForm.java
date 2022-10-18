package org.iesfm;

import javax.swing.*;

public class CalculatorForm {
    private JPanel mainPanel;
    private JPanel northPanel;
    private JTextField a0TextField;
    private JPanel centerPanel;
    private JPanel southPanel;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton DELButton;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton button8;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton button12;
    private JButton button13;
    private JButton a0Button;
    private JButton button15;
    private JButton xButton;

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
