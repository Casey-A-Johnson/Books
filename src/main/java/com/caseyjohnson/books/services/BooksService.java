package com.caseyjohnson.books.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.caseyjohnson.books.models.Books;
import com.caseyjohnson.books.repositories.BooksRepository;

@Service
public class BooksService {
	
    // adding the book repository as a dependency
    @Autowired
    private BooksRepository booksRepository;
    
    // returns all the books
    public List<Books> allBooks() {
        return booksRepository.findAll();
    }
    // creates a book
    public Books createBook(Books books) {
        return booksRepository.save(books);
    }
    // retrieves a book
    public Books oneBook(Long id) {
        Optional<Books> optionalBook = booksRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    // Update
    public Books updateBook(Long id, String title, String description, String language, Integer pages) {
    	Books foundBook = this.oneBook(id);
    	foundBook.setTitle(title);
    	foundBook.setDescription(description);
    	foundBook.setLanguage(language);
    	foundBook.setPages(pages);
    	return booksRepository.save(foundBook);
    	
    }
    
    //-----Delete--------
    public void deleteBook(Long id) {
    	booksRepository.deleteById(id);
    }
}
