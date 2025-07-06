package com.xworkz.collections.dto;

public class BookDTO {
    private String title;
    private String author;
    private int year;
    private String genre;
    private int pages;
    private int bookId;

    public BookDTO(String title, String author, int year, String genre, int pages, int bookId) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.pages = pages;
        this.bookId = bookId;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public String getGenre() { return genre; }
    public int getPages() { return pages; }
    public int getBookId() { return bookId; }

    @Override
    public String toString() {
        return "BookDTO{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", pages=" + pages +
                ", bookId=" + bookId +
                '}';
    }
}
