import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class SierpinskyCarpet {
    static int MAX_REP = 4;

    public static void mainDraw(Graphics graphics) {


        int size = WIDTH / 3;
        int x = WIDTH / 2 - size / 2;
        int y = HEIGHT / 2 - size / 2;


        drawSq(graphics, x, y, size, 0);

    }

    public static void drawSq(Graphics graphics, int x, int y, int size, int rep) {
        if (rep > MAX_REP) {
            return;
        }
        graphics.fillRect(x, y, size, size);

        drawSq(graphics, x - 2 * size / 3, y - 2 * size / 3, size / 3, rep + 1);
        drawSq(graphics, x + size / 3, y - 2 * size / 3, size / 3, rep + 1);
        drawSq(graphics, x + size + size / 3, y - 2 * size / 3, size / 3, rep + 1);
        drawSq(graphics, x - 2 * size / 3, y + size / 3, size / 3, rep + 1);
        drawSq(graphics, x + size + size / 3, y + size / 3, size / 3, rep + 1);
        drawSq(graphics, x - 2 * size / 3, y + size + size / 3, size / 3, rep + 1);
        drawSq(graphics, x + size / 3, y + size + size / 3, size / 3, rep + 1);
        drawSq(graphics, x + size + size / 3, y + size + size / 3, size / 3, rep + 1);
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

