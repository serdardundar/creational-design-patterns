package com.gh.sd.creationalpatterns.simplefactory;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Abstract post class. Represents a generic post on a web site. 
 */
@Getter
@Setter
public abstract class Post {

	private Long id;
	
	private String title; 
	
	private String content;
	
	private LocalDateTime createdOn;
	
	private LocalDateTime publishedOn;
}
