package com.lyubon.gui;

import javax.swing.*;

public class AppFrame extends JFrame {
    public AppFrame() {
        setTitle("Drawing");
        setSize(300, 200);

        DrawComponent drawComponent = new DrawComponent();
        add(drawComponent);
    }
}
