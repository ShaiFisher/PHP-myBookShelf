package controllers;

import play.*;
import java.util.*;
import play.mvc.*;
import play.data.*;
import models.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("MyBookShelf First Page."));
    }

    public static Result profile() {
        return ok(profile.render(getFakeReader()));
    }

    public static Result book() {
        List<Review> reviews = new ArrayList<Review>();
        reviews.add(Review.getFakeReview());
        reviews.add(Review.getFakeReview());
        return ok(views.html.book.render(Book.getFakeBook()));
    }

    public static Reader getFakeReader() {
        Reader reader = new Reader("Shai Fisher");
        reader.picUrl = "http://simania.co.il/images/users/5055.jpg";
        Book book = new Book(1);
        book.name = "Crime and Punishment";
        book.picUrl = "http://upload.wikimedia.org/wikipedia/en/4/4b/Crimeandpunishmentcover.png";
        book.author = "Fyodor Dostoyevsky";
        reader.addBook(book);
        book = new Book(1);
        book.name = "War and Peace";
        book.picUrl = "http://upload.wikimedia.org/wikipedia/commons/a/af/Tolstoy_-_War_and_Peace_-_first_edition%2C_1869.jpg";
        book.author = "Leo Tolstoy";
        reader.addBook(book);
        return reader;
    }

    public static Book getFakeBook() {
        Book book = new Book(1);
        book.name = "Crime and Punishment";
        book.picUrl = "http://upload.wikimedia.org/wikipedia/en/4/4b/Crimeandpunishmentcover.png";
        book.author = "Fyodor Dostoyevsky";

        return book;
    }
}
