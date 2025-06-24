package br.com.dio.ui.custom.button;

import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionListener;

public class CheckGameStatusButton extends JButton {

    public CheckGameStatusButton(final ActionListener actionListener){
        this.setText("VERIFICAR GAME");
        this.addActionListener(actionListener);
        this.setBackground(Color.yellow);
    }

}
