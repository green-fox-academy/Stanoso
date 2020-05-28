import javax.swing.*;

import java.awt.*;
import java.util.HashMap;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class functionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        graphics.setColor(Color.GREEN);
        int x1Start = 0;
        int x2Start = 0;
        int y1Start = 0;
        int y2Start = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 17 ; j++) {
                toCenter(x1Start, y1Start+(j*20), graphics);
                toCenter(x2Start+(j*20), y2Start, graphics);
            }
            x1Start = WIDTH;
            y2Start = HEIGHT;
        }


    }

    public static void toCenter(int x, int y, Graphics graphics) {
        graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);

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