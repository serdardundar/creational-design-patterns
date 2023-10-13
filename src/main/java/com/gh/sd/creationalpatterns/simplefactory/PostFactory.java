package com.gh.sd.creationalpatterns.simplefactory;

/**
 * This class acts as a simple factory for creation of
 * different posts on website.
 */
public class PostFactory {

    private PostFactory() {
    }

    public static Post createPost(Type type) {
        return switch (type) {
            case BLOG -> new BlogPost();
            case NEWS -> new NewsPost();
            case PRODUCT -> new ProductPost();
            default -> throw new IllegalArgumentException("Unknown post type: " + type.name());
        };
    }

}
