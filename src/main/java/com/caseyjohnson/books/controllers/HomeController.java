package com.caseyjohnson.books.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.caseyjohnson.books.models.Books;
import com.caseyjohnson.books.services.BooksService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private BooksService booksService;
	
	@RequestMapping("/books")
	public String dashboard(Model model) {
		List<Books> books = booksService.allBooks();
		model.addAttribute("bookList", books);
		return "dashboard.jsp";
	}
	
	@RequestMapping("/books/{id}")
	public String oneBook(@PathVariable("id") Long id, Model model) {
		Books foundBook = booksService.oneBook(id);
		model.addAttribute("oneBook", foundBook);
		return "details.jsp";
	}
}
