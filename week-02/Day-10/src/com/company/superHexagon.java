import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class superHexagon {
    public static void mainDraw(Graphics graphics) {
        int number = 7;
        int sizeT = 20;
        int startX = WIDTH / 2 - (sizeT / 2);
        int heightT = (int) ((sizeT * (Math.sqrt(3))) / 2);
        int startY = (2 * heightT);
        int x1 = startX;
        int y1 = startY;
        int x2 = startX + sizeT;
        int x3 = startX + sizeT + sizeT / 2;
        int y2 = startY + heightT;
        int y3 = startY + (2 * heightT);
        int x4 = startX - sizeT / 2;
        boolean change = true;
        int[][] coordinates = new int[6][2];


        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < number - j; i++) {
                coordinates[0][0] = x1;
                coordinates[0][1] = y1;
                coordinates[1][0] = x1 + sizeT;
                coordinates[1][1] = y1;
                coordinates[2][0] = x1 + sizeT + sizeT / 2;
                coordinates[2][1] = y1 + heightT;
                coordinates[3][0] = x1 + sizeT;
                coordinates[3][1] = y1 + (2 * heightT);
                coordinates[4][0] = x1;
                coordinates[4][1] = y1 + (2 * heightT);
                coordinates[5][0] = x1 - sizeT / 2;
                coordinates[5][1] = y1 + heightT;
                connect(coordinates, graphics);
                y1 = y1 + (2 * heightT);
            }

            x1 = startX + ((sizeT + sizeT / 2) * (j + 1));
            y1 = startY + (heightT * (j + 1));


        }

        for (int j = 1; j < 4; j++) {
            x1 = startX - ((sizeT + sizeT / 2) * (j));
            y1 = startY + (heightT * (j));
            for (int i = 0; i < number - (j); i++) {
                coordinates[0][0] = x1;
                coordinates[0][1] = y1;
                coordinates[1][0] = x1 + sizeT;
                coordinates[1][1] = y1;
                coordinates[2][0] = x1 + sizeT + sizeT / 2;
                coordinates[2][1] = y1 + heightT;
                coordinates[3][0] = x1 + sizeT;
                coordinates[3][1] = y1 + (2 * heightT);
                coordinates[4][0] = x1;
                coordinates[4][1] = y1 + (2 * heightT);
                coordinates[5][0] = x1 - sizeT / 2;
                coordinates[5][1] = y1 + heightT;
                connect(coordinates, graphics);

                y1 = y1 + (2 * heightT);
            }


        }


    }

    public static void connect(int[][] inp, Graphics graphics) {
        graphics.setColor(Color.BLUE);
        for (int i = 0; i < inp.length; i++) {
            if (i < inp.length - 1) {
                graphics.drawLine(inp[i][0], inp[i][1], inp[i + 1][0], inp[i + 1][1]);
            } else {
                graphics.drawLine(inp[i][0], inp[i][1], inp[0][0], inp[0][1]);
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
