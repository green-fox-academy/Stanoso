package PostIt;

import java.awt.*;

public class PostIt {

    Color backgroundColor;
    String text;
    Color textColor;

    public PostIt (Color backgroundColor, String text, Color textColor) {
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;
    }
    public void pP ()   {
        System.out.println("Text color: " +textColor);
        System.out.println(text);
        System.out.println("Background color: " +backgroundColor);
    }
}
