package ru.geekbrains;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame {

    public JTextField firstRowField;

    public Form() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel calculatorPanel = new JPanel();
        calculatorPanel.setLayout(null);

        setTitle("Неработающий калькулятор.");

        setBounds(100, 100, 215, 340);

        JTextField firstRowField = new JTextField(20);
        firstRowField.setBounds(0,0,199,50);
        firstRowField.setToolTipText("20 символов с выравниваем вправо");
        firstRowField.setHorizontalAlignment(JTextField.RIGHT);
        add(firstRowField);
        firstRowField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Form.this,"Вы ввели:  " +firstRowField.getText(),"Custom Test Title", 1 );
            }
        });


        JButton buttonC = new JButton("C");
        buttonC.setBounds(0,50,100,50);


        buttonC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               firstRowField.setText(e.getActionCommand());
            }
        });


        JButton buttonArrowLeft = new JButton("<");
        buttonArrowLeft.setBounds(100,50,50,50);
        JButton buttonDivide = new JButton("/");
        buttonDivide.setBounds(150,50,50,50);
        JButton button7 = new JButton("7");
        button7.setBounds(0,100,50,50);
        JButton button8 = new JButton("8");
        button8.setBounds(50,100,50,50);
        JButton button9 = new JButton("9");
        button9.setBounds(100,100,50,50);
        JButton buttonX = new JButton("*");
        buttonX.setBounds(150,100,50,50);
        JButton button4 = new JButton("4");
        button4.setBounds(0,150,50,50);
        JButton button5 = new JButton("5");
        button5.setBounds(50,150,50,50);
        JButton button6 = new JButton("6");
        button6.setBounds(100,150,50,50);
        JButton buttonMinus = new JButton("-");
        buttonMinus.setBounds(150,150,50,50);
        JButton button1 = new JButton("1");
        button1.setBounds(0,200,50,50);
        JButton button2 = new JButton("2");
        button2.setBounds(50,200,50,50);
        JButton button3 = new JButton("3");
        button3.setBounds(100,200,50,50);
        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(150,200,50,50);
        JButton button0 = new JButton("0");
        button0.setBounds(0,250,100,50);
        JButton buttonDot = new JButton(".");
        buttonDot.setBounds(100,250,50,50);
        JButton buttonResult = new JButton("=");
        buttonResult.setBounds(150,250,50,50);

        add(buttonC);
        add(buttonArrowLeft);
        add(buttonDivide);
        add(button7);
        add(button8);
        add(button9);
        add(buttonX);
        add(button4);
        add(button5);
        add(button6);
        add(buttonMinus);
        add(button1);
        add(button2);
        add(button3);
        add(buttonPlus);
        add(button0);
        add(buttonDot);
        add(buttonResult);

        ActionListener actionListener = new TestActionListener();

        buttonC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstRowField.setText(e.getActionCommand());
            }
        });


        buttonArrowLeft.addActionListener(actionListener);
        buttonDivide.addActionListener(actionListener);
        button7.addActionListener(actionListener);
        button8.addActionListener(actionListener);
        button9.addActionListener(actionListener);
        buttonX.addActionListener(actionListener);
        button4.addActionListener(actionListener);
        button5.addActionListener(actionListener);
        button6.addActionListener(actionListener);
        buttonMinus.addActionListener(actionListener);
        button1.addActionListener(actionListener);
        button2.addActionListener(actionListener);
        button3.addActionListener(actionListener);
        buttonPlus.addActionListener(actionListener);
        button0.addActionListener(actionListener);
        buttonDot.addActionListener(actionListener);
        buttonResult.addActionListener(actionListener);

        getContentPane().add(calculatorPanel);
        setVisible(true);
    }
}
