package BlogPost;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        blogPost b1 = new blogPost("John Doe", "Lorem Ipsum", "2000.05.04");
        b1.getText("Lorem ipsum dolor sit amet.");
        b1.show();

        blogPost b2 = new blogPost("Tim Urban", "Wait but why", "2010.10.10.");
        b2.getText("A popular long-form, stick-figure-illustrated blog about almost everything.");
        b2.show();

        blogPost b3 = new blogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "2017.03.28.");
        b3.getText("Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one " +
                "of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.");
        b3.show();
    }

}
