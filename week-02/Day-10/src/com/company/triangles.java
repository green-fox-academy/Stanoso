import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class triangles {
    public static void mainDraw(Graphics graphics) {
        int number = 10;
        int sizeT = 30;
        int startX = 0;
        int startY = 320;
        int heighT = (int) ((sizeT * (Math.sqrt(3))) / 2);
        int x1 = startX;
        int y1 = startY;
        //int x2 = x1 + sizeT;
        //int x3 = x1 + (sizeT / 2);
        //int y3 = y1 - heighT;
        int[][] coordinates = new int[3][2];

        for (int j = 0; j < number; j++) {
            for (int i = 0; i < number - j ; i++) {
                coordinates[0][0] = x1;
                coordinates[0][1] = y1;
                coordinates[1][0] = x1 + sizeT;
                coordinates[1][1] = y1;
                coordinates[2][0] = x1 + (sizeT / 2);
                coordinates[2][1] = y1 - heighT;
                connect(coordinates, graphics);
                x1 += sizeT;
            }
            x1 = startX + ((sizeT / 2)*(j+1));
            y1 = (startY - ((heighT * (j+1))));
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
