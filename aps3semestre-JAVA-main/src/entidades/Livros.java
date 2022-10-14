package entidades;

public class Livros {

    // ATRIBUTOS

    private int Idlivro;

    private String title;
    private String isbn;
    private Editoras publisher_id;
    private float price;

    // CONSTRUCTOR
    public Livros(String title, String isbn, float price) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;
    }

    // GETTERS
    public String getTitle() {
        return title;
    }
    public String getIsbn() {
        return isbn;
    }
    public Editoras getPublisher_id() {
        return publisher_id;
    }
    public float getPrice() {
        return price;
    }

    // SETTERS
    public void setTitle(String title) {
        this.title = title;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setPublisher_id(Editoras publisher_id) {
        this.publisher_id = publisher_id;
    }
    public void setPrice(float price) {
        this.price = price;
    }
}
