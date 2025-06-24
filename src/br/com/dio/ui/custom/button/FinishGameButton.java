package br.com.dio.ui.custom.button;

import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionListener;

public class FinishGameButton extends JButton {

    public FinishGameButton(final ActionListener actionListener){
        this.setText("FINALIZAR");
        this.addActionListener(actionListener);
        this.setBackground(Color.green);
    }

}
