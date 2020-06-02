import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class circles {
    static int MAX_REP = 4;

    public static void mainDraw(Graphics graphics) {


        int pol = WIDTH/2 ;
        int x = 0;
        int y = 0;


        drawHex(graphics, x, y, pol, 0);

    }

    public static void drawHex(Graphics graphics, int x, int y, int pol, int rep) {
        if (rep > MAX_REP) {
            return;
        }
        graphics.drawOval(x,y,2*pol,2*pol);

        drawHex(graphics, x+pol/2, y, pol/2, rep+1);
        drawHex(graphics, (x+pol/2) - ((int) Math.round((pol/2*(Math.cos(Math.toRadians(30)))))), y+(3*(pol/2)/2), pol/2, rep+1);
        drawHex(graphics, (x+pol/2) + ((int) Math.round((pol/2*(Math.cos(Math.toRadians(30)))))), y+(3*(pol/2)/2), pol/2, rep+1);

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

