package libraryIOProjTest;

import java.io.Serializable;

public class Book implements Serializable{
    private String title;
    private int price;
    private String author;

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    
    public int getPrice() {
        return price;
    }
    
    public String getTitle() {
        return title;
    }
    @Override
    public String toString(){
        return "<<"+ title +">> "+"Author: "+author + " Price: "+ price;
    }
}
