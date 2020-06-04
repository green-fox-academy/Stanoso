package blog;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> myBlog;

    public Blog() {
        this.myBlog = new ArrayList<BlogPost>();
    }

    public void addBlogPost(BlogPost post) {
        this.myBlog.add(post);
    }

    public void deleteBlogPost(int index) {
        if (index <= myBlog.size()) {
            this.myBlog.remove(index);
        } else {
            System.out.println("BlogPost with this index doesn´t exist.");
        }
    }

    public void updateBlogPost (int index, BlogPost post) {
        if (index <= myBlog.size()) {
            this.myBlog.remove(index);
            this.myBlog.add(index,post);
        } else {
            System.out.println("BlogPost with this index doesn´t exist.");
        }
    }
}
