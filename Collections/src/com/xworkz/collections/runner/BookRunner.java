package com.xworkz.collections.runner;

import com.xworkz.collections.dto.BookDTO;

import java.util.*;

public class BookRunner {
    public static void main(String[] args) {
        Collection<BookDTO> books = new ArrayList<>();
        books.add(new BookDTO("Wings of Fire", "A.P.J Abdul Kalam", 1999, "Autobiography", 350, 1001));
        books.add(new BookDTO("The Alchemist", "Paulo Coelho", 1988, "Fiction", 208, 1002));
        books.add(new BookDTO("Clean Code", "Robert C. Martin", 2008, "Programming", 464, 1003));
        books.add(new BookDTO("Atomic Habits", "James Clear", 2018, "Self-help", 320, 1004));
        books.add(new BookDTO("1984", "George Orwell", 1949, "Dystopian", 328, 1005));
        books.add(new BookDTO("The Power of Now", "Eckhart Tolle", 1997, "Spirituality", 236, 1006));
        books.add(new BookDTO("Introduction to Algorithms", "Thomas H. Cormen", 2009, "Computer Science", 1312, 1007));
        books.add(new BookDTO("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 1997, "Fantasy", 309, 1008));
        books.add(new BookDTO("To Kill a Mockingbird", "Harper Lee", 1960, "Classic", 281, 1009));
        books.add(new BookDTO("Think and Grow Rich", "Napoleon Hill", 1937, "Motivational", 238, 1010));


        for (BookDTO book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Year of Publication: " + book.getYear());
            System.out.println("Genre: " + book.getGenre());
            System.out.println("Pages: " + book.getPages());
            System.out.println("Book ID: " + book.getBookId());

            System.out.println("=================");
        }
    }
}
