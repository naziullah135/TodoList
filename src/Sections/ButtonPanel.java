package Sections;

import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel {
    private JButton addTask;
    private JButton clear;

    ButtonPanel(){
        this.setPreferredSize(new Dimension(400,60));
        this.setBackground(Color.red);
    }
}
