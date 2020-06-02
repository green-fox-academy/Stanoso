import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class hexagon {
    static int MAX_REP = 4;

    public static void mainDraw(Graphics graphics) {


        int size = WIDTH / 2;
        int x = WIDTH / 2 - size / 2;
        int y = 0;


        drawHex(graphics, x, y, size, 0);

    }

    public static void drawHex(Graphics graphics, int x, int y, int size, int rep) {
        if (rep > MAX_REP) {
            return;
        }
        int height = (int) Math.round(size / 2 * Math.sqrt(3));
        graphics.drawLine(x, y, x + size, y);
        graphics.drawLine(x + size, y, x + 3 * size / 2, y + height);
        graphics.drawLine(x + 3 * size / 2, y + height, x + size, y + 2 * height);
        graphics.drawLine(x + size, y + 2 * height, x, y + 2 * height);
        graphics.drawLine(x, y + 2 * height, x - size / 2, y + height);
        graphics.drawLine(x - size / 2, y + height, x, y);

        drawHex(graphics, x, y, size / 3, rep+1);   //1
        drawHex(graphics, x + 2 * size / 3, y, size / 3, rep+1);        //2
        drawHex(graphics, x + size, y + 2 * height / 3, size / 3, rep+1);   //3
        drawHex(graphics, x + 2 * size / 3, y + 4 * height / 3, size / 3, rep+1);   //4
        drawHex(graphics, x, y + 4 * height / 3, size / 3, rep+1);   //5
        drawHex(graphics, x - size / 3, y + 2 * height / 3, size / 3, rep+1);   //6
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

