import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Kochline {
    static int MAX_REP = 2;

    public static void mainDraw(Graphics graphics) {

        int size = 400;
        int x = WIDTH / 2 - size / 2;
        int y = HEIGHT - 200;
        int height = (int) Math.round((size * Math.sqrt(3) / 2));
        boolean orientation = true;

        drawT(graphics, x, y, size, orientation, 0);
        drawT(graphics, x, y, size, !orientation, 0);

    }

    public static void drawT(Graphics graphics, int x, int y, int size, boolean orientation, int rep) {
        if (rep > MAX_REP) {
            return;
        }
        int height = (int) Math.round((size * Math.sqrt(3) / 2));
        Polygon triangle = new Polygon();
        if (orientation) {
           triangle.addPoint(x,y);
           triangle.addPoint(x+size,y);
           triangle.addPoint((x+size/2), (y-height));
           graphics.fillPolygon(triangle);

           // graphics.drawLine(x, y, x + size, y);
           // graphics.drawLine(x + size, y, x + size / 2, y - height);
           // graphics.drawLine(x + size / 2, y - height, x, y);
        } else {
            triangle.addPoint(x, y-2*height/3);
            triangle.addPoint(x+size, y-2*height/3);
            triangle.addPoint(x+size/2, y+height/3);
            graphics.fillPolygon(triangle);

            // graphics.drawLine(x + size / 2, y + height / 3, x + size, y - 2 * height / 3);
           // graphics.drawLine(x + size, y - 2 * height / 3, x, y - 2 * height / 3);
           // graphics.drawLine(x, y - 2 * height / 3, x + size / 2, y + height / 3);
        }

        drawT(graphics, x + size / 3, y - 2 * height / 3, size / 3, orientation, rep+1);
        drawT(graphics, x, y, size / 3, orientation, rep+1);
        drawT(graphics, x + 2 * size / 3, y, size / 3, orientation, rep+1);

        drawT(graphics, x + size / 3, y + height / 3 - height / 9, size / 3, !orientation, rep+1);
        drawT(graphics, x, y - height / 3 - height / 9, size / 3, !orientation, rep+1);
        drawT(graphics, x + 2 * size / 3, y - height / 3 - height / 9, size / 3, !orientation, rep+1);

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

