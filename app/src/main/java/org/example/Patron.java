package org.example;
import java.util.*;

public class Patron {
    private String Name;
    private int patronId;
    private ArrayList<Book> borrowedBooks;


    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public int getpatronId(){
        return patronId;
    }

    public void setpatronId(int patronId){
        this.patronId = patronId;
    }

    public Patron(String Name, int patronId){
        this.Name = Name;
        this.patronId= patronId;
    }

    public void borrowBook(Book book){
        if(borrowedBooks.contains(book)){
            System.out.println("Book not available");
        }else{
            borrowedBooks.add(book);
        }
    }

    public void returnBook(Book book){
        borrowedBooks.remove(book);
    }
    
}
