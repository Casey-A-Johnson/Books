package com.caseyjohnson.books.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.caseyjohnson.books.models.Books;
import com.caseyjohnson.books.services.BooksService;



@RestController
@RequestMapping("/api")
public class BooksApi {
    
	@Autowired
	private BooksService booksService;
   
	//---Get All-------------------
	@RequestMapping("/books")
	public List<Books> findAllBooks(){
		return booksService.allBooks();
	}
	
	// -----create----------
	
	@PostMapping("/books")
	public Books createBook(
			@RequestParam("title") String title,
			@RequestParam("description") String description,
			@RequestParam("language") String language,
			@RequestParam("pages") Integer pages
			) {
		Books newBook = new Books(title, description, language, pages);
		return booksService.createBook(newBook);
	}
	
	//---find one-----
	
	@GetMapping("/books/{id}")
	public Books oneBook(@PathVariable("id") Long id) {
		return booksService.oneBook(id);
	}
	
    //update
    @PutMapping("/books/{id}")
    public Books updateBook(
    		@PathVariable("id") Long id, 
    		@RequestParam("title") String title, 
    		@RequestParam("description") String description, 
    		@RequestParam("language") String language,
    		@RequestParam("pages") Integer pages
    		) {
        return booksService.updateBook(id, title, description, language, pages);
    }
    
    @DeleteMapping("/books/{id}")
    public void destroy(@PathVariable("id") Long id) {
        booksService.deleteBook(id);
    }
}
