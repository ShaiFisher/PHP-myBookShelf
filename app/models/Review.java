package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Plato on 3/19/14.
 */
@Entity
public class Review extends Model {
    @Id
    @Constraints.Min(1000)
    public int id;
    public int userId;
    public int bookId;
    public String reviewText;
    public int rate;




    public static Review getFakeReview() {
        Review review = new Review();
        review.id = (int)(Math.random()*100);
        review.userId = (int)(Math.random()*100);
        review.bookId = (int)(Math.random()*100);
        review.rate = (int)(Math.random()*5);
        review.reviewText = "There was a time in my life when I couldn’t get enough of reading Dostoevsky. Maybe because his books made me think so deeply about being human and how we choose to live our lives. I began with Crime and Punishment, probably the work he is best known for. What I remember is being fascinated by Dostoevsky’s brilliant understanding of human nature. I remember thinking what a deep study this book was; an incredible examination of a man who commits murder and how he is “punished” for it.";
        return review;
    }
}


