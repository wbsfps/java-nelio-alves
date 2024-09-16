package secao13.exercicios.segundo.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private static SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> comments = new ArrayList<>();

    public Post(){}

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }
    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    public Date getMoment() {
        return moment;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Integer getLikes() {
        return likes;
    }

    public List<Comment> getComments() {
        for (Comment c : comments) {
            System.out.println(c);
        }
        return comments;
    }


    @Override
    public String toString() {
        return String.format("%s \n%d Likes - %tc\n%s\nComments: %s", title, likes, moment, content, getComments());
    }
}
