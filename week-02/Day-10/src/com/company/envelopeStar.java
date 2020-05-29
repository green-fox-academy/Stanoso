import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class envelopeStar {
    public static void mainDraw(Graphics graphics) {

        int x = 10;
        int y = (HEIGHT / 2) - 10;
        int y2 = (HEIGHT/2)+10;
        graphics.setColor((Color.GREEN));
        for (int i = 0; i < 31; i++) {
            if (i < 15) {
                graphics.drawLine(x, HEIGHT / 2, WIDTH / 2, y);
                graphics.drawLine(x, HEIGHT / 2, WIDTH / 2, y2);
                x += 10;
                y -= 10;
                y2 +=10;
            }
            else
            {
                graphics.drawLine(x, HEIGHT / 2, WIDTH / 2, y);
                graphics.drawLine(x, HEIGHT / 2, WIDTH / 2, y2);
                x += 10;
                y += 10;
                y2 -=10;
            }
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