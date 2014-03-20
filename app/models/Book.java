package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.*;

/**
 * Created by Plato on 3/18/14.
 */
@Entity
public class Book extends Model {
    @Id
    @Constraints.Min(1000)
    public int id;
    public String name;
    public String author;
    public String picUrl;
    public List<Review> reviews;


    public Book(int id) {
        this.id = id;
    }

    public Book(int id, String name, String author, String picUrl) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.picUrl = picUrl;
    }




    public static Book getFakeBook() {
        Book book = new Book(1,
                "Crime and Punishment",
                "Fyodor Dostoyevsky",
                "http://upload.wikimedia.org/wikipedia/en/4/4b/Crimeandpunishmentcover.png"
                );
        book.reviews = new ArrayList<Review>();
        book.reviews.add(Review.getFakeReview());
        book.reviews.add(Review.getFakeReview());
        return book;
    }
}
