package org.example;

public class Book {
    // Initializing Private fields
    private String Title;
    private String Author;
    private int YearPublished;

    //Book Constructor 
    public Book(String Title, String Author, int YearPublished){
        this.Title = Title;
        this.Author = Author;
        this.YearPublished = YearPublished;
    }

    //Getters and Setters for fields
    public String getTitle(){
        return Title;
    }
    
    public void setTitle(String Title){
        this.Title = Title;
    }

    public String getAuthor(){
        return Author;
    }

    public void setAuthor(String Author){
        this.Author = Author;
    }

    public int getYearPublished(){
        return YearPublished;
    }

    public void setYearPublished(int YearPublished){
        this.YearPublished = YearPublished;
    }
    
}

