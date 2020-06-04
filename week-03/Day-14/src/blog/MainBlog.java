package blog;

public class MainBlog {

    public static void main(String[] args) {

        Blog myBlog = new Blog();
        BlogPost post1 = new BlogPost("Me", "Post1", "2020.06.04", "my blog part 1");
        BlogPost post2 = new BlogPost("Me", "Post2", "2020.06.04", "my blog part 2");
        BlogPost post3 = new BlogPost("Me", "Post3", "2020.06.04", "my blog part 3");
        BlogPost post4 = new BlogPost("Me", "Post4", "2020.06.04", "my blog part 4");
        BlogPost post5 = new BlogPost("Me", "Post5", "2020.06.04", "my blog part 5");
        BlogPost post6 = new BlogPost("Me", "Post6", "2020.06.04", "my blog part 6");

        myBlog.addBlogPost(post1);
        myBlog.addBlogPost(post2);
        myBlog.addBlogPost(post3);
        myBlog.addBlogPost(post4);
        myBlog.addBlogPost(post5);

        for (int i = 0; i < myBlog.myBlog.size(); i++) {
            System.out.print(myBlog.myBlog.get(i).title);
        }

        System.out.println();
        myBlog.deleteBlogPost(3);

        for (int i = 0; i < myBlog.myBlog.size(); i++) {
            System.out.print(myBlog.myBlog.get(i).title);
        }

        System.out.println();
        myBlog.updateBlogPost(1,post6);

        for (int i = 0; i < myBlog.myBlog.size(); i++) {
            System.out.print(myBlog.myBlog.get(i).title);
        }


    }
}
