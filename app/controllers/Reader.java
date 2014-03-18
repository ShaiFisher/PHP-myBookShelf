package controllers;

import java.util.*;
  /**
 * Created by Plato on 3/18/14.
 */
public class Reader {
    private int id;
    private String name;
    private String picUrl;

      public List<Book> getBooks() {
          return books;
      }

      public void setBooks(List<Book> books) {
          this.books = books;
      }

      public List<Reader> getFriends() {
          return friends;
      }

      public void setFriends(List<Reader> friends) {
          this.friends = friends;
      }

      private List<Book> books;
    private List<Reader> friends;

    public String getName() {
          return name;
      }
    public void setName(String name) {this.name = name;}
    public String getPicUrl() {return picUrl;}
    public void setPicUrl(String picUrl) {this.picUrl = picUrl;}

    public Reader(String name) {
        this.name = name;
        books = new ArrayList<Book>();
        friends = new ArrayList<Reader>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addFriend(Reader friend) {
        friends.add(friend);
    }
}
