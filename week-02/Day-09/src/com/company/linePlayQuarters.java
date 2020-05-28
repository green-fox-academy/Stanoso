import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class linePlayQuarters {
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.BLUE);
        int divideIn = 64;
        int inLineBox = (int) Math.sqrt(divideIn);
        ;
        System.out.println(inLineBox);
        for (int i = 0; i < inLineBox - 1; i++) {
            graphics.drawLine(WIDTH / inLineBox + (i * (WIDTH / inLineBox)), 0, WIDTH / inLineBox + (i * (WIDTH / inLineBox)), HEIGHT);
            graphics.drawLine(0, HEIGHT / inLineBox + (i * (HEIGHT / inLineBox)), WIDTH, HEIGHT / inLineBox + (i * (HEIGHT / inLineBox)));

        }

        int x = 0;
        int y = 0;
        int x2 = 0;
        int y2 = 0;

        for (int b = 0; b < inLineBox; b++) {

            for (int j = 0; j < inLineBox; j++) {

                x = ((320 / inLineBox) / 5) + ((320 / inLineBox) * j);
                x2 = (((320 / inLineBox) / 16) + ((320 / inLineBox)) * j);
                y = ((320 / inLineBox) / 16) + ((320 / inLineBox) * b);
                y2 = ((320 / inLineBox) / 5) + ((320 / inLineBox) * b);
                for (int i = 0; i < 13; i++) {
                    graphics.setColor(Color.magenta);
                    graphics.drawLine(x, 2 + ((320 / inLineBox) * b), ((320 / inLineBox) * (j + 1)) - 2, y);
                    graphics.setColor(Color.GREEN);
                    graphics.drawLine(2 + ((320 / inLineBox) * j), y2, x2, ((320 / inLineBox) * (b + 1)) - 2);
                    x += ((320 / inLineBox) / 16);
                    y += ((320 / inLineBox) / 16);
                    x2 += ((320 / inLineBox) / 16);
                    y2 += ((320 / inLineBox) / 16);
                }
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