package com.mt.blog.payloads;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class PostDto {
	private Integer postId;
	@NotEmpty
	@Size(min = 4, message = "User must be min of 4 characters")
	private String title;
	@NotEmpty
	@Size(min = 4, max = 10000, message = "Password must be min of 4 chars and max of 10000 chars")
	private String content;
	private String imageName;
	private Date addedDate;
	private CategoryDto category;
	private UserDto user;
}
