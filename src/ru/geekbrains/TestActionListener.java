package ru.geekbrains;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestActionListener implements ActionListener{

    public void actionPerformed(ActionEvent e){
//        firstRowField.setText(e.getActionCommand());
        System.out.println(e.getActionCommand());
        System.out.println("Button pressed");
    }
}
