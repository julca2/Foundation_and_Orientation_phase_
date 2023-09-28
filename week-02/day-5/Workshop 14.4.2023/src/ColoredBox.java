import javax.swing.*;

import java.awt.*;
import java.util.concurrent.LinkedBlockingDeque;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void drawImage(Graphics graphics) {
        // Draw a box that has different colored lines on each edge

        Graphics2D graphics2D = (Graphics2D) graphics;

        graphics2D.setStroke(new BasicStroke(5));

        graphics2D.setColor(Color.PINK);
        graphics2D.drawLine(0, 0, WIDTH/2, 0);
        graphics2D.setColor(Color.BLUE);
        graphics2D.drawLine(WIDTH/2, 0, WIDTH/2, HEIGHT/2);
        graphics2D.setColor(Color.RED);
        graphics2D.drawLine(0, HEIGHT/2, WIDTH/2, HEIGHT/2);
        graphics2D.setColor(Color.GREEN);
        graphics2D.drawLine(0, HEIGHT/2, 0, 0);

        // for loop is other option




    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }
}