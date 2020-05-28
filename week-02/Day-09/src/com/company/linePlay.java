import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class linePlay {
    public static void mainDraw(Graphics graphics) {

        int x = 60;
        int y = 20;
        int x2 = 20;
        int y2 = 60;

        for (int i = 0; i < 13; i++) {

            graphics.setColor(Color.magenta);
            graphics.drawLine(x, 2, WIDTH - 2, y);
            graphics.setColor(Color.GREEN);
            graphics.drawLine(2, y2, x2, HEIGHT - 2);
            x += 20;
            y += 20;
            x2 += 20;
            y2 += 20;
        }


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
            mainDraw(graphics);
        }
    }
}