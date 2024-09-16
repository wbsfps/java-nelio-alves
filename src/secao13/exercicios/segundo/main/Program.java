package secao13.exercicios.segundo.main;

import secao13.exercicios.segundo.entities.Comment;
import secao13.exercicios.segundo.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");

        Post post = new Post(
                s1.parse("21/06/2018 13:05:44")
                , "Traveling to New Zealand",
                "I'm going to visit this wonderful country", 12);

        post.addComment(c1);
        post.addComment(c2);

        List<Post> posts = new ArrayList<>();
        posts.add(post);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the force be with you");

        Post p2 = new Post(
                s1.parse("28/07/2018 23:14:19"),
                "Good night guys!",
                "See you tomorrow",
                5);
        p2.addComment(c3);
        p2.addComment(c4);
        posts.add(p2);

        posts.stream().forEach(System.out::println);

        sc.close();
    }
}
