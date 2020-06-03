package BlogPost;

public class blogPost {

    String authorName;
    String title;
    private String text;
    String publicationDate;

    public blogPost(String authorName, String title, String publicationDate) {
        this.authorName = authorName;
        this.title = title;
        this.publicationDate = publicationDate;
    }

    public void getText(String text) {
    this.text = text;
    }

    public void show () {
        System.out.println("Author: " +authorName);
        System.out.println("Title: " +title);
        System.out.println("Date of publication: " +publicationDate);
        System.out.println("Text: " +text);
        System.out.println();
    }
}
