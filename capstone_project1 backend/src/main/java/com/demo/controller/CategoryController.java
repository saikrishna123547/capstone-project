package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.main.Category;
import com.demo.main.Product;
import com.demo.mainService.CategoryService;
import com.demo.mainService.ProductService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class  CategoryController{

@Autowired
private CategoryService categoryService; 
 
@GetMapping("/Category/{id}")
public Category getCategoryById(@PathVariable long id) {
	
	return categoryService.getCategoryById(id);
}

@PutMapping("/Category")
public Category updateCategory(@RequestBody Category category) {
	
	return categoryService.updateCategory(category);
}

@DeleteMapping("/Category/{id}")
public void deleteCategory(@PathVariable long id) {
	categoryService.deleteCategory(id);
	
}

@GetMapping("/Categories")
public List<Category> getALLCategories() {
	
	return categoryService.getALLCategories();
}

@GetMapping("/CategoriesDropDown/{id}")
public Category getCategoriesDropDown1(@PathVariable long id) {
	
	return categoryService.getCategoriesDropDown1(id);
}

@PostMapping("/Category")
public Category addCategory(@RequestBody Category category) {
	
	return categoryService.addCategory(category);
}

}
