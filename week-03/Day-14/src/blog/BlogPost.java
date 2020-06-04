package blog;

public class BlogPost {

    String authorName;
    String title;
    String text;
    String publicationDate;

    public BlogPost (String authorName, String title, String publicationDate, String text) {
        this.authorName = authorName;
        this.title = title;
        this.publicationDate = publicationDate;
        this.text = text;
    }

    public void show() {
        System.out.println("Author: " + authorName);
        System.out.println("Title: " + title);
        System.out.println("Date of publication: " + publicationDate);
        System.out.println("Text: " + text);
        System.out.println();
    }
}
