package Model;

import java.util.ArrayList;
import java.util.List;

public class Recipe {


    private int readyInMinutes ;
    private String sourceUrl;
    private String image;
    private String author ;
    private Long id ;
    private String title ;
    // -------------------------------



    // ------------------------------
    private int servings ;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }



    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    private int ratings ;


    private List technologies = new ArrayList<>();

    public int getReadyInMinutes() {
        return readyInMinutes;
    }

    public void setReadyInMinutes(int readyInMinutes) {
        this.readyInMinutes = readyInMinutes;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Recipe(int readyInMinutes, String sourceUrl, String image, int servings, String author , Long id, String title,int ratings) {
        this.readyInMinutes = readyInMinutes;
        this.sourceUrl = sourceUrl;
        this.image = image;
        this.servings = servings;
        this.author = author;
        this.id = id;
        this.title = title;
        this.ratings = ratings;
    }

    public Recipe( ) {

    }





}
