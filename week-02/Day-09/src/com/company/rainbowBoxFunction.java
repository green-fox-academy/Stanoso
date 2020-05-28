import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class rainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

        Color[] col = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, new Color(75, 0, 30), new Color(238, 130, 238)};
        int[] size = {320, 270, 220, 170, 120, 70, 20};
        for (int i = 0; i < size.length ; i++) {

            centerSq(size[i],col[i],graphics);

        }


    }

    public static void centerSq(int s, Color c, Graphics graphics) {

        graphics.setColor(c);
        graphics.fillRect((WIDTH / 2) - (s / 2), (HEIGHT / 2) - (s / 2), s, s);

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