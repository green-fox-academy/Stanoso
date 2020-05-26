package com.company;

public class urlFixer {

    public static void main(String[] args) {

        String url = "https//www.reddit.com/r/nevertellmethebots";
        url = url.replace("s/", "s:/");
        url = url.replace("bots", "odds");
        System.out.println(url);

        url = "https//www.reddit.com/r/nevertellmethebots";
        url = url.replaceFirst("s", "s:");
        String backup = url.substring(0,39);
        url = backup + "odds";
        System.out.println(url);


    }
}
