package mailov.jhieyme;

public class Item {


    private String id;

    private String numero;

    private String image;


    public Item(){}


    public Item(String id, String numero, String image) {
        this.id = id;
        this.numero = numero;
        this.image = image;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
