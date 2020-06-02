/* NOT FINISHED
import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Koch {
    static int MAX_REP = 5;

    public static void mainDraw(Graphics graphics) {


        int lenght = 80;
        int x = WIDTH / 2;
        int y = 6 * HEIGHT / 8;
        int ang = 90;

        int x1 = x;
        int y1 = y;
        int a = (int) Math.round(lenght * Math.sin(Math.toRadians(ang)));
        int b = (int) Math.round(lenght * Math.cos(Math.toRadians(ang)));
        int c = (int) Math.round(lenght * Math.sin(Math.toRadians(180 - ang)));
        int d = (int) Math.round(lenght * Math.cos(Math.toRadians(180 - ang)));
        int e = (int) Math.round(lenght * Math.sin(Math.toRadians(ang-180)));
        int f = (int) Math.round(lenght * Math.cos(Math.toRadians(ang-180)));
        int g = (int) Math.round(lenght * Math.sin(Math.toRadians(360-ang)));
        int h = (int) Math.round(lenght * Math.cos(Math.toRadians(360-ang)));
        if (ang <= 90) {
            x1 = x + a ;
            y1 = y - b;
        }
        if (ang > 90 && ang <= 180) {
            x1 = x + c;
            y1 = y + d;
        }
        if (ang > 90 && ang <= 270) {
            x1 = x - e;
            y1 = y + f;
        }
        if (ang > 270 && ang <=360) {
            x1 = x - g;
            y1 = y - h;
        }



        drawBranch(graphics, x, y, lenght, ang, 0);
       /* drawBranch(graphics, x - g, y - h, lenght, ang+300, 0);
        drawBranch(graphics, x - g - e, y - h + f, lenght, ang+240, 0);
        drawBranch(graphics, x - g - e , y - h + f , lenght, ang+360, 0);
        drawBranch(graphics, x - g - e + a, y - h + f , lenght, ang+300, 0);
        drawBranch(graphics, x - g - e + a -g, y - h + f - h , lenght, ang+0, 0);







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
        int a = (int) Math.round(lenght * Math.sin(Math.toRadians(ang)));
        int b = (int) Math.round(lenght * Math.cos(Math.toRadians(ang)));
        int c = (int) Math.round(lenght * Math.sin(Math.toRadians(180 - ang)));
        int d = (int) Math.round(lenght * Math.cos(Math.toRadians(180 - ang)));
        int e = (int) Math.round(lenght * Math.sin(Math.toRadians(ang-180)));
        int f = (int) Math.round(lenght * Math.cos(Math.toRadians(ang-180)));
        int g = (int) Math.round(lenght * Math.sin(Math.toRadians(360-ang)));
        int h = (int) Math.round(lenght * Math.cos(Math.toRadians(360-ang)));
        if (ang <= 90) {
            x1 = x + a ;
            y1 = y - b;
        }
        if (ang > 90 && ang <= 180) {
            x1 = x + c;
            y1 = y + d;
        }
        if (ang > 90 && ang <= 270) {
            x1 = x - e;
            y1 = y + f;
        }
        if (ang > 270 && ang <=360) {
            x1 = x - g;
            y1 = y - h;
        }

        graphics.drawLine(x,y,x1,y1);

      drawBranch(graphics, x - g, y - h, lenght, ang+(rep*5), rep+1);
       // drawBranch(graphics, x - g - e, y - h + f, lenght, ang+240, rep+1);
       // drawBranch(graphics, x - g - e , y - h + f , lenght, ang+360, rep+1);

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
*/
