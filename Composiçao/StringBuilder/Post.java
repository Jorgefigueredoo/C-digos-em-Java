package Composiçao.StringBuilder;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Post {

    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List <Comment> comments = new ArrayList()<>();

    public Post(Date moment, String title, String content, Integer likes, List<Comment> comments) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
        this.comments = comments;
    }
}
