package com.mt.blog.payloads;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class CategoryDto {
	private Integer categoryId;
	@NotBlank
	@Size(min = 4, message = "Title must be min of 4 characters")
	private String categoryTitle;
	@NotBlank
	@Size(min = 4, max = 100, message = "Description must be min of 4 chars and max of 100 chars")
	private String categoryDescription;
}
