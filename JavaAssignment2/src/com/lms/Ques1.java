package com.lms;

public class Ques1 extends BookDetails implements Action {

    String bookName;
    String issuerName;
    int bookID;
    int issuerID;
    Author author;

    public void assignIssuer(String issuerName, int issuerID) {
        this.issuerName = issuerName;
        this.issuerID = issuerID;
    }

    public void removeIssuer() {
        System.out.println("Removing the issuer of book ID: " + this.bookID);
        issuerID = 0;
        issuerName = null;
    }

    @Override
    public String toString() {
        return "Ques1{" +
                "bookName='" + bookName + '\'' +
                ", issuerName='" + issuerName + '\'' +
                ", bookID=" + bookID +
                ", issuerID=" + issuerID +
                ", author name=" + author.name +
                ", author ID=" + author.authorID +
                '}';
    }

    @Override
    public void addBook(String bookName, int bookId, Author author) {
        this.bookName = bookName;
        this.bookID = bookID;
        this.author=author;
    }
}

