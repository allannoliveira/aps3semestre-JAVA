package entidades;

public class Autores {

    // ATRIBUTOS
    private int author_id;
    private String name;
    private String fname;


    // CONSTRUCTOR
    public Autores(String name, String fname) {
        this.name = name;
        this.fname = fname;
    }

    // GETTERS
    public int getAuthor_id() {
        return author_id;
    }
    public String getName() {
        return name;
    }
    public String getFname() {
        return fname;
    }

    // SETTERS
    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
}
