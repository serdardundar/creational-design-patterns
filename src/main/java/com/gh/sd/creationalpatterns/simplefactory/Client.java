package com.gh.sd.creationalpatterns.simplefactory;

public class Client {

    // don't forget to add -ea JVM option :)
    public static void main(String[] args) {
        Post blogPost = PostFactory.createPost(Type.BLOG);
        assert blogPost instanceof BlogPost;

        Post productPost = PostFactory.createPost(Type.PRODUCT);
        assert productPost instanceof ProductPost;

        Post newsPost = PostFactory.createPost(Type.NEWS);
        assert newsPost instanceof NewsPost;
    }
}
