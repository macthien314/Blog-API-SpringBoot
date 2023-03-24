package com.mt.blog.services;

import java.util.List;

import com.mt.blog.payloads.CategoryDto;


public interface CategoryService {
	CategoryDto createCategory(CategoryDto categoryDto);
	
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	void deleteCategory(Integer categoryId); 
	
	CategoryDto getCategoryById(Integer categoryId);
	
	List<CategoryDto>getCategories();
}
