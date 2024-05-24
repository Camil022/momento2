package momento2;

import java.util.ArrayList;

public class Item {
    private String name;
    private String author;
    private String synopsis;
    private int likes;
    private ArrayList<String> comments;

    public Item(String name, String author, String synopsis) {
        this.name = name;
        this.author = author;
        this.synopsis = synopsis;
        this.likes = 0;
        this.comments = new ArrayList<>();
    }

    public void like() {
        likes++;
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

    @Override
    public String toString() {
        return "Nombre: " + name + "\nAutor: " + author + "\nSinopsis: " + synopsis + "\nMe gusta: " + likes + "\nComentarios: " + comments;
    }
}
