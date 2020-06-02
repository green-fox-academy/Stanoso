
import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class tree {
    static int MAX_REP = 8;

    public static void mainDraw(Graphics graphics) {


        int lenght = 80;
        int x = WIDTH / 2;
        int y = 6 * HEIGHT / 8;
        int ang = 0;


        drawBranch(graphics, x, y, lenght, ang, 0);





    }

    public static void drawBranch(Graphics graphics, int x, int y, int lenght, int ang, int rep) {
        if (rep > MAX_REP) {
            return;
        }
        while (ang > 360)
        {
            ang = ang - 360;
        }
        int x1 = x;
        int y1 = y;
        if (ang <= 90) {
            x1 = x + (int) Math.round(lenght * Math.sin(Math.toRadians(ang)));
            y1 = y - (int) Math.round(lenght * Math.cos(Math.toRadians(ang)));
        }
        if (ang > 90 && ang <= 180) {
            x1 = x + (int) Math.round(lenght * Math.sin(Math.toRadians(180 - ang)));
            y1 = y + (int) Math.round(lenght * Math.cos(Math.toRadians(180 - ang)));
        }
        if (ang > 90 && ang <= 270) {
            x1 = x - (int) Math.round(lenght * Math.sin(Math.toRadians(ang-180)));
            y1 = y + (int) Math.round(lenght * Math.cos(Math.toRadians(ang-180)));
        }
        if (ang > 270 && ang <=360) {
            x1 = x - (int) Math.round(lenght * Math.sin(Math.toRadians(360-ang)));
            y1 = y - (int) Math.round(lenght * Math.cos(Math.toRadians(360-ang)));
        }

        graphics.drawLine(x,y,x1,y1);

        drawBranch(graphics, x1, y1, lenght-(lenght/5), ang, rep+1);
        drawBranch(graphics, x1, y1, lenght-(lenght/5), ang+30, rep+1);
        drawBranch(graphics, x1, y1, lenght-(lenght/5), ang+330, rep+1);
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

