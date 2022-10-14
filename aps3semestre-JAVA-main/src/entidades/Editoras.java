package entidades;

public class Editoras {

    // ATRIBUTOS
    private int publisher_id;
    private String name;
    private String url;

    // CONSTRUCTOR
    public Editoras(String name, String url) {
        this.name = name;
        this.url = url;
    }

    // GETTERS
    public int getPublisher_id() {
        return publisher_id;
    }
    public String getName() {
        return name;
    }
    public String getUrl() {
        return url;
    }

    // SETTER
    public void setPublisher_id(int publisher_id) {
        this.publisher_id = publisher_id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
