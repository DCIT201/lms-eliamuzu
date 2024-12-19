package org.example;
import java.util.*; //importing the java util package to make use of the ArrayList class and Scanner Class

public class Library {
    //initializing identity fields for library
    private String Name;
    private String Address;
    private int Contact;
    private ArrayList<Book> books;

    //creating getters and setters
    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public String getAddress(){
        return Address;
    }

    public void setAddress(String Address){
        this.Address = Address;
    }

    public int getContact(){
        return Contact;
    }

    public void setContact(int Contact){
        this.Contact = Contact;
    }

  

   public Library(){        //creating the library constructor
    books = new ArrayList<>();
   }

   public void addBook(Book book){
    books.add(book);
   }

   public void removeBook(Book book){
    books.remove(book);
   };


   public String isAvailable(Book book){
    if(books.contains(book)){
        return "This Book is available";
   }else{
    return "This book is not available";
   }
    }

}

