package br.com.dio.ui.custom.button;

import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionListener;

public class ResetButton extends JButton {

    public ResetButton(final ActionListener actionListener){
        this.setText("REINICIAR GAME");
        this.addActionListener(actionListener);
        this.setBackground(Color.red);
    }

}
