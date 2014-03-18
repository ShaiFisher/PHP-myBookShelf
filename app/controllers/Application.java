package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("MyBookShelf First Page."));
    }

    public static Result profile() {

        return ok(profile.render(getFakeReader()));
    }

    public static Reader getFakeReader() {
        Reader reader = new Reader("Shai Fisher");
        reader.setPicUrl("http://simania.co.il/images/users/5055.jpg");
        Book book = new Book(1);
        book.setName("Crime and Punishment");
        book.setPicUrl("http://upload.wikimedia.org/wikipedia/en/4/4b/Crimeandpunishmentcover.png");
        book.setAuthor("Fyodor Dostoyevsky");
        reader.addBook(book);
        book = new Book(1);
        book.setName("War and Peace");
        book.setPicUrl("http://upload.wikimedia.org/wikipedia/commons/a/af/Tolstoy_-_War_and_Peace_-_first_edition%2C_1869.jpg");
        book.setAuthor("Leo Tolstoy");
        reader.addBook(book);
        return reader;
    }
}
