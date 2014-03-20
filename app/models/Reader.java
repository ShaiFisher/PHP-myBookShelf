package models;

//import java.io.Console;
//import java.lang.Exception;
import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
//import play.data.format.*;
import play.data.validation.*;

  /**
 * Created by Plato on 3/18/14.
 */
@Entity
public class Reader extends Model {
    @Id
    @Constraints.Min(1000)
    public long id;
    public String name;
    public String picUrl;
    public List<Book> books;
    public List<Reader> friends;


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
