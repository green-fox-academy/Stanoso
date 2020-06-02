import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class squareGrid {
    static int MAX_REP = 3;

    public static void mainDraw(Graphics graphics) {


        int size = WIDTH / 2;
        int x = WIDTH / 2 - size / 2;
        int y = HEIGHT / 2 - size / 2;
        int thick = 16;

        drawSq(graphics, x, y, size, thick, 0);


    }

    public static void drawSq(Graphics graphics, int x, int y, int size, int thick, int rep) {
        if (rep > MAX_REP) {
            return;
        }


        for (int i = 0; i < thick; i++) {
            graphics.drawRect(x + i, y + i, size - (2 * i), size - (2 * i));

        }

        drawSq(graphics, x + 3 * (size / 4), y - size / 4, size / 2, thick / 2, rep + 1);
        drawSq(graphics, x + 3 * (size / 4), y + 3 * (size / 4), size / 2, thick / 2, rep + 1);
        drawSq(graphics, x - size / 4, y + 3 * (size / 4), size / 2, thick / 2, rep + 1);
        drawSq(graphics, x - size / 4, y - size / 4, size / 2, thick / 2, rep + 1);


    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

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

