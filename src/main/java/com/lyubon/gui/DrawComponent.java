package com.lyubon.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class DrawComponent extends JComponent {
    public void paintComponent(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;

        // defining rectangle
        double leftX = 50;
        double topY = 50;
        double width = 100;
        double height = 50;

        Rectangle2D rectangle = new Rectangle2D.Double(leftX, topY, width, height);

        graphics2D.draw(rectangle);
    }
}
