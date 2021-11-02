package com.pb.bolshakov.hw5;

public class Book {
    private final String BookName;
    private final String BookAuthor;
    private final int YearRelease;

    public Book(String BookName, String BookAuthor, int YearRelease) {
        this.BookName = BookName;
        this.BookAuthor = BookAuthor;
        this.YearRelease = YearRelease;
    }
    public String getTitle() {
        return BookName;
    }

    public String toString() {
        final StringBuilder SB = new StringBuilder();
        SB.append(BookName);
        SB.append(" (").append(BookAuthor);
        SB.append(", ").append(YearRelease);
        SB.append(" г.)");
        return SB.toString();
    }
}