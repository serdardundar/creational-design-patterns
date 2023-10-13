package com.gh.sd.creationalpatterns.simplefactory;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents a blog post.
 */
@Getter
@Setter
public class BlogPost extends Post {

    private String author;

    private String[] tags;
}
